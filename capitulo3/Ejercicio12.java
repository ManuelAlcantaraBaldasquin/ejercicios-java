/**
 * calcular nota media 
 *
 *
 * @author Manolo
 */

public class Ejercicio12 {
  public static void main(String[] args) {

    System.out.println("Nota del primer trimestre");
    System.out.print("Nota del primer exámen: ");
    double Examen1 = Double.parseDouble(System.console().readLine());
    System.out.print("Nota que quieres sacar en el primer trimestre: ");
    double NotaFinal = Double.parseDouble(System.console().readLine());

   System.out.println("Tienes que sacar un " + (NotaFinal * 100 - Examen1 * 40)/60 + " para tener un " + NotaFinal + " en la nota del trimestre");
  }
}
