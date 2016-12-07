/**
 * 
 * 10. Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 *     El carácter con el que se pinta cada línea se elige de forma aleatoria entre
 *     uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
 *     aleatoria entre 1 y 40 caracteres.
 *
 * @author Manolo
 */
public class Ejercicio10 {

  public static void main(String[] args) {
    
    int aleatorio;
    int longitud;
    String relleno = "";
    
    for(int linea = 1; linea <= 10; linea++) { //bucle para hacer 10 líneas
      
      longitud = (int)(Math.random() * 40) + 1; //aleatoriamente la longitud
      aleatorio = (int)(Math.random() * 6); //elegir aleatoriamente el tipo de caracter
      
      switch(aleatorio) {
        case 0:
          relleno = "*";
          break;
        case 1:
          relleno = "-";
          break;
        case 2:
          relleno = "=";
          break;
        case 3:
          relleno = ".";
          break;
        case 4:
          relleno = "|";
          break;
        case 5:
          relleno = "@";
          break;
        default:
      }
      
      
      for(int i = 1; i <= longitud; i++) { //pintar la línea
        System.out.print(relleno);
      }
      System.out.println();
    }
  }
}
