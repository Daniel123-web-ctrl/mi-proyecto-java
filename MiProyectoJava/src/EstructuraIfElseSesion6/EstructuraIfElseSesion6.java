package EstructuraIfElseSesion6;

import java.util.Scanner;
public class EstructuraIfElseSesion6 {

    
    public static void main(String[] args) {
        int hora=0 , min=0 ,seg=0;
        System.out.println("ingrese la hora  ");
        Scanner lector =new Scanner (System.in);
        hora= lector.nextInt();
        System.out.println("ingrese los minutos ");
        min=lector.nextInt();
        System.out.println("ingrese los segundos ");
        seg=lector.nextInt();
        if (hora < 0 || hora > 23 || min < 0 || min > 59 || seg < 0 || seg > 59) {
    System.out.println("Error: Los valores ingresados no son válidos para un reloj de 24h.");
        }
    else   {
            System.out.println("si pasa un segundo  ");
        seg++;
        if (seg>59) {
            seg=0;
            min++;
            
            if (min>59) {
                min =0 ;
                hora ++;
                if (hora >23)
                    hora=0;
            }
        }
        System.out.printf("la hora un segundo despues :%d,%d,%d" ,hora,min,seg);
        }
        
    }
    
}
