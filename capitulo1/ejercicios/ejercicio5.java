/**
* horario colores
*
* @author Manolo
*/
public class ejercicio5 { 
  public static void main(String[] args) {

    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";

    System.out.println("Lunes\tMartes\tMiérc\tJueves\tViernes");
    System.out.println("-----\t-----\t-----\t-----\t-----");
    System.out.println(azul + "S.INF" + verde + "\tPROG\tPROG" + rojo + "\tBD" + morado + "\tLM");
    System.out.println(azul + "S.INF" + verde + "\tPROG\tPROG" + rojo + "\tBD" + morado + "\tLM");
    System.out.println(azul + "S.INF" + verde + "\tPROG" + morado + "\tLM" + rojo + "\tBD" + blanco + "\tED");
    System.out.println(naranja + "FOL" + rojo + "\tBD" + morado + "\tLM" + verde +"\tPROG" + azul + "\tS.INF");
    System.out.println(naranja + "FOL" + rojo + "\tBD" + blanco + "\tED" + verde +"\tPROG" + azul + "\tS.INF");
    System.out.println(naranja + "FOL" + rojo + "\tBD" + blanco + "\tED" + verde +"\tPROG" + azul + "\tS.INF");
  }
}
