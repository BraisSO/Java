public class Main {
 
    public static void main(String[] args) {
        Cientifico cientificos[]=new Cientifico [4];
        Departamento departamento= new Departamento("Ciencia",25,129, cientificos);  

        for (int i=0; i<cientificos.length;i++){
            if(cientificos[i]==null){
                cientificos[i]=departamento.inscribirCientifico();
                break;
           }   
        }
        departamento.setCientificos(cientificos);

        departamento.asignarPresupuesto();

        
        departamento.verDepartamento();
        departamento.eliminarDelDepartamento("estrellu");
        departamento.verDepartamento();

    }
}
