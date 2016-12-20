/**
 *
 * 
 * 	  Genera 100 números aleatorios entre 0 y 20 separados por espacios.El programa pedirá entonces por teclado dos valores y a
 *    continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista
 *    generada anteriormente. Los números que se han cambiado deben aparecer entrecomillados.
 *
 * @author Manuel Alcántara
 */
public class Ejercicio07 {

  public static void main(String[] args) {
    
    int[] numero = new int[100];
    int i;
    
    
    // Saca 100 números aleatorios entre 0 y 20
    for (i = 0; i < 100; i++) {
      numero[i] = (int)(Math.random() * 21);
      System.out.print(numero[i] + "  ");
    }
    //pide 2 valores
    System.out.print("\nIntroduce uno de los números mostrados: ");
    int valor1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el valor por el que quieres cambiarlo: ");
    int valor2 = Integer.parseInt(System.console().readLine());

    System.out.println();
    //cambia el valor elegido por usuario por el nuevo valor que le ha dado
    for (i = 0; i < 100; i++) {
      if (numero[i] == valor1) {
        numero[i] = valor2;
        System.out.print("\"" + numero[i] + "\"  ");
      } else {
        System.out.print(numero[i] + "  ");
      }
    }

    System.out.println();
  }
}
