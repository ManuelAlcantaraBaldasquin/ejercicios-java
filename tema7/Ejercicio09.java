/**
 * 
 * Pide 8 números y muestra cuales son pares o impares
 *
 * @author Manuel Alcántara
 */
public class Ejercicio09 {

  public static void main(String[] args) {
  
    int[] numero = new int[8];
    int i;
    
    System.out.println("Introduce 8 números(pulsa enter después de cad uno) ");

    for (i = 0; i < 8; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }

    for (i = 0; i < 8; i++) {
      if (numero[i] % 2 == 0) {
        System.out.println(numero[i] + " par");
      } else {
        System.out.println(numero[i] + " impar");
      }
    }
  }
}
