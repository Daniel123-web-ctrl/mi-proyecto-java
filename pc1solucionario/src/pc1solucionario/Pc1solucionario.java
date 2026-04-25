
package pc1solucionario;
import java.util.Scanner;

public class Pc1solucionario {

    
    public static void main(String[] args) {
       Scanner  lector =new Scanner(System.in);
       e4(lector);
    }
    public static void  e1 (Scanner lector) {
        int horas=0;
        double total=0 , tarifa=0;
        System.out.println("ingrese la cantidad de horas que se estaciono ");
        horas = lector.nextInt();
        if(horas <1 ) {
            System.out.println("el pago minimo sera : \n");
            tarifa=5;
        }else {
            if (horas <=2 && horas>=1) {
                tarifa =4;
            } else if (horas >=2){
                tarifa=3.5;
                
            }
        }
        total=tarifa*horas;
        System.out.printf("horas : %d ,-Total a pagar : %.2f " ,horas,total);
    
}public static void  e2 (Scanner lector) {
    
    double promedio=0;
    String rendimiento="",finalRendimiento="";
            System.out.println("ingrese el promedio del alumno(0-20)");
            promedio=lector.nextDouble();
            if (promedio<0 && promedio >20) {
                System.out.println("Error");
            }else {
                if (promedio >=18 && promedio <=20)    {
                   rendimiento="excelente";
                    
                }else if (promedio>=14 && promedio<=17.99) {
                    rendimiento="bueno";
                }else if (promedio>=12 && promedio<=13.99) {
                    rendimiento="Regular";
                }else if (promedio>=0 && promedio<=11.99) {
                    rendimiento="bajo";
                }
            }
            finalRendimiento=rendimiento;
            System.out.printf("promedio del alumno : %.2f  nivel: %s  " ,promedio,rendimiento);
    
}public static void  e3 (Scanner lector) {
    String tipo="";
   int numeroDia=0;
            System.out.println("ingrese un numero del dia(1-7)");
            numeroDia=lector.nextInt();
            if(numeroDia>=1 && numeroDia <=7) {
                switch(numeroDia) {
                    case 1: System.out.println("lunes");
                    break;
                    case 2: System.out.println("martes");
                    break;
                    case 3: System.out.println("miercoles");
                    break;
                    case 4: System.out.println("jueves");
                    break;
                    case 5: System.out.println("viernes");
                    break;
                    case 6: System.out.println("sabado");
                    break;
                    case 7: System.out.println("domingo");
                    break;
                    
                }
                if(numeroDia>=1 && numeroDia<=5)   {
                    tipo="laborable";
                }else if(numeroDia==6  || numeroDia==7) {
                    tipo="fin de semana";
                }
                 System.out.printf("dia : %d : tipo : %s" ,numeroDia,tipo);
            }else {
                System.out.println("Error");
            }
           
}public static void  e4 (Scanner lector) {
    int opcion=0;
    String tipoUsuario="" , vigencia="" , tipo ="";
    int monto=0;
    double descuento=0,montoFinal=0;
            System.out.println("ingrese la opcion(1-3)");
            System.out.println("""
                               1-Estudiante
                               2-Docente
                               3-Administrativo
                               """);
                    
            opcion=lector.nextInt();
            switch(opcion) {
                case 1:
                tipo="estudiante";
                monto=8;
                break;
                case 2:
                    tipo="Docente";
                monto=12;
                break;
                case 3:
                    tipo="Administrativo";
                monto=10;
                break;
                default: 
                    break;
            }
            System.out.println("tiene carné vigente (S-N)?");
            vigencia=lector.next();
            if (vigencia.equals("S")) {
                descuento =monto*0.1;
            }else if(vigencia.equals("N")) {
                descuento=0;
            }
            montoFinal=monto - descuento;
            System.out.printf("Tipo de Usuario : %s \n pagara la tarifa de: %.2f\n",tipo,montoFinal);
}
    
}
