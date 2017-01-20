/**
 * Ejercicio 16
 *Muestra los números capicúa que hay entre 1 y 99999.
 * @author Manolo
 */
import biblioteca.matematicas;

public class Ejercicio16 {

  public static void main(String[] args) {
  
  //primos entre 1 y 1000
	for (int i = 0;i < 99999; i++){
		if (matematicas.esCapicua(i))
			System.out.print(i + " ");
		}
}
}


