
import java.util.Scanner;

public class semana5PracticaParaPc {

    
    public static void main(String[] args) {
         Scanner lector=new Scanner (System.in);
      e6(lector);  
    }
    public static void e1(Scanner lector) {
        int precio=0 ;
        String marca="", plazo="";
        double descuento=0,precioFinal=0;
       
    System.out.println("ingrese la marca del televisor ");
        marca=lector.next();
        switch (marca) {
            case "LG": precio=1200;
              break;
            case "Samsumg": precio=2200;
              break;
            case "Sony": precio=2000;
              break;
            case "Hisense": precio=3000;
              break;
            default :System.out.println("marca desconocida");
                break;
           }
        lector.next();
        if(precio!=0) {
       System.out.println("ingrese un plazo de pago en meses");
         System.out.println("""
                           6 meses:12% de descuento
                           12 meses:10% de descuento
                           18 meses:8% de descuento
                           """);
         lector.nextLine();
         
        plazo=lector.nextLine();
        switch(plazo) {
            case "6 meses":descuento= 0.12;
            break;
            case "12 meses":descuento= 0.1;
            break;
            case "18 meses":descuento= 0.08;
            break;
            default:System.out.println("plazo demasiado largo ");
            break;
        }
        precioFinal=precio-(precio*descuento);
        System.out.printf(" el precio de la marca %s, es %d\n" ,marca,precio);
        System.out.printf("El descuento es %.2f%%\n",descuento);
        System.out.printf("el total a pagar es %.2f\n",(double)precioFinal);
        }
        else   {
            System.out.println("ingrese una marca conocida ");
            
        }
    }
    public static void e2(Scanner lector){
        int lado=0,perimetro=0 ,base=0,l1=0,l2=0,l3=0 , altura=0;
        String figura="";
        
        System.out.println("ingrese el nombre de la figura");
        figura =lector.next();
        if (figura.equalsIgnoreCase("cuadrado") ||figura.contains("cuadra")) {
            System.out.println("ingrsese el lado del cuadrado ");
        lado= lector.nextInt();
        perimetro=lado*4;
        }else if (figura.equalsIgnoreCase("rectangulo") || figura.contains("recta")) {
            System.out.println("ingrese  la base del rectangulo");
            base=lector.nextInt();
            System.out.println("ingrese la altura del rectangulo");
            altura=lector.nextInt();
            perimetro=2*base+2*altura;
            }else if (figura.equalsIgnoreCase("triangulo") ||figura.contains("tria")) {
                System.out.println("ingrese los tres lados del triangulo");
                l1=lector.nextInt();
                l2=lector.nextInt();
                l3=lector.nextInt();
                perimetro=l1+l2+l3;
            }else {
                System.out.println("figura desconocida");
            }
        System.out.printf("el perimetro de la figura %s es :\n %d\n  ",figura,perimetro);
     
    }
    public static void e3(Scanner lector) {
        String nombre="";
        System.out.println("ingrse nombre");
        nombre=lector.next();
    }
    public static void e4(Scanner lector) {
        int precio=0,formaDePago=0;
        String marca="";
        double descuento=0,totalFinal=0;
        System.out.println("ingrese  la marca de laptop que desea adquirir");
        marca= lector.next();
        switch(marca) {
            case "Apple":precio=4500;
            break;
            case "Dell":precio=3800;
            break;
            case "HP":precio=3200;
            break;
            default :System.out.println("marca desxonocida");
            break;
        }
        System.out.println("ingrese la foirma de  pago que desea realizar");
        System.out.println("""
                           1-contado
                           2-6 cuotas
                           3-12 cuotas
                           """);
        formaDePago=lector.nextInt();
        switch(formaDePago) {
            case 1:descuento=0.15;
            break;
            case 2:descuento=0.07;
            break;
            case 3:descuento=0.03;
            break;
            default:System.out.println("formna de pago desconocido");
            break;
        }
     totalFinal=precio-(precio*descuento);
        System.out.printf("por la compra de una laptop marca %s con precio fijo de %d\n  y aplkicado un decuento del %.0f%%el total a pagar sera de :\n %.2f",marca,precio,descuento*100,totalFinal);
    }
    public static void e5(Scanner lector) {
        String tipoDePrenda="";
        int precio=0,cantidad=0;
        double descuento=0,precioFinal=0,totalPagar=0;
        System.out.println("Ingrese la prenda que desea adquirir");
        tipoDePrenda= lector.nextLine();
        switch(tipoDePrenda) {
            case "Polo":precio=50;
            break;
            case "Pantalon":precio=120;
            break;
            case "Casaca":precio=200;
            break;
            default:System.out.println("tipo de vestimenta no encontrada");
            break;
        }
        if(precio!=0)   {
            System.out.println("ingese la cantidad de prendas compradas");
            cantidad=lector.nextInt();
            if (cantidad >= 3 && cantidad <=5) {
                descuento =0.01;
            }else if(cantidad>5) {
                descuento =0.15;
            }
         }else {
            System.out.println("ingrese solo polo pantalon o casaca ");
        }
        precioFinal=precio*cantidad-(precio*cantidad*descuento);
        System.out.printf("el tipo de prenda es %s compraste %d  a un precio de %d y por lo tanto tienes un descuento del %.0f%% y pagaras un precio final de %.2f\n",tipoDePrenda,cantidad,precio,descuento*100,precioFinal);
    }
   public static void e6(Scanner lector) {
       String marca="",tamañoDeMica = null;
       int precio=0 ,plazo=0,precioMica=0;
       double descuento=0,precioFinal=0,totalPagar=0;
       System.out.println("ingrese la marca del celular");
       marca=lector.next();
       if(marca.equalsIgnoreCase("Samsung")  || marca.contains("Samsu") )  {
           precio=2000;
       } else if(marca.equalsIgnoreCase("Xiaomi")  || marca.contains("Xiaomi") )  {
           precio=1500;
       }else if(marca.equalsIgnoreCase("Aple")  || marca.contains("Ap") )  {
           precio=2000;
   }else {
           System.out.println("marca de celular desconocido");
       }
       lector.nextLine();
       if(precio!=0) {
           System.out.println("Ingrese el plazo de pago en meses");
            plazo=lector.nextInt();
            switch (plazo)  {
                case 6 :descuento=0.12;
                        break;
                case 12 :descuento=0.10;
                        break;
                case 18 :descuento=0.18;
                        break;        
                default:
                    break;
              }
            if (precio>3000) {
                
                descuento=0.05+descuento;
            }
            lector.nextLine();
          switch (marca)    {
              case "Samsung":tamañoDeMica="mediano";
              precioMica=15;
              break;
              case "Xiaomi":tamañoDeMica="pequeña";
              precioMica=15;
              break;
              case "Aple":tamañoDeMica="pequeño";
              precioMica=20;
              break;
              default:
                  System.out.println("marca de celular desconocida");
          }
              
                   
       }else {
           System.out.println("ingrese marca de celular  samsumng,xiaomi o aple");
       }
       
       precioFinal=precio -(precio*descuento);
       totalPagar=precioFinal-precioMica;
       System.out.printf("el total a pagar es: %f el tamaño de mica es %s" , totalPagar,tamañoDeMica);
               
       
       
       
       
   }

}
