/**
 *
 * 
 * 6. Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe *    adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el *    programa dirá cuántas oportunidades quedan y si el número introducido es menor o  *    mayor que el que ha pensado.
 *
 * @author Manolo
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    
    int oportunidades = 5;
    int numeroIntroducido;
    boolean acertado = false;
    int numeroAdivinar = (int)(Math.random() * 101);
    
    System.out.println("Adivina un número del 0 al 100 (5 oportunidades)");

    do {
      System.out.print("Introduce el número: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      oportunidades--;

      if ( (numeroIntroducido > numeroAdivinar) && (oportunidades > 0) ){
        System.out.println("El número es menor que " + numeroIntroducido);
        System.out.println("Te quedan " + oportunidades + " intentos");
      }
      
      if ( (numeroIntroducido < numeroAdivinar) && (oportunidades > 0) ){
        System.out.println("El número es mayor que " + numeroIntroducido);
        System.out.println("Te quedan " + oportunidades + " intentos.");
      }
      
      if (numeroIntroducido == numeroAdivinar) {
        acertado = true;
        System.out.println("Has acertado");
      }
    } while (!acertado && (oportunidades > 0));
    
    if (!acertado) {
      System.out.println("Has fallado,el número es " + numeroAdivinar);
    }
  }
}
