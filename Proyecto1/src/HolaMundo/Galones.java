package HolaMundo;
import java.util.Scanner;
	public class Galones {
		public static void main(String[] args) {
	
Scanner entrada = new Scanner(System.in);

double galones;
double ope;

System.out.println("Ingrese la cantidad de galones");
galones = entrada.nextDouble();

ope = galones * 3785;

System.out.println("El valor es: " +ope);

	}
}

	
	
	