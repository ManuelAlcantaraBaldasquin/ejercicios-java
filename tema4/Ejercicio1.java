/**
 * Primera hora según el dia de la semana
 *
 *
 * @author Manolo
 */

public class Ejercicio1 {
  public static void main(String[] args) {

    String dia;

    System.out.print("Introduzca un dia ");
    dia = (System.console().readLine());
    
    switch(dia) {
      case "lunes":
        System.out.println("Sistemas Informáticos");
      case "martes":
        break;
      case "miércoles":
        System.out.println("Programación");
        break;
      case "jueves":
        System.out.println("Base de Datos");
        break;
      case "viernes":
        System.out.println("Lenguaje de Marcas");
        break;
      case "sábado":
      case "domingo":
        System.out.println("Almohada ");
        break;
      default:
        System.out.println("Pruebe sin mayúsculas");
    }
  }
}
