/**
 * Test de infidelidad
 *
 * @author Manolo
 * 
 */
public class Ejercicio16 {

  public static void main(String[] args) {
    
    String respuesta;
    int puntos = 0;
    
    System.out.println("¿Es tu pareja infiel? ");

    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }

    System.out.print("2. Ha aumentado sus gastos de vestuario.\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti.\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }

    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("5. No te deja que mires la agenda de su teléfono móvil.\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    
    if ( puntos <= 6 ) {
      System.out.print("Tu pareja es fiel");
    }
    
    if ( (puntos > 6 ) && (puntos <= 12) ) {
      System.out.print("Puede que sea infiel");    
    }
    
    if ( puntos >= 12 ) {
      System.out.print("Mala suerte, tu pareja parece ser infiel");
    }
  }
}
