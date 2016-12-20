/**
 *Rellena un array con 20 números aleatorios comprendidos entre 0-400 (ambos incluidos).
 * Muestra el array y preguntar si quieres resaltar múltiplos de 5 o 7.Seguidamente se 
 * volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes.
 *
 * 
 * @author Manuel Alcántara
 */
public class Ejercicio16 {
  public static void main(String[] args) {
  
    int[] n = new int[20];

    for (int i = 0; i < 20; i++) {
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " ");
    }
    
    System.out.print("\n\n¿Qué números quiere resaltar? ");
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    int opcion = Integer.parseInt(System.console().readLine());

    int multiplo = (opcion == 1) ? 5 : 7;

    // Muestra el resultado.
    for (int elemento : n) {
      if (elemento % multiplo == 0) {
        System.out.print("[" + elemento + "] ");
      } else {
        System.out.print(elemento + " ");
      }
    }
  }
}
