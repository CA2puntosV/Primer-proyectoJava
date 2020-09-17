/*
 * 7. Desarrollar un algoritmo que permita calcular los siguientes
datos de una fiesta:
¿Cuántas personas asistieron a la fiesta?
¿Cuántos hombres y cuantas mujeres?
-Promedio de edades por sexo.
-La edad de la persona más joven que asistió.
Programación con el lenguaje Java
Consideraciones:
-No se permiten menores de edad a la fiesta.
-Ingresar datos hasta que se ingrese una edad igual a cero.
 */
package HolaMundo;

import javax.swing.JOptionPane;

/**
 *
 * @author Flia Administrador
 */
public class ejercicio7 {
    
    public static void main(String[]args){
        String edad,edad1;
        int cont=1;
        int cont1=1;
        int edadH = 1;
        int edadM= 1;
        int edad_joven=1000;
        double promedio_edadH=0;
        double promedio_edadM=0;
        int cantHombres=0;
        int cantMujeres=0;
        int cantPersonas=0;
        int sumaH=0;
        int sumaM=0;
        
        JOptionPane.showMessageDialog(null, "Digite las edades de los hombres que asistieron a la fiesta.");
    
    while (edadH != 0 ){
              edad=JOptionPane.showInputDialog(null, "Edad: "+cont);
              edadH=Integer.parseInt(edad);
              if (edadH>=18){
                if (edadH<edad_joven){
                    edad_joven=edadH;
                }
                cantHombres++;
                cont++;
                sumaH=sumaH+edadH;
              }else{
                    JOptionPane.showMessageDialog(null, "No se permiten menores de edad a la fiesta.", "Error",0);
              }           
    }
    
    JOptionPane.showMessageDialog(null, "Digite las edades de las mujeres que asistieron a la fiesta.");

    while (edadM != 0){
              edad1=JOptionPane.showInputDialog(null, "Edad: "+cont1);
              edadM=Integer.parseInt(edad1);
              if (edadM>=18){
                if (edadM<edad_joven){
                    edad_joven=edadM;
                }
                cantMujeres++;
                cont1++;
                sumaM=sumaM+edadM;
              }else{
                    JOptionPane.showMessageDialog(null, "No se permiten menores de edad a la fiesta.","Error",0);
              }           
   } 
    promedio_edadH=sumaH/cantHombres;
    promedio_edadM=sumaM/cantMujeres;
    cantPersonas=cantHombres+cantMujeres;
    
   JOptionPane.showMessageDialog(null, "La cantidad de personas que asistieron a la fiesta es: " + cantPersonas+"\n"+
           "Cantidad de hombres: "+cantHombres+"\n"+
           "Cantidad de mujeres: "+cantMujeres+"\n"+
           "Promedio edad hombres: "+promedio_edadH+"\n"+
           "Promedio edad mujeres: "+promedio_edadM+"\n"+
           "Edad mas joven: "+edad_joven);    
    }
}
