package practicandoSwitch;
import java.util.Scanner;

public class practicandoSwitch {

  
    public static void main(String[] args) {
        int saldo =1000 , cantidadFinal=0;
          System.out.println("""
                           1:Ver saldo
                           2:Depositar dinero 
                           3:Retirar dinero 
                           4:Salir 
                            """);
        System.out.println("Ingrese un numero (1-4) para cada opcion : ");
        Scanner lector = new Scanner (System.in);
        int opcion =lector.nextInt();
      
        switch (opcion) {
            case 1: 
                System.out.printf(" Su saldo en su cuenta es  %d\n "  ,saldo  );
                
                cantidadFinal=saldo;
                break;
            case 2 :
                 System.out.println(" ingrese el  monto que desee depositar ");
                 int deposito=lector.nextInt();
                 cantidadFinal=deposito+ saldo;
                 break;
            case 3 :
                System.out.println("Cuanto dinero desea retirar?");
                int retiro= lector.nextInt();
                if (retiro>saldo) {
                    System.out.println("No tiene dinero suficiente para realizar esta operacion");
                  cantidadFinal=saldo;
                }else {
                    cantidadFinal=saldo-retiro;
                }
                break;
            case 4 :
                System.out.println("Gracias por usar el sistema");
                break;
            default :
                System.out.println("OPCION INVALIDA ");
               break;
        }
        
        if (opcion>4 )  {
            System.out.println("INGRESE SOLO LOS NUMEROS DEL 1 AL 4");
        }else {
          System.out.printf("usted tiene %d en su cuenta  " ,cantidadFinal );  
        }
         
        
     
    }
    
}
