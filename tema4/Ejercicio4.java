/**
 * Horas trabajadas
 *
 * @author Manolo
 */

public class Ejercicio4 {
  public static void main(String[] args) {
    
    int sueldo;

    System.out.print("Horas trabajadas: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas < 40) { 
      sueldo = horasTrabajadas * 12;
    } else {
    sueldo = (40 * 12) + ((horasTrabajadas - 40) * 16);
     }
    System.out.println("su sueldo es de " + sueldo + " euros ");
  }
}
