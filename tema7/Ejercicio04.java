/**
 *
 * 
 *
 *
 * @author Manolo
 */
public class Ejercicio04 {

	public static void main(String[] args) {
	
	
	System.out.print("introduce 10 números y pulsa enter despues de cada 1: ");
	
	int[] num = new int[20];
	int[] cuadrado = new int[20];
	int[] cubo = new int[20];
	
	for (int i = 0; i < 20; i++){
		num[i] = (int)(Math.random()*101);
		System.out.println(num[i]);
		}
		System.out.println("El cuadrado de esos números es");
	for (int j = 0; j < 20; j++){
		cuadrado[j] = num[j] * num[j];
		System.out.println(cuadrado[j]);
	}
		System.out.println("El cubo de esos números es");
	for (int k = 0; k < 20; k++){
		cubo[k] = num[k] * num[k] * num[k];
		System.out.println(cubo[k]);
	}
	}
}
