public class Tabla {
    int i=0; 
    Empleado[] T;//FORMA RECOMENDADA
     public Tabla(){
        this.T=new Empleado[1000];
     }

     public int aModular(int id){
        return id%997;
     }

     public void Insert(Empleado per){
        T[aModular(per.id)]=per;  
       
     }
     public void ShowTable() {
      for (int i = 0; i < 999; i++) {
        if (T[i] != null) {
          System.out.println("[" + i + "]: " + T[i].name + " (ID: " + T[i].id + ")");
        }
      }
    }
}
