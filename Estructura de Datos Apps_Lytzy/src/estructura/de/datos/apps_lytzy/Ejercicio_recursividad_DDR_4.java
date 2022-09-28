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
public class Ejercicio_recursividad_DDR_4 {

    /**
     * @param args the command line arguments
     */
    //estrutura de la función
    public static void main(String[] args) {
        //se declaran las variables asignando su respectivo valor
        int[] array={1,2,3,4,5};
        int elementoBuscar=3;
        //el valor de esta variable es el resultado de función con las variables
        int posElementoEncontrado=posicionElementoRecursivo(array, elementoBuscar,0);
        //imprime el resultado de la variable.
        System.out.println(posElementoEncontrado);
    }
    //inicia la función llamada posicionElementoRecursivo
    public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){
        //inicia la condición que si indice es igual a la longitud del arreglo o el indice del arreglo es igual al valor buscado en la variable elementoBuscar 
        if(indice==array.length || array[indice]==elementoBuscar){
            //si indice es igual a la longitud del arreglo
            if(indice==array.length){
                //devuelve -1
                return -1;
            }
            //entonces
            else{
                //devuelve el indice
            return indice;
            }
        }   //entonces
            else{
            //devuelve el resultado de la función
            return posicionElementoRecursivo(array, elementoBuscar, indice+1);
            }
    }   
}
