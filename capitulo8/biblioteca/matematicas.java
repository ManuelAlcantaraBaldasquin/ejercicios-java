package biblioteca;

public class matematicas {

    
  /**
  * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
    falso en caso contrario.
  * 
  * @param x número del que se quiere saber si es capicúa
  * @return  verdadero si el número que se pasa como parámetro es capicúa y
  *          falso en caso contrario
  */
  public static boolean esCapicua(int x) {   
    int aux = 0;
    int g = 0;
    int aux2 = x;
    
   do{
     aux = aux2 % 10;
     aux2 = aux2 / 10;
     g = g * 10 + aux;
   }while (aux2 > 0);
  
    if (x == g){
     return true; 
    }
    else{
      return false;
    }
}    
  /**
  * Devuelve verdadero si el número que se pasa como parámetro es primo
  * 
  * @param x número del que se quiere saber si es primo
  * @return  verdadero si el número que se pasa como parámetro es primo y
  *          falso en caso contrario
  */
    
   public static boolean esPrimo(int x) {   
    int aux = 1;
    int aux2 = 0;
    
   do{
      if (x % aux == 0){
        aux2 ++;
      }
      aux ++;
   }while (aux <= x);
  
    if (aux2 == 2){
     return true; 
    }
    else{
      return false;
    }
}
  /**
  /* Devuelve el menor primo que es mayor al número que se pasa como parámetro.
  *
  * @param x un número entero
  * @return  el menor primo que es mayor al número que se pasa como parámetro
  */
	public static int siguientePrimo(int x) {
		while (!esPrimo (++x));
		return x;
	}
	
  /**
  /* Devuelve la potencia a partir de la base y del exponente
  *
  * @param n un número entero
  * @return la potencia
  */
	public static int potencia(int base, int exponente) {
		return base * exponente;
		}
	
 /**
  /* Contar el número de dígitos
  *
  * @param x un número entero introducido
  * @return el número de dígitos
  */
	public static int digitos(int x) {
    int nDigitos = 1;
    while (x > 10) {
      x /= 10;
      nDigitos++;
    }
    return nDigitos;
		}
 /**
  /* mostrar el número volteado
  *
  * @param x un número introducido
  * @return el número volteado
  */
	public static int voltea(int x) {
    if (x < 0) {
      return -voltea(-x);
    }
    int volteado = 0;
    while(x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }
    return volteado;
  }
	
/**
  /* Devuelve el dígito que está en la posición n de un número
  * entero. Se empieza contando por el 0 y de izquierda a derecha.
  * Ej: 8732 si elige posición 2 devolverá 7
  * @param n un número introducido
  * @param p la posición elegido 
  * @return el número volteado
  */
	public static int nDigito(int x, int n) {
    x = voltea(x);

    while (n-- > 0) {
      x = x / 10;
    }

    return (int)x % 10;
  }
	
/**
  /* Da la posición de la primera ocurrencia de un dígito
  *dentro de un número entero. Si no se encuentra, devuelve -1.
  * 
  * @param x un número introducido
  * @param o número a buscar
  * @return posición en la que está el número elegido
  */
  
 public static int pDigito (int x, int o) {
	 int i;
	 for (i = 0;(i < digitos(x)) && (nDigito(x,i) !=o); i++) {};
	 
	 if (i == digitos(x)) {
      return -1;
    } else {
      return i;
    }
	 }
	 
/**
  /* Le quita a una cifra un n de dígitos por detrás (por la
derecha).
  * 
  * @param x un número introducido
  * @param n numero de cifras que eliminas
  * @return la cifra sin los números que se han eliminado
  */
	public static int quitaDigitosDetras (int x, int n) {
	int contador = 0;
	do {
		while(contador < n) {
		x /= 10;
		contador ++;
	}	
	}while ((x > 0) && (n != contador));
		return x;
		}
/**
  /* Le quita a una cifra un n de dígitos por delante
  * 
  * @param x un número introducido
  * @param n numero de cifras que eliminas
  * @return la cifra sin los números que se han eliminado
  */		
	public static int quitaDigitosDelante (int x,int n) {
	int contador = 0;
	int numero = matematicas.voltea(x);
	
	do {
		while(contador < n) {
		numero /= 10;
		contador ++;
	}	
	}while ((numero > 0) && (n != contador));
		return matematicas.voltea(numero);
		}	
		
/**
  /* le añade a una cifra un número por detrás
  * 
  * @param x un número introducido
  * @param n digito a añadir por detrás
  * @return la cifra con el número añadido
  */
	public static int agregarDigitosDetras (int x, int n) {
		int r = (x*10) + n;
		return r;
		}
		
/**
  /* le añade a una cifra un número por delante
  * 
  * @param x un número introducido
  * @param n digito a añadir por delante
  * @return la cifra con el número añadido
  */
	public static int agregarDigitosDelante (int x, int n) {
		int numero = voltea(x);
		int r = (numero*10) + n;
		return voltea(r);
		}
/**
  /* Juntar 2 números
  * 
  * @param x un número introducido
  * @param x2 segundo número introducido
  * @return la cifra total
  */	
	public static int juntarDigitos (int x, int y) {
		int contador = 0;
		int numero = y;
		while (y > 0) {
			y /= 10;
			contador++;
		}
		
		for (int i = 0; i < contador; i++) {
			x *= 10;
		}
		int r = x+numero;
		return r;
		}
		
		
		
		
		
		
		
		
		
		
		
}
