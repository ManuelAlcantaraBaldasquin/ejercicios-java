/**
 *
 * 
 *
 *
 * @author Manolo
 */
public class Ejercicio04v2 {

	public static void main(String[] args) {
	
	
	System.out.println("introduce 10 números y pulsa enter despues de cada 1: ");
	
	int[] num = new int[20];
	int[] cuadrado = new int[20];
	int[] cubo = new int[20];
	
	System.out.println("Número  Cuadrado  cubo");
	for (int i = 0; i < 20; i++){
		num[i] = (int)(Math.random()*101);
		cuadrado[i] = num[i] * num[i];
		cubo[i] = num[i] * num[i] * num[i];
		System.out.printf("%4d  %8d  %6d\n", num[i], cuadrado[i], cubo[i]);
		}
	
	}
}
