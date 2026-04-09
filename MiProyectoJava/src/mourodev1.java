
public class mourodev1 {

    
    public static void main(String[] args) {
        
    String name ="Daniel"; 
    var surname=new String("Ramos");
            
            // OPERACIONES BASICAS
            
            
           // Concatenacion
            System.out.println( name + " " + surname);
            
            // Longitud
            System.out.println(name.length());
    
            // Obtener caracter en una posicion concreta (dame el caracter en ...)
            //Siempre empieza a contar desde el 0
            System.out.println(name.charAt(3));            
             //Mayusculas y Minusculas 
                    System.out.println(name.toUpperCase());
                     System.out.println(name.toLowerCase());
                     
            // Comprobar si tiene o no la palabra 
            System.out.println("Hola ,Java " .contains( "Daniel"));// hola  java contienes la palabra java? verdad o false,es false 
            System.out.println("Hola ,Java " .contains( "ava"));//  (True )la palabra java si contiene la palabra ava
             
            //trim                                   limpieza ,modificar ,eliminar caracateres
        System.out.println("Hola,me llamos Daniel " .trim());               // elimina el espacio al inicio y al final 
        
          //replace                    se usa para reemplazar caracteres
           System.out.println("Hola,me llamos Daniel " .replace( "Daniel" ,"Donin"));  // cambia la Daniel por la palabra Donin
           
           // format       
        var age =25;
        System.out.println(String.format("hola ,%s . Tengo  %d , años ." , name,age));
        
}
}