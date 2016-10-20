/**
 * Cual es la primera cifra
 *
 * @author Manolo
 */
public class Ejercicio18 {

  public static void main(String[] args) {
    
    int n, primeraCifra = 0;
    
    System.out.print("Introduce un número entero de máximo 5 cifras: ");
    n = Integer.parseInt(System.console().readLine());
    
    if ( n < 10 ) {
      primeraCifra = n;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      primeraCifra = n / 10;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      primeraCifra = n / 100;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      primeraCifra = n / 1000;
    }
    
    if ( n >= 10000 ) {
      primeraCifra = n / 10000;
    }
    
    System.out.println("La primera cifra del número introducido es el " + primeraCifra );
  }
}
