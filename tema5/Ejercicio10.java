/**
 * 
 * calcular media de números introducidos
 * 
 * @author Manolo
 */

public class Ejercicio10 {

  public static void main(String[] args) {
    
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("Introduce una serie de números para saber su media (puede parar el programa introduciendo un número negativo) ");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros++;
      suma += numeroIntroducido;
    }
    
    System.out.println("La media es " + (suma - numeroIntroducido)/ (numeros - 1));

  }
}
