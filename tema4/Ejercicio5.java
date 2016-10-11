/**
 * Ecuación de primer grado 
 *
 * @author Manolo
 */

public class Ejercicio5 {
  public static void main(String[] args) {
 
    System.out.println("Resuelve la ecuación de primer grado ax + b = 0 : ");
    System.out.print("Introduce valor a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce valor b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    if (a == 0) { 
     System.out.println("Introduzca un número válido");
      
    } else {
    System.out.println("La respuesta es x = " + (-b/a));
     }

  }
}
