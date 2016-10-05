/**
 * Base imponible a partir de un número intrducido por teclado
 *
 *
 * @author Manolo
 */

public class Ejercicio07 {
  public static void main(String[] args) {

    System.out.print("Base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());

    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
    System.out.printf("-----------------------\n");
    System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));
  }
}
