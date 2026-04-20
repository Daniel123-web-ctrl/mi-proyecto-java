package estructuraCondicionalSwitchCase;

import java.util.Scanner;
public class estructuraCondicionalSwitchCase {

    
    public static void main(String[] args) {
        int puntuacion=0;
        String descripcionEvaluacion="";
        System.out.println("Ingrese la puntuacion del estudiante");
        Scanner lector= new Scanner (System.in);
        puntuacion=lector.nextInt();
        descripcionEvaluacion=switch(puntuacion) {
        case 0,1,2,3,4-> "descartado ";
        case 5 -> "en suspenso";
        case 7,8 ->"notable";
        case 9,10 ->"sobresaliente";
        default -> "valor no valido";
    };
         System.out.printf("el aluimno esta en un rango de %s " ,descripcionEvaluacion);
    }
    
}
