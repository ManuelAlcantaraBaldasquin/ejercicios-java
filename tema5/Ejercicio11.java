/**
 *
 * Muestra en 3 columnas el cuadrado y el cubo de un número introducido por teclado
 * 
 * @author Manolo
 */

public class Ejercicio11 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
    }
  }
}
