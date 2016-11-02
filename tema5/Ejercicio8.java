/**
 * tabla de multiplicar
 *
 * @author Manolo
 */

public class Ejercicio8 {
  public static void main(String[] args) {

    System.out.print("Introduce un número para ver su tabla de multiplicar ");   
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
       

    for (int i = 0; i <= 10; i++){
    System.out.print(" " + numeroIntroducido + " x " + i + " = " + 
    numeroIntroducido * i + " // ");
   }

  }
}

