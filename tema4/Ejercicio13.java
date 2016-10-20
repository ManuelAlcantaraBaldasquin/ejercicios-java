/**
 * Ordenar 3 números
 *
 * @author Manolo
 */
public class Ejercicio13 {

  public static void main(String[] args) {
    
    int aux;
        
    System.out.println("Introduzca 3 números: ");

    int a = Integer.parseInt(System.console().readLine());
    int b = Integer.parseInt(System.console().readLine());
    int c = Integer.parseInt(System.console().readLine());

    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }

    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
        
    System.out.println("Los números son " + a + ", " + b + " y " + c + "."); 
  }
}
