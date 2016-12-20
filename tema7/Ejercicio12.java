/**
 * 
 * Pide 10 números,almacenalos en un array con indice 0-9,pide posición inicial y final(deben estar entre 0 y 9
 * e inicial debe ser menor que final)después cambia el número en posición inicial por final y rota los demás
 * 
 * Ejercicio 12
 *
 * @author Manuel Alcántara
 */
public class Ejercicio12 {

  public static void main(String[] args) {
  
    int[] n = new int[10];
    int[] resultado = new int[10];
    int i;
    int pInicial;
    int pFinal;
    boolean valido;
    
    System.out.println("Introduzca 10 números separados por INTRO:");

    for (i = 0; i < 10; i++) { //pide 10números y almacenalos
      n[i] = Integer.parseInt(System.console().readLine());
    }
    
    // Primer array  
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    //Pedir Inicial y Final
    do {
      valido = true;
      
      System.out.print("Introduce posición inicial 0-9: ");
      pInicial = Integer.parseInt(System.console().readLine());
      if ((pInicial < 0) || (pInicial > 9)) {
        System.out.println("El número tiene que estar entre 0 y 9");
        valido = false;
      }
  
      System.out.print("Introduce posición final 0-9: ");
      pFinal = Integer.parseInt(System.console().readLine());
      if ((pFinal < 0) || (pFinal > 9)) {
        System.out.println("El número tiene que estar entre 0 y 9.");
        valido = false;
      }
      
      if (pInicial >= pFinal) {
        System.out.println("El número inicial no puede ser mayor que el final");
        valido = false;
      }
    } while (!valido);

    System.out.println("\n\nPrimer array:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    // Copia el array n en resultado.
    for (i = 0; i < 10; i++) {
      resultado[i] = n[i];
    }
    
    resultado[pFinal] = n[pInicial];
    
    for (i = pFinal + 1; i < 10; i++)
      resultado[i] = n[i - 1];
    
    resultado[0] = n[9];
    
    for (i = 0; i < pInicial; i++)
      resultado[i + 1] = n[i];
    
    // array final.
    System.out.println("\nArray final:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", resultado[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");  
  }
}
