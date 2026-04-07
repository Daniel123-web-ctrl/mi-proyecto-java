/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectosemana3s6;
import java.util.Scanner;

/**
 *
 * @author daniel donin
 */
public class miproyectosemana3s6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int precioProducto=0;
        int numeroDia=0;
        Scanner lector =new Scanner(System.in);
        System.out.println("ingrese el precio del producto");
        precioProducto=lector .nextInt();
        if (precioProducto>50 && precioProducto<80)  {
            System.out.println("ingrese el numero de dia (1-7)");
            numeroDia=lector.nextInt();
            if (numeroDia== 1){
                System.out.println("si procede el cambio");
            }
            else if(numeroDia !=1){
                System.out.println("no procede el cambio");
            }
        
    
        }
        else if (precioProducto >= 120 ){
            System.out.println("ingrese el numero de dia (1-7)");
            numeroDia=lector.nextInt();
            if (numeroDia == 1||numeroDia == 2||numeroDia == 5||numeroDia == 6||numeroDia == 7){
                System.out.println("procede el cambio del producto");
            }
            else {
                System.out.println("no procede el cambio del producto");
            }
        }
        
        
    }
    
}
