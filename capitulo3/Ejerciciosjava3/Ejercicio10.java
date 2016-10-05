/**
 * MB a KB
 * 
 *
 * @author Manolo
 */

public class Ejercicio10 {
  public static void main(String[] args) {

    System.out.print("MB a convertir: ");
    double MB = Double.parseDouble(System.console().readLine());

    int KB = (int) (MB * 1024);
    
    System.out.print(MB + " MB son " + KB + " KB ");
  }
}
