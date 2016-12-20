/**
 * Rellena un array de 100 elementos con números enteros aleatorios 0-500 (ambos incluidos)
 * Pide por teclado si se quiere destacar el máximo o el mínimo,resaltalo con asteriscos
 * Capítulo 7. Arrays
 *
 *
 * @author Manuel Alcántara
 */
public class Ejercicio13 {

  public static void main(String[] args) {
  
    int[] n = new int[100];
    int maximo = 0;
    int minimo = 100;

    for (int i = 0; i < 100; i++) { //genera 100 números aleatorios entre 0-500
      n[i] = (int)(Math.random() * 501);
      
      if (n[i] < minimo) {//averigua el mínimo
        minimo = n[i];
      }
      
      if (n[i] > maximo)  {//y el máximo
        maximo = n[i];
      }
    }

    // Primer array
    for (int elemento : n) {
      System.out.print(elemento + " ");
    }
    
    System.out.print("\n\n¿Quiere saber el máximo o el mínimo? (1 – mínimo, 2 – máximo): ");
    int opcion = Integer.parseInt(System.console().readLine());

    int destacado; // número que se va a destacar del resto
    
    if (opcion == 1) {
      destacado = minimo;
    } else {
      destacado = maximo;
    }

    System.out.println();

    // Muestra el resultado.
    for (int elemento : n) {
      if (elemento == destacado) {
        System.out.print(" **" + elemento + "** ");
      } else {
        System.out.print(elemento + " ");
      }
    }
  }
}
