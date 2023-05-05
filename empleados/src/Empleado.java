//import java.time.LocalDate;
public class Empleado {
    String name, puesto; 
    float salario; 
    //LocalDate date; 
    int id;
    int j; 
    // constructor 1
    public Empleado(String name, float salario, int id){
        this.name= name; 
        this.salario=salario; 
        this.id=id; 
    }
    // constructor 2 
    public Empleado(String name, float salario, String puesto, int id){
        this.id=id;
        this.name=name; 
        this.salario=salario; 
        this.puesto=puesto; 
    }
    //Constructor 3 
    /*public Empleado(String name, float salario, String puesto, LocalDate date, int id){
        this.name=name; 
        this.salario=salario; 
        this.puesto=puesto; 
        this.date= date;
        this.id= id; 
    }*/


}
