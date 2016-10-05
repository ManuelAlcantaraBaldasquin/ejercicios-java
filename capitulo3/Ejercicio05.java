/**
 * Area de un rectángulo
 *
 *
 * @author Manolo
 */

public class Ejercicio05 {
  public static void main(String[] args) {

    System.out.println("Área de un rectángulo");
    System.out.print("Base: ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Altura: ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("El área del rectángulo es " + (base * altura) + " cm2");
  }
}
