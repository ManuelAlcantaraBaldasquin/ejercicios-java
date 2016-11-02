/**
 * Caja fuerte
 *
 * @author Manolo
 */

public class Ejercicio7 {
  public static void main(String[] args) {
        
    int intentos = 4;
    int numero;
    boolean acertado = false;

    do {
      System.out.print("Escribe la clave de la caja fuerte: ");
      numero = Integer.parseInt(System.console().readLine());

      if (numero == 1234) {
      acertado = true;
      } else {
        System.out.println("Error");
      }
      
      intentos--;
  
    } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("Caja fuerte abierta");
    } else {
      System.out.println("No le quedan mas oportunidades");
    }
  }
}
