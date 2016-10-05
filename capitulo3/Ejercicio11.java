/**
 * KB a MB
 * 
 *
 * @author Manolo
 */

public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.print("KB a convertir: ");
    double KB = Double.parseDouble(System.console().readLine());

    int MB = (int) (KB / 1024);
    
    System.out.print(KB + " KB son " + MB + " MB ");
  }
}
