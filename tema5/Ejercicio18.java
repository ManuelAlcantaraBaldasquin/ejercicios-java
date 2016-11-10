/**
 * 
 *contar de 7 en 7 a partir de 2 valores introducidos 
 * 
 * @author Manolo
 */

public class Ejercicio18 {

  public static void main(String[] args) {
    
    int primerNumero;
    int segundoNumero;
    
    do {
      System.out.print("Introduce el primer número: ");
      primerNumero = Integer.parseInt(System.console().readLine());
      
      System.out.print("Introduce el segundo número: ");
      segundoNumero = Integer.parseInt(System.console().readLine());
      
      if(primerNumero == segundoNumero) {
        System.out.println("Introduce números diferentes");
      }
    } while (primerNumero == segundoNumero);
    
    // si el primer número es mayor que el segundo, se intercambian los valores
    if (primerNumero > segundoNumero) {
      int aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    
    for(int i = primerNumero; i <= segundoNumero; i += 7) {
      System.out.print(i + " ");
    }
    
    System.out.println();
  }
}
