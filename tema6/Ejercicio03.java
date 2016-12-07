/**
 *
 * Saca una carta aleatoria de la baraja española
 *
 * @author Luis José Sánchez
 */
public class Ejercicio03 {

  public static void main(String[] args) {
    
    String tipoPalo = "";
    String carta = "";
    
    switch((int)(Math.random()*4)) {
      case 0:
        tipoPalo = "oros";
        break;
      case 1:
        tipoPalo = "copas";
        break;
      case 2:
        tipoPalo = "bastos";
        break;
      case 3:
        tipoPalo = "espadas";
      default:
    }
    
    int numeroCarta = (int)(Math.random()*11) + 1;
    
    switch(numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 8:
        carta = "Sota";
        break;
      case 9:
        carta = "Caballo";
        break;
      case 10:
        carta = "Rey";
        break;
      default:
        carta = String.valueOf(numeroCarta);
    }
    
    System.out.println(carta + " de " + tipoPalo);
  }
}
