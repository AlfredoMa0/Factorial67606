/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial.pkg67606;

import java.util.Scanner;

/**
 *
 * @author Campe
 */
public class Factorial67606 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int factorial = 1;
         int numero = 0;
         
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESA UN VALOR:");
        numero=leer.nextInt();
        
       
       
        while (numero!=0) {
            factorial*=numero;
            numero--;
        }
        System.out.println(" LA FACTORIAL ES: " + "" + factorial);
        
    }
    
}
