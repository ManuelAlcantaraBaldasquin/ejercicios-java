/**
 * Area de un triángulo
 *
 *
 * @author Manolo
 */

public class Ejercicio06 {
  public static void main(String[] args) {

    System.out.println("Área de un triángulo");
    System.out.print("Base: ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Altura: ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("El área del Triángulo es " + (base * altura)/2 + " cm2");
  }
}
