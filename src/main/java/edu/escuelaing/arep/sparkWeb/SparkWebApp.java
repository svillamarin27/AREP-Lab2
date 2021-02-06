package edu.escuelaing.arep.sparkWeb;

import static spark.Spark.*;
/**
public class SparkWebApp {

	public static void main(String[] args) {
		port(getPort());
		get("/villamarin", (req, res) -> "Hello Herssoku");
	}
	static int getPort() {
		 if (System.getenv("PORT") != null) {
			 return Integer.parseInt(System.getenv("PORT"));
		 }
		 return 4567; //returns default port if heroku-port isn't set
		 }
}
*/
import spark.Request;
import spark.Response;
import static spark.Spark.*;
import java.awt.List;

import edu.escuelaing.arep.sparkWeb.Calculos.app.App;
import edu.escuelaing.arep.sparkWeb.Calculos.util.*;

/**
 * Minimal web app example for Heroku using SparkWeb
 *
 * @author SebastianVillamarin
 */


public class SparkWebApp {
     /*
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     *hello relative URL.
    */
     
    public static void main(String[] args) {
        port(getPort());
        get("/villamarin", (req, res) -> inputDataPage(req, res));
        get("/resultados", (req, res) -> resultsPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
    	String page
			="<!DOCTYPE html>" 
			+"<html>"
			+"<body style=\"background-color:#F8F9C1;\">" 
			+"<font align=\"center\" color=\"Olive\" face=\"Comic Sans MS,arial\">"
			+ "<h1>Calculadora para hallar la media y desviacion estandar</h1>"
			+ "<h2>Ingrese los numeros separados por un punto y coma (;) </h2>" 
			+ "<form action='/resultados\'>" 
			+ "<input type=\"text\" name='data'>"
			+ "<input type=\"submit\" value=\"Calcular\">"  
			+ "</form>" 
			+ "</body>"
			+ "</html>";
		return page;
    }

    private static String resultsPage(Request req, Response res) {
		LinkedList<Double> listan=new LinkedList<Double>();
		String [] valores=req.queryParams("data").split(";");
		for(String i:valores) {
			listan.add(Double.parseDouble(i));
		}
		String resp = "<!DOCTYPE html>" 
				+"<html>"
				+"<body style=\"background-color:#F8F9C1;\">"
				+"<font align=\"center\" color=\"Olive\" face=\"Comic Sans MS,arial\">"
				+ "<h2>"+ "El resultado de la media es: " + App.media(listan) + "<h2>"
				+ "<h2>"+ "El resultado de la desviacion estandar: " + App.desviacion(listan) + "<h2>"
				+ "</body>"
				+ "</html>";
		return resp;
	}

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
     
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}


