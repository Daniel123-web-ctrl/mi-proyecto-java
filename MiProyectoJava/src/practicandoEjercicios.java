import java.util.Scanner;
public class practicandoEjercicios {

   
    
    public static void main(String[] args) {
        
        int montoCompra =0;
        double descuento1=0 ,descuento2=0 , aumento=0 ,montoFinal=0,pago=0;
        boolean membresia =false;
        
        
        Scanner  lector =new Scanner(System.in);
        System.out.println("ingrese el monto de compra");
        montoCompra= lector.nextInt();
        if(montoCompra>500) {
            descuento1=montoCompra*0.1;
            pago=montoCompra-descuento1;
            System.out.println("tiene membresia?");
            membresia= lector.nextBoolean();
            if (!membresia) {
                montoFinal=pago*;
                System.out.println("el monto final a pagar sera : " + montoFinal);
            }
            else {
                System.out.println("El monto final a pagar sera :" +pago);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
