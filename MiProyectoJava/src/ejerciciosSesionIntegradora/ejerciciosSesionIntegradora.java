package ejerciciosSesionIntegradora;
 import java.util.Scanner;

public class ejerciciosSesionIntegradora {

    
    public static void main(String[] args) {
       /*
         Integer nota;
         String mencion;
         Scanner lector=new Scanner(System.in);
         System.out.println("Ingrese nota (0-20)");
         nota =lector.nextInt();
         mencion=switch(nota){
             case Integer c when (c>18 && c<=20)->"Excelente";
             case Integer c when (c>15 && c<=18)->"bueno ";
             case Integer c when (c>=13 && c<=15)->"Regular";
             case Integer c when (c<13 && c>=0)->"deficiente";
             default-> "nota invalida ";
                 
         };
              System.out.printf("usted obtuvo la mencion de %s " ,mencion);  
       */
       int operacion;
       int num1;
       int num2;
       double resultado =0;
         System.out.println("ingrese  cualquier numero entero ");
         Scanner lector =new Scanner (System.in);
        num1=lector.nextInt();
        System.out.println("ingrese  otro  numero entero ");
        num2=lector.nextInt();
        System.out.println("""
                           > 1:suma
                           > 2:resta
                           > 3:multiplicacion
                           > 4:division
                           """);
        System.out.println("ingrese la operacion que desee realizar : ");
        operacion=lector.nextInt();

        resultado =switch(operacion) {
            case 1->  num1+num2;
            case 2 -> num1-num2;
            case 3->num1*num2;
            case 4 ->  {
                  if(num2==0)  {
                      System.out.println("el divisor es 0 aasi que no se puede dividir entre 0");
                      yield 0;
                  }else {
                      yield (double)num1/num2;
                  }
            }
            default ->{
            System.out.println("operacion invalida ");
            yield 0;
            }          
              
            
       };
        System.out.printf("El resultado de la operacion es %2f", resultado);
    }
    
}
