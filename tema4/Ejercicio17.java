/**
 * última cifra de un número
 *
 * @author Manolo
 */
public class Ejercicio17 {

  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero: ");

    int n = Integer.parseInt(System.console().readLine());

    System.out.println("La última cifra es " + (n % 10)); 
  }
}

// también se puede hacer con math.abs (n) %10
