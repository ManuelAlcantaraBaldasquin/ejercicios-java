/**
 * euros a pesetas
 * 
 *
 * @author Manolo
 */

public class Ejercicio02 {
  public static void main(String[] args) {

    System.out.print("Euros: ");
    double euros = Double.parseDouble(System.console().readLine());

    int pesetas = (int) (euros * 166.386);
    
    System.out.print(euros + " euros son " + pesetas + " pesetas.");
  }
}
