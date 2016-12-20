/**
 * 
 * Pide 15 números,guardalos en un array y rótalos una posición (el array 0 pasará al 1,el 1 al 2...)
 *
 * @author Manolo
 */
public class Ejercicio06 {

  public static void main(String[] args) {
    
      int[] numero = new int[15];
      int i;
      
      System.out.println("Introduce 15 números y dale a enter después de cada uno");
      
      for (i = 0; i < 15; i++) {//primer array
        numero[i] = Integer.parseInt(System.console().readLine());
      }
      
      System.out.println();
      
      
      System.out.println("Primer array:");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i < 75; i++) {
        System.out.print("⎯");
      }
      System.out.println("⎯");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", numero[i]);
      }
      System.out.println("|");
     //rota los valores
      int aux = numero[14];
      for (i = 14; i > 0; i--) {
        numero[i] = numero[i-1];
      }
      numero[0] = aux;
      
      //array ya rotado
      System.out.println("\nArray rotado a la derecha una posición:");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i < 75; i++) {
        System.out.print("⎯");
      }
      System.out.println("⎯");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", numero[i]);
      }
      System.out.println("|");
      
  }
}
