 /**
 *
 * Multiplicar 2 numeros
 *
 *
 * @author Manolo
 */

public class Ejercicio01 {
  public static void main(String[] args) {
    int x;
    int y;
    String linea;

    System.out.print("Primer número: ");
    linea = System.console().readLine();
    x = Integer.parseInt( linea );
    System.out.print("Segundo número: ");
    linea = System.console().readLine();
    y = Integer.parseInt( linea );
    
    System.out.println(x + "*" + y + "=" + (x * y));
  }
}
