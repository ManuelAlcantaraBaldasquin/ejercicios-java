/**
 * 
 * genera 20 números aleatorios entre 0 y 100,coloca todos los 
 * pares en las primeras celdad y los impares en las demás.
 *
 * @author Manuel Alcántara
 */
public class Ejercicio10 {

  public static void main(String[] args) {
  
    int[] n = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    int i;
    int pares = 0;
    int impares = 0;
    
    for (i = 0; i < 20; i++) { //genera los 20 números
      n[i] = (int)(Math.random() * 101);
      //Mete los pares en un array y los impares en otro
      if (n[i] % 2 == 0) {
        par[pares++] = n[i];
      } else {
        impar[impares++] = n[i];
      }
    }
    
    // Muestra primer array
    System.out.println("Array original:");
    for (i = 0; i < 20; i++) {
      System.out.print(n[i] + " ");
    }
    System.out.println();
    
    // Coloca los pares en las primeras posiciones
    for (i = 0; i < pares; i++) {
      n[i] = par[i];
    }
    
    // Coloca los impares en el resto
    for (i = pares; i < 20; i++) {
      n[i] = impar[i - pares];
    }

    // Muestra el resultado.
    System.out.println("Array con pares al principio e impares al final: ");
    for (i = 0; i < 20; i++) {
      System.out.print(n[i] + " ");
    }
  }
}
