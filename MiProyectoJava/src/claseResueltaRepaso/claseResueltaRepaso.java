package claseResueltaRepaso;

import java.util.Scanner;


public class claseResueltaRepaso {

   
    public static void main(String[] args) {
        e1();
    }
    public static void e3(){
        String operacion="";
        double num1=0,num2=0,resultado=0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese operacion a realizar (Sumar, Restar, Multiplicar, Dividir, Potenciar)");
        operacion= lector.next();
        System.out.println("Ingrese Numero 01");
        num1=lector.nextDouble();
        System.out.println("Ingrese Numero 02");
        num2=lector.nextDouble();
        switch (operacion) {
            case "Sumar":
                resultado=num1+num2;
                break;
            case "Restar":
                resultado=num1-num2;
                break;
            case "Multiplicar":
                resultado=num1*num2;
                break;
            case "Dividir":
                if(num2==0)
                    System.out.println("Divicion entre 0. invalida");
                else
                    resultado=num1/num2;
                break;
            case "Potenciar":
                resultado=Math.pow(num1, num2);
                break;
            default:
                break;
        }
        System.out.printf("El resultado de %s %.2f y %.2f es: %.2f%n",operacion,num1,num2,resultado);
        
    }
    public static void e2(){
        String marca="";
        int plazo=0;
        double precio=0,plan=0, descuento=0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese La marca del Celular: ");
        marca=lector.next();
        System.out.println("Ingrese el plazo en meses (6,12,18)");
        plazo = lector.nextInt();
        switch (marca) {
            case "Motorola":
                precio=29.90;
                break;
            case "LG":
                precio=36.0;
                break;
            case "Samsung":
                precio=46.80;
                break;
            case "Huawei":
                precio=62.0;
                break;
            case "iPhone":
                precio=71.0;
                break;
            default:
                break;
        }
        switch (plazo) {
            case 6 :                
                descuento=13.2/100;
                break;
            case 12 :                
                descuento=12/100;
                break;
            case 18 :                
                descuento=11.2/100;
                break;
            default:
                break;
        }
        plan = precio * (1-descuento);
        System.out.printf("La marca %s, tiene un precio de %.2f, con un descuento del %.2f%%,Plan aplicando descuento: %.2f%n",marca,precio,descuento*100,plan);
    }
    public static void e1(){
       String figura="";
       int lado=0, base=0, altura=0, radio=0;
       double area=0;
       Scanner lector = new Scanner(System.in);
       System.out.println("Ingrese figura");
       figura = lector.next();
       if(figura.equals("Cuadrado") || figura.contains("Cua")){
           System.out.println("Ingrese el lado del cuadrado");
           lado=lector.nextInt();
           area = lado * lado;
       }else{
           if(figura.equals("Triangulo") || figura.contains("Tri")){
               System.out.println("Ingrese base");
               base=lector.nextInt();
               System.out.println("Ingrese altura");
               altura = lector.nextInt();
               area = base * altura /2;
           }else{
               if(figura.equals("Rectangulo") || figura.contains("Rec")){
                    System.out.println("Ingrese base");
                    base=lector.nextInt();
                    System.out.println("Ingrese altura");
                    altura = lector.nextInt();
                    area = base * altura;
               }else{
                   if(figura.equals("Circulo") || figura.contains("Cir")){
                        System.out.println("Ingrese el radio");
                        radio = lector.nextInt();
                        area=3.14*radio*radio;
                   }else{
                       System.out.println("Ingrese una figura valida");
                   }
               }
           }
       }
        System.out.printf("El area de la figura %s es: %.2f %n",figura,area);  
    }
            
}
