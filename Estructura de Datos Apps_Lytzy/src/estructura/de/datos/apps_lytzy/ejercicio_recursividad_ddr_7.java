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
public class ejercicio_recursividad_ddr_7 {

    /**
     * @param args the command line arguments
     */
    //estrutura de la función
    public static void main(String[] args) {
        //se declara la variable asignando su respectivo valor
        int a = 254; //400 + 50 + 2
        //imprime el resultado de la función con el respectivo uso de la variable
        System.out.println(invertirNum(a, 2));
    }
    //es la función llamada invertirNum que tiene dos paremetros int num, int pos.
    public static int invertirNum(int num, int pos){
        //Si el numero es menor que 10 devuelve el ultimo numero
        if(num < 10){
            //devuelve el numero que se asignó a la variable
            return num;
        //entonces     
        }else{
            //modulo del numero y se multiplica por la potencia (4 * 100) por ejemplo
            return (num % 10) * (int) Math.pow(10, pos) + (invertirNum(num/10, pos-1));
        }
    }   
}
