import java.util.Random;
import java.util.Scanner;

/**
 * Clase Amigo
 * Modela una Amigo y muestra la cantidad de dinero disponible para comprar anuncios.
 * 
 * @author Isaac Solórzano Q.
 * @version 14/08/2021
 */
class Amigo {
	
	//PROPIEDADES DE LA CLASE
	
	/**
	 * propiedad rand permitirá generar números aleatorios más adelante
	 */
	private Random rand;
	
	/**
	 * Nombre de la Amigo
	 */
	public String NombrePersona;
	
	/**
	 * Número de contacto de la Amigo
	 */
	public String NumContacto;
	
	/**
	 * Cantidad disponible para gastar en anuncios, tanto en el períodico como en los postes
	 */
	public float CantidadDisp;
	
	/**
	 * Cantidad que el dueño del Perrito está dispuesto a pagar si alguien encuentra al Perrito.
	 */
	public float CantidadRecompensa;
	
	/**
	 * Indicador de la suerte que tendrá la Amigo para encontrar a su Perrito cuando llame a la perrera.
	 */
	public float SuerteLlamarPerrera;
	
	/**
	 * Indicador de la suerte que tendrá la Amigo para encontrar a su Perrito cuando imprima un anucio en los postes de la ciudad.
	 */
	public float SuerteImprimirAnuncio;
	
	/**
	 * Indicador de la suerte que tendrá la Amigo para encontrar a su Perrito cuando publique un anuncio en el periódico.
	 */
	public float SuertePublicarAnuncio;
	
	//METODOS CONTRUCTORES
	
	/**
	 * Asigna valores automáticos a las propiedades de la Amigo
	 * @version 14/08/2021
	 * @param a El parametro 'a' sirve unicamente para definir la firma del método y poder diferenciarlo del otro constructor
	 */
	public Amigo (int a){
		NombrePersona = "Fulano";
		NumContacto = "52698564";
		rand = new Random();
		CantidadDisp = rand.nextFloat()*1000;
		CantidadRecompensa = 100;
		SuerteLlamarPerrera = 5;
		SuerteImprimirAnuncio = 10;
		SuertePublicarAnuncio = 15;
	}
	
	/**
	 * Asigna valores a las propiedades de la Amigo en función de los datos ingresados por el usuario
	 * @version 14/08/2021
	 * @param b El parametro 'b' sirve unicamente para definir la firma del método y poder diferenciarlo del otro constructor
	 */
	public Amigo (String b){
		Scanner scanns = new Scanner(System.in);
		System.out.println("\nIngrese el nombre del amigo");
		NombrePersona = scanns.nextLine();
		
		System.out.println("\nIngrese un numero telefonico de contacto");
		NumContacto = scanns.nextLine();
		
		System.out.println("\nIngrese el monto de la recompensa (en quetzales)");
		CantidadRecompensa = scanns.nextFloat();
		
		Random rand;
		rand = new Random();
		CantidadDisp = rand.nextFloat()*1000;
		
		
		SuerteLlamarPerrera = rand.nextFloat()*20;
		SuerteImprimirAnuncio = rand.nextFloat()*20;
		SuertePublicarAnuncio = rand.nextFloat()*20;
	}
	
	//METODOS PUBLICOS
	
	/**
	 * Crea un mensaje en el que se indica la cantidad de dinero disponible para comprar anuncios
	 * @param per Es una instancia de la clase Amigo
	 * @version 14/08/2021
	 * @return El mensaje creado por el método
	 */
	public String MostrarDineroDisp(Amigo per){
		String mensaje = "Actualmente dispone de: Q" + per.CantidadDisp;
		return mensaje;
	}
}