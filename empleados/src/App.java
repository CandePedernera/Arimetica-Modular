import java.time.LocalDate;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner Leer;
        Empleado emp1=null; 
        //Empleado [] T; 
        Tabla tablaHash= new Tabla(); 
        //Arr=new Empleado [m];
        Leer= new Scanner(System.in); 
        float salario; 
        String name, puesto; 
        int op, id; 
        do {
            System.out.println("Ingresa una opción");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Arimetica mod, insertar y muestra");
            System.out.println("3. Salir");
            op= Leer.nextInt(); 
            Leer.nextLine(); 
            
            switch (op) {
                case 1:
                    System.out.println("Ingresa el nombre: ");
                    name= Leer.nextLine(); 
                    System.out.println("Ingresa el salario: ");
                    salario= Leer.nextFloat(); 
                    Leer.nextLine(); 
                    System.out.println("Ingresa el puesto:");
                    puesto= Leer.nextLine(); 
                    System.out.println("Cual es la clave del empleado?");
                    id= Leer.nextInt(); 
                    Leer.nextLine(); 
                    emp1= new Empleado(name, salario, puesto, id); 
                    break;
                case 2: 
                    System.out.println("1. Arimetica modular");
                    tablaHash.Insert(emp1);
                    tablaHash.ShowTable();     

                default:
                    break;
            }

        } while (op!=3);

    }
}
