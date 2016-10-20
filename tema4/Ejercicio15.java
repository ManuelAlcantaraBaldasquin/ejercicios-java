/**
 * Dibujar una pirámide según el caracter introducido
 *
 * @author Manolo
 */
public class Ejercicio15 {

	public static void main(String[] args) {
				

		System.out.println("Introduce un carácter para dibujar una pirámide y pulse enter");
    System.out.println("ahora elija una de las 4 opciones y pulse enter");
		System.out.println("1. Pirámide hacia arriba");
		System.out.println("2. Pirámide hacia abajo");
		System.out.println("3. Pirámide hacia la izquierda");
		System.out.println("4. Pirámide hacia la derecha");


    String p = System.console().readLine();
		int opcion = Integer.parseInt(System.console().readLine());

		switch(opcion) {
			case 1:
        System.out.println("   " + p);
        System.out.println("  " + p + p + p);
        System.out.println(" " + p + p + p + p + p);
        System.out.println(p + p + p + p + p + p + p);
        break;

			case 2:
        System.out.println(p + p + p + p + p + p + p);
        System.out.println(" " + p + p + p + p + p);
        System.out.println("  " + p + p + p);
        System.out.println("   " + p);
        break;

			case 3:
        System.out.println("      " + p);
        System.out.println("    " + p + " " + p);
        System.out.println("  " + p + " " + p + " " + p);
        System.out.println(p + " " + p + " " + p + " " + p);
        System.out.println("  " + p + " " + p + " " + p);
        System.out.println("    " + p + " " + p);
        System.out.println("      " + p);
        break;

			case 4:
        System.out.println(p);
        System.out.println(p + " " + p);
        System.out.println(p + " " + p + " " + p);
        System.out.println(p + " " + p + " " + p + " " + p);
        System.out.println(p + " " + p + " " + p);
        System.out.println(p + " " + p);
        System.out.println(p);
        break;

      default:
		}
	}
}
