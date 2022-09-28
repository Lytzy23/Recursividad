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
public class Ejercicio_recursividad_DDR_6 {

    /**
     * @param args the command line arguments
     */
    //estrutura de la función
    public static void main(String[] args) {
        //se declaran las variables asignando su respectivo valor
        //Serie fibonacci
        // 1 1 2 3 5 8 13 21 34 55
        //llamada inicial
        int posicion = 5;
        //el valor de la variable resultado es el resultado de la función que hizo uso de la variable posicion
        int resultado = fibonacciRecursivo(posicion);
        //imprime el resultado 
        System.out.println(resultado);
    }
    //es la función llamada fibonacciRecursivo que tiene el parametro n
    public static int fibonacciRecursivo(int n) {
        //inicia la condición, si n es cero devuelve un cero de otro modo uedes poner n<=0 tambien para incluir negativos
        if (n == 0) {
            //devuelve 0
            return 0;
            //si n es 1 
        } else if (n == 1) {
            //devuelve un 1
            return 1;
            //entonces
        } else {
            //Hago la suma
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }   
}
