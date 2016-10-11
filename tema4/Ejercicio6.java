/**
 * realiza un programa que calcule el tiempo que tardará en caer un objeto
 *
 * @author Manolo
 */
public class Ejercicio6 {

  public static void main(String[] args) {

    System.out.println("Tiempo que tarda en caer el objeto");
    
    System.out.print("Introduzca la altura desde la que cae el objeto: ");
    Double h = Double.parseDouble(System.console().readLine());

    double g = 9.81;
    double t = Math.sqrt((2*h)/g);

    System.out.printf("Tarda en caer %.2f segundos\n", t);
  }
}
