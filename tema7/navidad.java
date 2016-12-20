/**
 *
 * 
 * @author Manuel Alcántara
 */
public class navidad {
  public static void main(String[] args) {
  
    System.out.print("Introduzca la altura");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    int espacios = alturaIntroducida - 2;
    int relleno = 1;
    
    for (int  =  0; i < alturaIntroducida; i++){
		
		for (int j = 0; j < espacios; j++{
			System.out.print(" ");
			}
	
		for (int j = 0; j < relleno; j++){
					
		switch((int)(Math.random() * 9)) {
        case 0:
          adorno = "*";
          break;
        case 1:
          adorno = "O";
          break;
        case 2:
          adorno = "O";
          break;
        case 3:
          adorno = "^";
          break;
        case 4:
          adorno = "^";
          break;
        case 5:
          adorno = "^";
          break;
        case 6:
          adorno = "^";
          break;
        case 7:
          adorno = "^";
          break;
        case 8:
          adorno = "^";
          break;
        case 9:
          adorno = "^";
          break;
        default:
      }
		
			}
	espacios --;
	relleno++;
	}
    }
  }
}
