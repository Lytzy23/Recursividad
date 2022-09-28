/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos.apps_lytzy;

/**
 *
 * @author ADA UwU
 */
public class Ejercicio_recursividad_DDR_9 {

    /**
     * @param args the command line arguments
     */
    //estrutura de la función
    public static void main(String[] args) {
        //se declaran las variables asignando sus respectivos valores
        int base = 10;
        int exponente = -2;
        //imprime el resultado de la función con el respectivo uso de las variables
        System.out.println(potencia(base, exponente));
    }
    //es la función llamada potencia que tiene las varibles 
    public static double potencia(int base, int exponente) {
        //inicia la condición haciendo uso de las variables. 
        if (exponente == 0) {
            //si exponente es igual a 0 devualva 0. 10^0 = 1
            return 1; 
            //entonces si exponente es igual a 1 
        } else if (exponente == 1) {
            //10^1 = 10 decuelve el valor ingresado en la variable exponente
            return base; 
            //entonces si el valor ingresado en la variable base es menor a cero, es decir un número exponente negativo.
        } else if (exponente < 0) { 
            // hace la siguiente operación  
            return potencia(base, exponente + 1) / base;
            //entonces 
        } else {
            //devuelve la muliplicación del valor que tiene la variable base por lo que tiene la función potencia
            return base * potencia(base, exponente - 1);
        }
    }   
}
