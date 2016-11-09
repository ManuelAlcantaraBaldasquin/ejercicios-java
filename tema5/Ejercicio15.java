/**
 *
 * muestra la potencia 
 * 
 * @author Manolo
 */

public class Ejercicio15 {

  public static void main(String[] args) {
    
    System.out.print("base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("exponente: ");
    int exponenteIntroducido = Integer.parseInt(System.console().readLine());

    int potencia;
    int exponente;
    
    for (int i = 1; i <= exponenteIntroducido; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }
  }
}
