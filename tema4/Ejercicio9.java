/**
 * Ecuación de primer grado 
 *
 * @author Manolo
 */

public class Ejercicio9 {
  public static void main(String[] args) {
 
    System.out.println("Resuelve la ecuación de segundo grado ax² + bx + c = 0 : ");
    System.out.print("Introduce valor a: ");
    double a = Double.parseDouble(System.console().readLine());

    System.out.print("Introduce valor b: ");
    double b = Double.parseDouble(System.console().readLine());

    System.out.print("Introduce valor c: ");
    double b = Double.parseDouble(System.console().readLine());

    double x;
    
    if (a == 0) && (b == 0) && (c == 0) { 
     System.out.println(" x puede tener cualquier valor ");
    } 

    if (a == 0) && (b == 0) && (c != 0) { 
     System.out.println(" no tiene solución ");
    } 

    if (a == 0) && (b != 0) && (c != 0) { 
     System.out.println(" x = " + (-c/b));
    } 

    if (a != 0) && (b != 0) && (c == 0) { 
     System.out.println(" x = ") + (-b)/(2*a);
    } 


      else {
    System.out.println("La respuesta es x = ";
     }

  }
}
