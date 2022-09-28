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
public class Ejercicio_recursividad_DDR_5 {

    /**
     * @param args the command line arguments
     */
    //estrutura de la función
    public static void main(String[] args) {
        //se declara la variable asignando su respectivo valor
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        //llamada inicial
        recorrerMatrizRecursivo(m, 0, 0);
    }
    //inicia la función recorrerMatrizRecursivo
    public static void recorrerMatrizRecursivo(int[][] m, int i, int j) {
        //se muestra el numero (sin salto de linea)
        System.out.print(m[i][j] + " ");
        //inicia la condición si i es diferente de la longitud de m -1 o j es diferente de la pocision de la longitud de m -1
        if (i != m.length - 1 || j != m[i].length - 1) {
            //Indico si llego al final de la fila
            if (j == m[i].length - 1) {
                //Paso a la siguiente fila
                i++;
                //Reinicio la j
                j = 0;
                //Salto de linea (solo formato)
                System.out.println("");
            } else {
                //Paso a la siguiente columna
                j++;
            }
            //Volvemos a llamar la función recursivamente
            recorrerMatrizRecursivo(m, i, j);
        }
    }  
}
