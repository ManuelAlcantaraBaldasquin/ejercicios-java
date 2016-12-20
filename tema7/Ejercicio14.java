/**
 * Pide 8 palabras y almacenalas en un array.Las palabras que sean colores
 * deben almacenarse al principio y el resto al final.Los colores que conoce 
 * el programa deben estar en otro array y son los siguientes: verde, rojo, 
 * azul, amarillo, naranja, rosa, negro,blanco y morado.
 *
 *
 * @author Manuel Alcántara
 */
public class Ejercicio14 {
  public static void main(String[] args) {

    String[] color = {
      "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro ", "blanco", "morado"
    };

    String[] palabra = new String[8];
    String[] resultado = new String[8];

    System.out.println("Introduce 8 palabras y pulsa enter después de cada una");
    
    int i = 0;
    int j = 0;
    
    for (i = 0; i < 8; i++) {//pedir 8 palabras y almacenarlas
      palabra[i] = System.console().readLine();

      for (String c : color) {//las que son colores guardarlas en resultado
        if (palabra[i].equals(c)) {
          resultado[j++] = c;
        }
      }
    }

    //El resto de palabras al final
    for (i = 0; i < 8; i++) {
      boolean esColor = false;

      for (String c : color) {
        if (palabra[i].equals(c)) {
          esColor = true;
        }
      }

      if (!esColor) {
        resultado[j++] = palabra[i];
      }
    }

    // Muestra el array original.  
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    for (i = 0; i < 8; i++) {
      System.out.printf("│   %d    ", i);
    }
    System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

    for (String p : palabra) {
      System.out.printf("│%-8s", p);
    }
    System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");

    // Muestra el array resultado.  
    System.out.println("\n\nArray resultado:");
    System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    for (i = 0; i < 8; i++) {
      System.out.printf("│   %d    ", i);
    }
    System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

    for (String r : resultado) {
      System.out.printf("│%-8s", r);
    }
    System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
  }
}
