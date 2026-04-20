package switchMejoradoejemplo;
import java.util.Scanner;

public class switchMejoradoejemplo {

   
    public static void main(String[] args) {
        int opcion=0;
        String  opcionSeleccionada="";
        System.out.println("""
                           1:ver cartelera  
                           2:Comprar entrada 
                           3:Ver promociones 
                           4:Salir
                         """);
        System.out.println("Ingrese la opcion que desee(1-4) ");
        Scanner lector =new Scanner(System.in);
        opcion=lector.nextInt();
        opcionSeleccionada=switch(opcion){
           case 1 -> {
               yield "Peliculas disponibles : Advenger,barby";
           } 
           case 2 -> {
               yield"Compra de entradas en proceso";
           }
           case 3 -> {
               yield"Promocion 2 x 1 los miercoles";
             }
           case 4 -> {
           yield "Gracias por visitar el cine ";
           }
           default -> {
               yield"Opcion no valida";
           }
          
                   };
        System.out.printf("La opcion seleccionada es %s ",opcionSeleccionada);
    }
    
}
