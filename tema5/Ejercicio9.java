/**
 * cuantos digitos tiene el número introducido
 * 
 * @author Manolo
 */

public class Ejercicio9 {

  public static void main(String[] args) {
    
    int digitos = 1, n, numeroIntroducido;

    System.out.print("Introduce un número para saber cuantos digitos tiene: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    n = numeroIntroducido;
    
    while (n > 10) {
      n /= 10;
      digitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + digitos + " dígitos.");

  }
}
