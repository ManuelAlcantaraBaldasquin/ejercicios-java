/**
 *
 * 
 * Llena la pantalla de carácteres aleatorios
 * @author Manolo
 */
public class Ejercicio12 {

  public static void main(String[] args) 
    throws InterruptedException {

    int linea = 0;
    
    for(int i = 0; i < 2000; i++) {
      System.out.print((char)(Math.random() * (95) + 32));
      
      if (linea++ == 60) {
        linea = 0;
        Thread.sleep(50);
        System.out.println();
      }
    }
  }
}
