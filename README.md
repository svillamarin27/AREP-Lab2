# HEROKU: INTÉRPRETES, CANALES DE COMUNICACIÓN Y MEMORIA
# Profesor: Luis Daniel Benavides
# Arquitecturas Empresariales 2021-1

[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://calm-tor-18625.herokuapp.com/villamarin)
[![CircleCI](https://circleci.com/gh/svillamarin27/CVDS2-LAB6-2020-2.svg?style=svg)](https://app.circleci.com/pipelines/github/svillamarin27/AREP-Lab2)

Este laboratorio tiene como objetivo principal desarrollar una aplicación web con Spark que calcule el promedio y la desviación estándar de un conjunto de números , esta lista de números debe ser obtenido desde un formulario en la página web y para realizar los cálculos debe usar una LinkedList implementada por mi propia cuente y esta debe ser compatible con la API de colecciones de Java.

# Prerrequisitos
Para el desarrollo de este laboratio se debe utilizar Maven como una herramienta para la construcción y gestión del laboratorio, el código fue desarrollado con el lenguaje de programación Java; por lo tanto se requiere para su ejecución tener estas versiones :
  - Maven versión 3.5 o superior
  - Java versión 8 o superior
  
# Uso

Después de descargar o clonar el repositorio del laboratoio, se debe utilizar el comando **mvn package** para generar el ejecutable .jar con los .class compilados.

![image](https://user-images.githubusercontent.com/37603257/107104497-e7478200-67ef-11eb-96a3-e20daa820e90.png)

Para poder usar la aplicación se deben seguir los siguientes pasos :
  1. Abrir la aplicación de forma local o en heroku y escribir números separados por punto y coma.
  
   URL de la aplicación alojada en Heroku: [![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://calm-tor-18625.herokuapp.com/villamarin)
    
   ![image](https://user-images.githubusercontent.com/37603257/107104726-dcd9b800-67f0-11eb-8de1-413907448a49.png)
  
  2. Al dar click en el boton **Calcular**, la aplicación se redirigue a otra pagina donde estan los resultados de los números ingresados.
  
  ![image](https://user-images.githubusercontent.com/37603257/107104835-67221c00-67f1-11eb-8b85-262904702b76.png)
  
# Diagramas 

![image](https://user-images.githubusercontent.com/37603257/107105117-be74bc00-67f2-11eb-9911-e226535f04ce.png)

En este diagramas de clases se evidencia que la clase SparkWebApp se encarga del Frontend de la aplicación , la cúal pedira los datos,despues de esto invoca la clase App que realiza el calculo de la media y la desviacion estandar que posteriormente los imprimira y esta a la vez hace uso de la LinkedList implementada.

# Resultados de las Pruebas

Los resultados de las pruebas se pueden visualizar al utilizar los comandos **mvn package y mvn test** .

![image](https://user-images.githubusercontent.com/37603257/107105340-c41ed180-67f3-11eb-964e-8a3fcc0eb2e7.png)

# Autor : Sebastián Camilo Villamarín Rodríguez

# Licencia

Este proyecto esta licenciado bajo la licencia General Public License v3.0, revise el archivo [LICENSE](LICENSE) para más información.
    
