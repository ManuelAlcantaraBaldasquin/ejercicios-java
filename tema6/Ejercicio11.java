/**
 *
 * 
 * 11. Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la
 *     forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de
 *     suspensos, el número de suficientes, el número de bienes, etc.
 *
 * @author Manolo
 */

public class Ejercicio11 {

  public static void main(String[] args) {
    
    int nota;
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    
    for(int i = 0; i < 20; i++) {
      
      nota = (int)(Math.random() * 5);//aleatoriamente una de las 5 notas
      
      switch(nota) {
        case 0:
          System.out.print("suspenso ");
          suspenso++;
          break;
        case 1:
          System.out.print("suficiente ");
          suficiente++;
          break;
        case 2:
          System.out.print("bien ");
          bien++;
          break;
        case 3:
          System.out.print("notable ");
          notable++;
          break;
        case 4:
          System.out.print("sobresaliente ");
          sobresaliente++;
          break;
        default:
      }

    }
    System.out.println();
    System.out.println("Suspensos: " + suspenso);
    System.out.println("Suficientes: " + suficiente);
    System.out.println("Bienes: " + bien);
    System.out.println("Notables: " + notable);
    System.out.println("Sobresalientes: " + sobresaliente);
  }
}
