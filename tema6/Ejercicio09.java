/**
 * 
 * Genera números aleatorios pares entre 0 y 100 hasta que salga el 24
 *
 * @author Manolo
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    
    int numeros = 0;
    int numerosTotales = 0;
    
    while (numeros != 24) {
      numeros = (int)(Math.random() * 51) * 2;
      System.out.print(numeros + " ");
      numerosTotales++;
    }
    System.out.println("\nSe han generado " + numerosTotales + " números.");
  }
}
