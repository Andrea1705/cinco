/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author maria
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
/*
Solicitar al usuario que ingrese el radio de un círculo en informar el área
*/

        Scanner teclado = new Scanner (System.in);

        System.out.println("Para saber el área de un círculo, por favor ingrese su radio en cm: ");  
        double radio = teclado.nextDouble(); 
        
        
        final double PI = 3.14;
        double area = PI * (radio * radio);
        
        DecimalFormat df = new DecimalFormat ("#.##");
        String areaFormateada = df.format (area);
     
        System.out.println("El área del círculo es: " + areaFormateada);
       
                

/* Se pide que ingrese por consola dos párrafos y muestre por pantalla lo siguiente:
    1. Los párrafos, ¿son iguales con el operador relacional ==?
    2. Los párrafos, ¿poseen el mismo contenido? Sin importar si están en mayúsculas o
    minúsculas.
    3. Mostrar los párrafos en mayúsculas.
    4. Mostrar los párrafos en minúsculas.
    5. Mostrar la primera letra en mayúscula de cada párrafo.
    6. Unir los párrafos con una coma.
*/


        Scanner teclas = new Scanner (System.in);
     
        System.out.println("Ingrese a continuación un párrafo: ");
        String parrafo = teclas.nextLine();
        
        parrafo = parrafo.toUpperCase();
        System.out.println(parrafo);
        
        parrafo = parrafo.toLowerCase();
        System.out.println(parrafo);
        
        parrafo = parrafo.substring(0,1).toUpperCase()+ 
                  parrafo.substring(1).toLowerCase();
        System.out.println(parrafo);
        
        
        System.out.println("Ingrese a continuación otro párrafo: ");
        String parrafo2 = teclas.nextLine();
        
        parrafo2 = parrafo2.toUpperCase();
        System.out.println(parrafo2);
        
        parrafo2 = parrafo2.toLowerCase();
        System.out.println(parrafo2);
        
        parrafo2 = parrafo2.substring(0,1).toUpperCase()+ 
                   parrafo2.substring(1).toLowerCase();
        System.out.println(parrafo2);
        
        
        System.out.println(parrafo + "," + " " + parrafo2);
        
       
        System.out.println(parrafo.equals(parrafo2));
        
        System.out.println(parrafo2.equalsIgnoreCase(parrafo));
        

/*Crear un programa que solicite al usuario que ingrese su primer nombre y su apellido
luego mostrarlo por consola, por separado, indicando cuál es su apellido primero y 
luego debajo entre comillas dobles, su nombre
Nombre y apellido deben ir con la primer letra en mayúscula
*/
 
        Scanner teclados = new Scanner (System.in);

        System.out.println("Por favor ingrese su primer nombre, luego presione enter:");
        String nombre = teclados.next();
        nombre = "\"" + nombre.substring(0,1).toUpperCase()+
                         nombre.substring(1).toLowerCase()+ "\"";
        
        System.out.println("Por favor ingrese su primer apellido, luego presione enter ");
        String apellido = teclados.next();
        apellido = apellido.substring (0,1).toUpperCase()+ 
                   apellido.substring(1).toLowerCase();
        
        System.out.println("Su primer apellido es: " + apellido);
        System.out.println("Su primer nombre es: " + nombre);
              
        
  
        
        
    }
    
}
