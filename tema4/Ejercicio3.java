/**
 * Dia de la semana según el número
 *
 *
 * @author Manolo
 */

public class Ejercicio3 {
  public static void main(String[] args) {

    String dia;

    System.out.print("Introduzca un número (1-7) ");
    dia = (System.console().readLine());
    
    switch(dia) {
      case "1":
        System.out.println("Lunes");
        break;
      case "2":
        System.out.println("Martes");
        break;
      case "3":
        System.out.println("Miércoles");
        break;
      case "4":
        System.out.println("Jueves");
        break;
      case "5":
        System.out.println("Viernes");
        break;
      case "6":
        System.out.println("Sábado");
        break;
      case "7":
        System.out.println("Domingo ");
        break;
      default:
        System.out.println("Ningún dia de la semana corresponde a ese número");
    }
  }
}
