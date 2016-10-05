/**
 * calcular volumen de un cono V = (1/3)πr^2h
 *
 *
 * @author Manolo
 */

public class Ejercicio09 {
  public static void main(String[] args) {
    double pi = 3.1415926;

    System.out.println("Volumen de un cono");
    System.out.print("Radio: ");
    double radio = Double.parseDouble(System.console().readLine());
    System.out.print("Altura: ");
    double altura = Double.parseDouble(System.console().readLine());

   System.out.println("El Volumen es " + (1.0/3.0)* pi * radio * radio * altura + " cm3");
  }
}
