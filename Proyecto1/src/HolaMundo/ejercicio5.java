/*
 * Desarrollar un algoritmo que calcule el salario neto que debe recibir un vendedor de un almacén. 
Se debe tener en cuenta si tiene derecho o no al auxilio de transporte. Para el desarrollo del ejercicio tenga en cuenta las siguientes formulas:
Sueldo devengado = salario básico * días laborados / 30
Días laborados = debe ser entre 1 y 30.
Auxilio de Transporte: Lo reciben los empleados cuyo salario básico
sea menor o igual a 2 salarios mínimos legales vigentes.
Salario Mínimo Legal Vigente (2013): 589500
Auxilio de Transporte = 70500 * días laborados / 30 (año 2013 en Colombia).
Comisión de Ventas: En la empresa se tiene estipulado dar una
comisión de ventas del 2% sobre las ventas del mes de cada vendedor.
Total devengado = sueldo devengado + comisión de ventas.
Total deducciones = descuentos por prestamos.
Salario Neto = Total devengado – Total deducciones.
Como resultado del ejercicio se debe imprimir en pantalla lo siguiente:
Cedula empleado: XXXXXX
Nombre Empleado: XXXXXXX
Salario Básico: XXXXXX
Auxilio de Transporte: XXXXXX
Comisión de Ventas: XXXXXX
Préstamos: XXXXXX
Salario Neto a Recibir: XXXXX
 */
package HolaMundo;

import javax.swing.JOptionPane;

/**
 *
 * @author Flia Deimer Hernandez
 */
public class ejercicio5 {
    
    
    public static void main(String[] args){
        String ced;
        String nEmpleado;
        String salariob;
        String dias_lab;
        String ventasr;
        String deducciones;
        double salario_basico,ventas,prestamos,dias_laborados,Comision;
        int cedula;
        double auxilio_de_transporte=0;
        double sueldoDevengado=0;
        double Total_deducciones=0;
        double total_devengado;
        double salarioNeto=0;       
            
        ced = JOptionPane.showInputDialog(null,"Ingrese Cedula del empleado: ");
        cedula = Integer.parseInt(ced);
        nEmpleado = JOptionPane.showInputDialog(null,"Ingrese Nombre del empleado: ");
        salariob=JOptionPane.showInputDialog("Ingrese Salario basico del empleado: ");
        salario_basico = Double.parseDouble(salariob);
        dias_lab=JOptionPane.showInputDialog("Ingrese dias laborados: ");
        dias_laborados = Double.parseDouble(dias_lab);
        ventasr=JOptionPane.showInputDialog("Ingrese ventas generadas: ");
        ventas=Double.parseDouble(ventasr);
        deducciones=JOptionPane.showInputDialog("Ingrese Prestamos del empleado: ");
        prestamos=Double.parseDouble(deducciones);
        
        sueldoDevengado = salario_basico*dias_laborados/30;   
        auxilio_de_transporte = 102854*dias_laborados/30;
        Comision = ventas*0.02;
        total_devengado = sueldoDevengado + Comision;
        Total_deducciones =  prestamos;
                
        if (salario_basico <= 877803*2) {
        total_devengado = total_devengado + auxilio_de_transporte;
        salarioNeto= total_devengado - Total_deducciones;
                }

        if (salario_basico > 877803*2) {
           auxilio_de_transporte=0;
           salarioNeto= total_devengado-Total_deducciones;
        }
            
               
        JOptionPane.showMessageDialog(null, "Cedula del empleado: "+cedula+"\n Nombre del empleado: "+nEmpleado+ "\n Salario basico: " +salario_basico+
                "\n Auxilio de transporte: "+ auxilio_de_transporte +"\n Comision por ventas: "+Comision+"\n Prestamos: "+ prestamos+"\n Neto a pagar: "+salarioNeto);
    }
}
