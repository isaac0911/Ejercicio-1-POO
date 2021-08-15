import java.util.Scanner;
import java.util.Random;

/**
 * Clase Perrito
 * Modela un Perrito y permite relizar una serie de acciones como llamar a la perrera, así como publicar un anuncio en los postes o en el periódico
 * 
 * @author Isaac Solórzano Q.
 * @version 14/08/2021
 */
class Perrito {
	
	//PROPIEDADES DE LA CLASE
	
	/**
	 * Nombre del Perrito
	 */
	public String NombrePerro;
	
	/**
	 * Raza del Perrito
	 */
	private String Raza;
	
	/**
	 * Sexo del Perrito
	 */
	private String Sexo;
	
	/**
	 * Edad del Perrito
	 */
	private String Edad;
	
	/**
	 * Estado del Perrito: encontrado o perdido. Si está encontrado, tendrá un valor de true
	 */
	public Boolean EncontradoONo;
	
	//METODOS CONTRUCTORES
	
	/**
	 * Asigna valores automáticos a las propiedades del Perrito
	 * @version 14/08/2021
	 * @param a El parametro 'a' sirve unicamente para definir la firma del método y poder diferenciarlo del otro constructor
	 */
	public Perrito (int a){
		NombrePerro = "Firulais";
		Raza = "San Bernardo";
		Sexo = "Macho";
		Edad = "10";
		EncontradoONo = false;
	}
	
	/**
	 * Asigna valores a las propiedades del Perrito en función de los datos ingresados por el usuario
	 * @version 14/08/2021
	 * @param b El parametro 'b' sirve unicamente para definir la firma del método y poder diferenciarlo del otro constructor
	 */
	public Perrito (String b){
		Scanner scann = new Scanner(System.in);
		
		System.out.println("\nIngrese el nombre del Perrito.");
		NombrePerro = scann.nextLine();
		
		System.out.println("\nIngrese la raza del Perrito.");
		Raza = scann.nextLine();
		
		System.out.println("\nIngrese la edad del Perrito.");
		Edad = scann.nextLine();
		
		System.out.println("\nIngrese el numero correspondiente con el sexo del Perrito\n1. Macho\n2. Hembra");
		int sex = scann.nextInt();
		while (sex != 1 && sex != 2){
			System.out.println("\nERROR. Ingrese un numero valido\n1. Macho\n2. Hembra");
			sex = scann.nextInt();
		}
		if (sex == 1){
			Sexo = "Macho";
		}else {
			Sexo = "Hembra";
		}
		
		EncontradoONo = false;
	}
	
	//METODOS PUBLICOS
	
	/**
	 * Genera un numero aleatorio entre 1 y 20, y si es menor que el número que indica la suerte (SuerteLlamarPerrera), el Perrito habrá sido encontrado
	 * @version 14/08/2021
	 * @param p Es una instacia de la clase Perrito
	 * @param per Es una instancia de la clase Amigo
	 * @return Devuelve el mensaje que indica si el Perrito fue o no encontrado
	 */
	public String LlamarPerrera(Perrito p, Amigo per){

		String mensaje = "Su Perrito sigue perdido";
		
		Random rand;
		rand = new Random();
		float aleatorio = rand.nextFloat()*20;
		if (aleatorio<per.SuerteLlamarPerrera){
			p.EncontradoONo = true;
			mensaje = "\nSu Perrito ha sido encontrado!!! :)";
		}
		return mensaje;
	}
	
	/**
	 * Imprime el anuncio de los postes en la pantalla y genera un numero aleatorio entre 1 y 20; si este es menor que el número que indica la suerte (SuerteImprimirAnuncio), el Perrito habrá sido encontrado. 
	 * @version 14/08/2021
	 * @param p Es una instacia de la clase Perrito
	 * @param per Es una instancia de la clase Amigo
	 * @return Devuelve el mensaje que indica si el Perrito fue o no encontrado
	 */
	public String ImprimirAnuncio(Perrito p, Amigo per){
		String anuncio = "\n------------------------------------------------------------------\nATENCION: Perrito PERDIDO\nNombre: " + p.NombrePerro + "\nRaza: " + p.Raza + "\nSexo: " + p.Sexo + "\nEdad: " + p.Edad + "\nLo busca: " + per.NombrePersona + "\nNumero de contacto: " + per.NumContacto + "\nRecompensa: Q" + per.CantidadRecompensa + "\n------------------------------------------------------------------";
		System.out.println(anuncio);
		
		per.CantidadDisp = per.CantidadDisp - 25;
		
		String mensaje = "\nEl anuncio fue publicado exitosamente en los postes de la ciudad\n\nEl Perrito sigue perdido :(";
		
		Random rand;
		rand = new Random();
		float aleatorio = rand.nextFloat()*20;
		if (aleatorio<per.SuerteImprimirAnuncio){
			p.EncontradoONo = true;
			mensaje = "\nEl anuncio fue publicado exitosamente en el los postes de la ciudad\n\nENCONTRARON A SU Perrito!!!!";
		}
		return mensaje;
	}
	
	/**
	 * Imprime el anuncio del periodico en la pantalla y genera un numero aleatorio entre 1 y 20; si este es menor que el número que indica la suerte (SuertePublicarAnuncio), el Perrito habrá sido encontrado. 
	 * @version 14/08/2021
	 * @param p Es una instacia de la clase Perrito
	 * @param per Es una instancia de la clase Amigo
	 * @return Devuelve el mensaje que indica si el Perrito fue o no encontrado
	 */
	public String PublicarAnuncio(Perrito p, Amigo per){
		String anuncio = "\n------------------------------------------------------------------\nATENCION: Perrito PERDIDO\nNombre: " + p.NombrePerro + "\nRaza: " + p.Raza + "\nSexo: " + p.Sexo + "\nEdad: " + p.Edad + "\nLo busca: " + per.NombrePersona + "\nNumero de contacto: " + per.NumContacto + "\nRecompensa: Q" + per.CantidadRecompensa + "\n------------------------------------------------------------------";
		System.out.println(anuncio);
		
		per.CantidadDisp = per.CantidadDisp - 125;
		
		String mensaje = "\nEl anuncio fue publicado exitosamente en el periodico\n\nEl Perrito sigue perdido :(";
		
		Random rand;
		rand = new Random();
		float aleatorio = rand.nextFloat()*20;
		if (aleatorio<per.SuertePublicarAnuncio){
			p.EncontradoONo = true;
			mensaje = "\nEl anuncio fue publicado exitosamente en el periodico\n\nENCONTRARON A SU Perrito!!!!";
		}
		return mensaje;
	}
}