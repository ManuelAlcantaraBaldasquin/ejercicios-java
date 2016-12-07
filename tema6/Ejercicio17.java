/**
 * pecera
 *
 * @author Manolo
 */
public class Ejercicio17 {

  public static void main(String[] args) {

	int ancho = 4;
	int alto = 4;
	int nºhuecos = (ancho - 2) * (alto - 2);
	
	System.out.print("introduce el ancho: ");
	ancho = Integer.parseInt(System.console().readLine());
	System.out.print("introduce el alto: ");
	alto = Integer.parseInt(System.console().readLine());
    
    if (ancho < 4){ //establecer un ancho y alto mínimos
		ancho=4;
		}
	if (alto < 4){
		alto=4;
		}
		
	int jRandom = ((int)(Math.random() * (ancho - 3) + 1));
	int iRandom = ((int)(Math.random() * (alto - 3) + 1));

    for (int i = 0; i < alto; i++){ //pinta filas
		
		for (int j = 0; j < ancho; j++){ //pinta columnas
			
			if (i==0 || i == (alto - 1) || j == 0 || j == (ancho - 1)){
				System.out.print("*"); //pinta los bordes de la pecera
				}
			else if (i==iRandom & j==jRandom){ //luego pinta el pez
				System.out.print("&");
				}
			else{
				System.out.print(" "); //y los espacios que quedan los deja huecos
				}
		}
    System.out.println();
  }
 
}
}

