package HolaMundo;
import javax.swing.JOptionPane;
public class Dolar_peso {
	public static void main(String[] args) {
	
	double peso = 3769;	
		
	double Cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese La Cantidad de D�lares a convertir"));
	
	double ope = Cantidad* peso;
	
	JOptionPane.showInputDialog(null, "La cantidad de d�lares a pesos colombianos es: ",ope);
	
	}
}


