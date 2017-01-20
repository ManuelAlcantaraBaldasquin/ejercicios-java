/**
 * Ejercicio 01-14
 *
 * @author Manolo
 */
import biblioteca.matematicas;

public class Ejercicio01al14 {

  public static void main(String[] args) {
   //capicua
   if (biblioteca.matematicas.esCapicua(22)) {
      System.out.println("El 22 es capicúa");
    }else {
	  System.out.println("El 22 no es capicúa");
	}
	//primo
	if (biblioteca.matematicas.esPrimo(12)) {
		System.out.println("El 11 es primo");
	}else{
		System.out.println("El 11 no es primo");
	}
	//siguiente primo
	System.out.println("El siguiente primo de 11 es: " + biblioteca.matematicas.siguientePrimo(11));

	//Potencia
	System.out.println("2^2 = " + biblioteca.matematicas.potencia(2, 2));
	System.out.println("4^(-3)= " + biblioteca.matematicas.potencia(4, -3));
	
	//número de dígitos
	System.out.println("el número 1234567890 tiene : " + biblioteca.matematicas.digitos(1234567890));
	
	//número volteado
	System.out.println("el número 743 volteado es :" + biblioteca.matematicas.voltea(743));
	
	//número Dígito
	System.out.println("el número 43289 en la posición 3 (empezando por el 0) contiene el : " + biblioteca.matematicas.nDigito(43289, 3));
	
	//posición Digito
	System.out.println("el digito 8 del 6872 está en la posición: " + biblioteca.matematicas.pDigito(6872, 8) + "(empezando por el 0");
	System.out.println("el digito 2 del 1090 está en la posición: " + biblioteca.matematicas.pDigito(1090, 2) + "(empezando por el 0");
	
	//quitarDigitosDetras
	System.out.println("El número 98798 sin sus 2 últimos dígitos se queda en :" +  biblioteca.matematicas.quitaDigitosDetras(98798, 2));
	
	//quitarDigitosDelante
	System.out.println("El número 30764 sin sus 3 primeros dígitos se queda en :" +  biblioteca.matematicas.quitaDigitosDelante(30764, 3));
	
	//agregarDigitosDetras
	System.out.println("El número 1234 al añadirle el 7 queda :" +  biblioteca.matematicas.agregarDigitosDetras(1234, 7));
	
	//agregarDigitosDelante
	System.out.println("El número 2891 al añadirle el 6 delante queda :" +  biblioteca.matematicas.agregarDigitosDelante(2891, 6));
	
	//Juntardigitos
	System.out.println("Si juntamos el numero 1234 y el 87 obtenemos :" +  biblioteca.matematicas.juntarDigitos(1234, 87));
	
	
  }
}
