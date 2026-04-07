/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miproyectojava;
import java.util.Scanner;
/**
 *
 * @author daniel donin
 */
public class MiProyectoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sexo ="";
        int edad = 0 ;
        Scanner lector= new Scanner (System.in);
        
        
         System.out.println("ingrese el sexo de la persona :  ");
         sexo = lector.nextLine();
         if ( sexo.equalsIgnoreCase("masculino")) {
             System.out.println("ingrese la edad de la persona ");
         }
    }
    
}
