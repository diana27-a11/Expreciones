/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresion;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Expresion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("introduce notacion");
    Scanner sc = new Scanner(System.in);
    String notacion=sc.nextLine();

    //se llama al metodo postFija introduciendo como parametro la cadena ingresada por el usuario
    System.out.println(postFija(notacion));

}

public static char[] postFija(String infija)
{
    /**
     * variable organizada de mayor a menor jerarquia
     */
    String jerarquia="^*/+- ";

    /**
     * variable para recorrer la posicion de la cadena infija
     */
    int pos_infija=0;
    /**
     * variable para recorrer la posicion de la variable jerarquia
     */
    int pos_jer=0;

    /**
     * creacion de un array para introducir los elementos de infija
     */
    char array[]=new char[infija.length()];

    /**
     * se introduce cada elemento de infija al array
     */
    for(int i=0;i<array.length;i++)
    {
        array[i]=infija.charAt(i);
    }

    /**
     * mientras la posicion de jerarquia no llegue a la posicion final de la variable jerarquia
     */
    while(pos_jer!=jerarquia.length()-1)
    {
        /**
         * Prueba de pantalla
         */
        /*for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }*/
        //System.out.println("");

        /**
         * se valida si la posicion de la variable infija esta en el elemento final de dicha variable (infija)
         * en caso de ser verdadero, reestablecera la posicion y aumentara en 1 la posicion de la variable jerarquia
         */
        if(pos_infija==infija.length() )
        {
            pos_infija=0;
            pos_jer++;
        }

        /**
         * se compara el elemento de la notacion infija y la variable jerarquia
         * 
         */
        if(infija.charAt(pos_infija) == jerarquia.charAt(pos_jer) )
        {
            char aux = ' ';

            /**
             * se hace un "swap"
             */
            aux=array[pos_infija];

            array[pos_infija]=array[pos_infija+1];
            array[pos_infija+1]=aux;

            /*for(int i=0;i<array.length;i++)
            {
                System.out.print(array[i]+" ");
            }*/
        }
        /**
         * se incrementa en 1 la posicion de la notacion infija para volverla a comparar
         */
        pos_infija++;
    }


    return array;
}

    }
    

