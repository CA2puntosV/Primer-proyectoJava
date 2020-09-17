package HolaMundo;
import javax.swing.JOptionPane;
public class Dolar_peso {
	public static void main(String[] args) {
	
	double peso = 3769;	
		
	double Cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese La Cantidad de Dólares a convertir"));
	
	double ope = Cantidad* peso;
	
	JOptionPane.showInputDialog(null, "La cantidad de dólares a pesos colombianos es: ",ope);
	
	}
}


