/**
 * Ejercicio 15
 *
 * @author Manolo
 */
import biblioteca.matematicas;

public class Ejercicio15 {

  public static void main(String[] args) {
  
  //primos entre 1 y 1000
	for (int i = 0;i < 1000; i++){
		if (matematicas.esPrimo(i))
			System.out.print(i + " ");
		}
}
}
