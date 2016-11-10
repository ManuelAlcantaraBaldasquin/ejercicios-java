/**
 * 
 * Di si es un número primo
 * 
 * @author Manolo
 */

public class Ejercicio16 {

  public static void main(String[] args) {
            
    System.out.print("Introduce un número entero para ver si es primo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    boolean primo = true;
    
    for (int i = 2; i < numeroIntroducido; i++) {
      if ((numeroIntroducido % i) == 0) {
        primo = false;
      }
    }
        
    if (primo) {
      System.out.println("Es primo.");
    } else {
      System.out.println("No es primo.");
    }

  }
}
