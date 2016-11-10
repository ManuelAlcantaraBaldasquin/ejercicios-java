/**
 * 
 * Suma los 100 siguientes números del número introducido
 * 
 * @author Manolo
 */

public class Ejercicio17 {

  public static void main(String[] args) {
            
	
    System.out.print("Introduce un número entero para ver la suma de sus 100 siguientes: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());


    
      if (numeroIntroducido < 0) {
		System.out.println("Introduzca un número positivo pls.");
        } else {
	int suma = 0;
    for(int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {
		suma += i;
      }
     System.out.println("La suma de los 100 números siguientes es " + suma);
    }
        
  }
}

