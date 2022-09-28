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
public class Ejercicio_recursividad_DDR_8 {

    /**
     * @param args the command line arguments
     */
    //estrutura de la función
    public static void main(String[] args) {
        //se declaran las variables asignando sus respectivos valores
        String palabra = "Hola";
        //imprime el resultado de la función con el respectivo uso de la variable
        System.out.println(invertirPalabra(palabra, palabra.length()-1));
    }
    //es la función llamada invertirPalabra que tiene la varible. 
    public static String invertirPalabra(String palabra, int longitud){
        //inicia la condición. si la longitud (es decir la cantidad de caracteres que tenga la palbra) es igual a 0
        if(longitud==0){
            //devuelve la canidad de caracteres que tiene la palabra mas la palabra
            return palabra.charAt(longitud)+"";
            //entonces
        }else{
            //devuelva la palabra invertida
            return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
        }
    }  
}
