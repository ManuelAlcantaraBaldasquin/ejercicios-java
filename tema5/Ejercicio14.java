/**
 * 
 * pide una base y un exponente para calcular la potencia
 * 
 * @author Manolo
 */

public class Ejercicio14 {

  public static void main(String[] args) {
    
    System.out.println("Calcula la potencia");
    
    int resultado = 1;
    
    System.out.print("base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
	
	if (base > 0 && exponente > 0){
		
    for (int i = 0;i != exponente; i++){
		 
		 resultado = resultado * base;
		 
		 }
   
    System.out.println(base + "^" + exponente + " = " + resultado);
	}else{
	System.out.println("introduce un número positivo");
	}
}
}
