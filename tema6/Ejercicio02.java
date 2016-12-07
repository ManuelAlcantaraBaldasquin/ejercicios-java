/**
 *
 * 
 * muestra una carta al azar de la baraja francesa
 * @author Luis José Sánchez
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    
    String tipoPalo = "";
    String carta = "";
    
    int numeroPalo = (int)(Math.random()*4) + 1;
    
    switch(numeroPalo) {
      case 1:
        tipoPalo = "picas";
        break;
      case 2:
        tipoPalo = "corazones";
        break;
      case 3:
        tipoPalo = "diamantes";
        break;
      case 4:
        tipoPalo = "tréboles";
      default:
    }

    int numeroCarta = (int)(Math.random()*13) + 1;
    
    switch(numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 11:
        carta = "J";
        break;
      case 12:
        carta = "Q";
        break;
      case 13:
        carta = "K";
        break;
      default:
        carta = String.valueOf(numeroCarta);
    }
    
    System.out.println(carta + " de " + tipoPalo);
  }
}
