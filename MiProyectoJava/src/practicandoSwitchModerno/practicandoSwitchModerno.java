package practicandoSwitchModerno;

import java.util.Scanner;
public class practicandoSwitchModerno {

    public static void main(String[] args) {
        int numero =0;
       String  sale="";
        System.out.println("ingrse un numero del 1-10");
        Scanner lector= new Scanner(System.in);
        numero=lector.nextInt();
        sale=switch(numero){
        case 1,2,3,4->"defensa";
        case 5,6,7,8->"medio"; 
        case 9,10->"delantero";
        default ->"numero incorrecto";
    };
        System.out.println(sale);
    }
    
}
