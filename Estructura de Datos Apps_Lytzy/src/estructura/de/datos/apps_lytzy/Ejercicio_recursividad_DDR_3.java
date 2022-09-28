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
public class Ejercicio_recursividad_DDR_3 {

    /**
     * @param args the command line arguments
     */
    //estrutura de la función
    public static void main(String[] args) {
        //se declara la variable asignando su respectivo valor en este caso creamos un array
        int[] array={1,2,3,4,5}; 
        //Pasamos el array y la posicion donde empieza
        mostrarArrayRecursivo(array, 0); 
    }
    //inicia la función llamada mostrarArrayRecursivo que tiene dos parametros
    public static void mostrarArrayRecursivo(int[] array, int indice){
        /*1º forma*/
        /*
        if (indice == (array.length-1)){
            System.out.println(array[indice]);
        }else{
            System.out.println(array[indice]);
            mostrarArrayRecursivo(array, indice+1);
        }
        */
        /*2º forma*/
        if (indice != array.length){
            //Mostramos el valor en ese indice
            System.out.println(array[indice]);
            //Llamamos recursivamente a la función
            mostrarArrayRecursivo(array, indice+1);
            }
        }
    }   