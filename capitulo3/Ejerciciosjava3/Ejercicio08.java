/**
 * calcular salario semanal en base a las horas
 *
 *
 * @author Manolo
 */

public class Ejercicio08 {
  public static void main(String[] args) {

    System.out.print("Horas trabajadas: ");
    int Horas = Integer.parseInt(System.console().readLine());
    
    System.out.println("Salario: "+ (Horas * 12) + " euros");
  }
}
