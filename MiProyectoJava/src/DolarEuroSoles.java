import java.util.Scanner;
public class DolarEuroSoles {

   
    public static void main(String[] args) {
        double monto=0 ,montoFinal=0;
        String monedaOrigen = "",monedaFinal="soles",destino="";
        final double  DOLAR=3.82 ,EURO =4.17; 
        System.out.println("Ingrese la moneda de origen ");
        Scanner lector = new Scanner (System.in);
        monedaOrigen=lector.next();
        System.out.println("ingrese el monto : ");
        monto =lector.nextDouble();
        montoFinal=switch(monedaOrigen){
            case "dolar"-> { 
                System.out.println("en que tipo de cambio lo quiere ");
                destino=lector.next();
                if (destino.equals("soles")) {
                    yield DOLAR*monto;
                  } 
                else if (destino.equals("euros")){
                      yield DOLAR*monto/EURO;
                } else {
                    yield 0;
                }                                                                   
                }
            case "euros"->{    
                System.out.println("en que tipo de cambio lo quiere(soles o dolares ");
                destino=lector.next();
                if (destino.equals("soles")) {
                   yield EURO*monto;
                  } 
                else if (destino.equals("dolares")){
                    yield EURO*monto/DOLAR;
                }
                else {
                yield 0;
            }
                }
                 
               default -> 0;
       };
    System.out.println("Resultado: " + montoFinal);
    }
  
}
