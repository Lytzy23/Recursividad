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
public class Ejercicio_recursividad_DDR_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //es la variable que se va a declarar
        int numero = 123;
        //se imprime el resultado de la condición
        System.out.println(sumaDigitos(numero));
    }
    //Es la estructura de la función
    public static int sumaDigitos(int numero){
        //inicia la condición usando los datos ingresados en la variable
        if(numero < 10){
            //devuelve el numero
            return numero; 
            //entonces 
        }else{
            //toma el digito y llama a la funcion
            return (numero % 10) + sumaDigitos(numero/10); 
        }
    } 
}
