/**
 * segundos hasta medianoche
 *
 *
 * @author Manolo
 */

public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.println("Cuantos segundos quedan hasta las 12 de la noche ");
    System.out.print("Introduzca hora (1-23) ");
    int hora = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca minuto (0-59): ");
    int minutos = Integer.parseInt(System.console().readLine());

    int segundosTotales = (hora * 3600) + (minutos * 60);
    int segundosRestantes = (24 * 3600) - segundosTotales;
    
 
        System.out.println("Quedan " + segundosRestantes + " segundos hasta la medianoche.");
    }
  }
