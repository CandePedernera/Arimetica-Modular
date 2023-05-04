/*import java.time.LocalDate;
import java.util.Scanner;*/
public class App {
    public static void main(String[] args) throws Exception {
        
        Tabla tablaHash= new Tabla(); 
        //Arr=new Empleado [m];
        
        Empleado emp1, emp2, emp3; 
        emp1= new Empleado("candela", 234, "CEO", 1200); 
        emp2= new Empleado("Nahir", 234, "CEO", 1500);
        emp3= new Empleado("Pedernera", 234, "CEO", 1700);
        System.out.println( "Arimetica modular");
        tablaHash.Insert(emp1);
        tablaHash.Insert(emp2);
        tablaHash.Insert(emp3);
        tablaHash.MostrarTabla();     
    }
}
