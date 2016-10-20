/**
 * Indica si el número es par o divisible entre 5
 *
 * @author Manolo
 */
public class Ejercicio14 {

  public static void main(String[] args) {
        
    System.out.print("Introduce un número: ");
    int n = Integer.parseInt(System.console().readLine());

    if ((n % 2) == 0) {
      System.out.print("El número es par");
    } else {
      System.out.print("El número es impar");
    }

    if ((n % 5) == 0) {
      System.out.println(" el número es divisible entre 5.");
    } else {
      System.out.println(" el número no es divisible entre 5.");
    }
  }
}
