package HolaMundo;
import java.util.Scanner;

public class ejercicio3 {
public static void main(String[] args) {
	//Crea un objeto de captura desde el teclado Scanner
	Scanner scanterm = new Scanner(System.in);
	
	//Crea una variable de tipo cadena
	String termvar;
	
	//Muestra un mensaje en pantalla
	System.out.println(" Mensaje :D");
	
	//Asignación de lo capturado por teclado a la variable de cadena termvar
	termvar = scanterm.nextLine();
	
	//Crea un objeto de captura desde el teclado Scanner
	Scanner scandef = new Scanner (System.in);
	
	//Crea una variable de tipo cadena
	String termdef;
	
	//Muestra un mensaje  de pantalla
	System.out.println ("Enter a definition");
	
	//Asignación de lo capturado por teclado a la variable de cadena termvar
	termdef = scandef.nextLine();
	
	//Muestra el mensaje de pantalla donde concatena las dos variables de cadena
	System.out.println (termvar + ": " +termdef);
	
	//El método "Close" cierra el objeto scanterm
	scanterm.close();
	scandef.close();
	
	}
}


