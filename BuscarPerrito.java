import java.util.Scanner;

/**
 * Clase BuscarPerrito
 * Es el driver del progama. Muestra el menú y ejecuta los métodos correspondientes con la opción seleccionada por el usuario
 * 
 * @author Isaac Solórzano Q.
 * @version 14/08/2021
 */
class BuscarPerrito{
	
	/**
	 * El método main es el "cerebro" del programa. Muestra el menú y ejecuta los métodos correspondientes con la opción seleccionada por el usuario
	 * @version 14/08/2021
	 * @param args Es un array de Strings que debe aparecer obligatoriamente como argumento del método main en un programa Java
	 */
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		Amigo per = new Amigo(a);
		Perrito p = new Perrito(a);
		
		System.out.println("\n\nBIENVENIDO AL SISTEMA PARA BUSCAR PERROS.");
		
		int opcion = 0;
		
		while (opcion != 7){
		
			System.out.println("\nQue accion desea hacer?");
			System.out.println("1. \tNuevo amigo");
			System.out.println("2. \tNuevo Perrito");
			System.out.println("3. \tLlamar a la perrera");
			System.out.println("4. \tImprimir anunciona para colocar en postes");
			System.out.println("5. \tPublicar anuncio en el periodico local");
			System.out.println("6. \tMostrar cuanto dinero disponible hay aun para pagar anuncios");
			System.out.println("7. \tSalir\n");
			
			opcion = scan.nextInt();
			
			if (opcion == 1){
				String b = "0";
				Amigo nuevaPersona = new Amigo(b);
				per = nuevaPersona;
				System.out.println("\nSe ha creado un nuevo amigo.");
				
			} else if (opcion == 2){
				String b = "0";
				Perrito nuevoPerro = new Perrito(b);
				p = nuevoPerro;
				System.out.println("\nSe ha creado un nuevo Perrito.");
			
			} else if (opcion == 3){
				if (p.EncontradoONo){
					System.out.println("\nNo necesita realizar esta accion. Su Perrito ya fue encontrado.");
				}else{
					String mensaje = p.LlamarPerrera(p, per);
					System.out.println(mensaje);
				
					if (p.EncontradoONo == true){
						System.out.println("\nGracias por recoger al Perrito. La recompensa fue pagada automaticamente");
					}
				}
				
			} else if (opcion == 4){
				if (p.EncontradoONo){
					System.out.println("\nNo necesita realizar esta accion. Su Perrito ya fue encontrado.");
				}else{
					if (per.CantidadDisp>=25){
						String mensaje = p.ImprimirAnuncio(p, per);
						System.out.println(mensaje);
						if(p.EncontradoONo){
							System.out.println("\nGracias por recoger al Perrito. La recompensa fue pagada automaticamente");
						}
					}else{
						System.out.println("No cuenta con el dinero suficiente para realizar esta accion");
					}
				}
				
			} else if (opcion == 5){
				if (p.EncontradoONo){
					System.out.println("\nNo necesita realizar esta accion. Su Perrito ya fue encontrado.");
				}else{
					if (per.CantidadDisp>=125){
						String mensaje = p.PublicarAnuncio(p, per);
						System.out.println(mensaje);
						if(p.EncontradoONo){
							System.out.println("\nGracias por recoger al Perrito. La recompensa fue pagada automaticamente");
						}
					}else{
						System.out.println("No cuenta con el dinero suficiente para realizar esta accion");
					}
				}
			}else if (opcion == 6){
				String mensaje = per.MostrarDineroDisp(per);
				System.out.println(mensaje);
			}else if (opcion == 7){
				System.out.println("Feliz dia.\nMantenga vigilado a "+ p.NombrePerro + " :)");
			}
		}
	}
}