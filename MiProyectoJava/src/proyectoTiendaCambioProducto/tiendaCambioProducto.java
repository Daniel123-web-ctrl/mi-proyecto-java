package proyectoTiendaCambioProducto;
import java.util.Scanner;

public class tiendaCambioProducto {

 
    public static void main(String[] args) {
            Scanner lector= new Scanner (System . in );
        int opcion=0 ;
        System.out.println("""
                          
                 Bienvenido a  nuesrtro cafe
                 Estas som nuestras opciones
                 1: Cafe Amerciano
                 2:Cafe Late 
                 3:Capuchino
                 4:Te chay 
                           
                
                   """);
        System.out.println("Ingrese cualqiera de nuestras opciones");
        opcion=lector.nextInt();
        switch (opcion)  {
            case 1:
                
            System.out.println("el producto tiene un precio de  soles ");
              break;
            case 2:
                
            System.out.println("el producto tiene un precio de  dolares ");
            break;
            case 3:
                
            System.out.println("el producto tiene un precio de  euros ");
            break;
            default: {
            System.out.println("opcion invalida");
                        
                        }
        }
       
             
    }
    
}
