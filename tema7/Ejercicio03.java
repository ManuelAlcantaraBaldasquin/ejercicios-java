/**
 *
 * 
 *
 *
 * @author Manolo
 */
public class Ejercicio03 {

	public static void main(String[] args) {
	
	
	System.out.print("introduce 10 números y pulsa enter despues de cada 1: ");
	
	int[] num = new int[10];
	for (int i = 0; i < 10; i++){
		num[i] = Integer.parseInt(System.console().readLine());
		
		}
		System.out.println("Los números al revés son...");				
	for (int i = 9; i >= 0; i--) {
		System.out.println(num[i]);
      }
	}
}
