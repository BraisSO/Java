import java.util.Scanner;

public class Departamento {
    private String nombre;
    private int antiguedad;
    private int presupuesto;
    private Cientifico cientificos[] = new Cientifico[4];
  

    
    public Departamento(String nombre, int antiguedad, int presupuesto, Cientifico[] cientificos) {
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.presupuesto = presupuesto;
        this.cientificos = cientificos;
    }

    public Departamento() {
    }


    public String getNombre() {
        return nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public Cientifico[] getCientificos() {
        return cientificos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setCientificos(Cientifico[] cientificos) {
        this.cientificos = cientificos;
    }

    //metodos
    public void verDepartamento() {
        System.out.format("Nombre: %s, Antigüedad:%d, Presupuesto=%d", getNombre(), getAntiguedad(), getPresupuesto());
        for (Cientifico cientifico : cientificos) {
            if(cientifico!=null){
            System.out.format(" Cientificos=[%s , %s, %d,%d], Investigacion=[%d, %s]", cientifico.getNombre(), cientifico.getApellidos(), cientifico.getExperiencia(),cientifico.getAnhosTrabajados(), cientifico.getInvestigacion().getId(), cientifico.getInvestigacion().getNombre());
        }}
      
    }

    // añadir cientifico
    public Cientifico inscribirCientifico(){
         Scanner scanner= new Scanner(System.in);
         System.out.println("Nombre:");
         String nombre=scanner.nextLine();

         System.out.println("Apellidos:");
         String apellidos=scanner.nextLine();

         System.out.println("Experiencia:");
         int outputExperiencia=0;
         String inputExperiencia=scanner.next();
         
         if(inputExperiencia.equals("alta")||inputExperiencia.equals("ALTA")){
            outputExperiencia=Cientifico.ALTA;
         }
         else if(inputExperiencia.equals("media")||inputExperiencia.equals("MEDIA")){
            outputExperiencia=Cientifico.MEDIA;
         }
         else if(inputExperiencia.equals("BAJA")||inputExperiencia.equals("baja")){
            outputExperiencia=Cientifico.BAJA;
         }
         
         System.out.println("Anhos Trabajados:");
         int anhosTrabajados=scanner.nextInt();

        //Investigacion
         System.out.println("Id:");
         int id=scanner.nextInt();
         System.out.println("Nombre:");
         String nombreInvestigacion=scanner.next();
         System.out.println("Calculo:");
         Double calculo=scanner.nextDouble();
    
        Investigacion investigacion= new Investigacion(id,nombreInvestigacion,calculo);
        Cientifico nuevoCientifico= new Cientifico(nombre, apellidos, outputExperiencia,anhosTrabajados, investigacion);

        scanner.close();
     
        return nuevoCientifico;


  
    }

    //presupuestoDepartamento
    public void asignarPresupuesto(){
        int numEmpleados=0;
        int experienciaTotal=0;
        int anhosTrabajados=0;
        for (Cientifico cientifico : cientificos) {
            numEmpleados++;
            if(cientifico!=null){
            experienciaTotal+=cientifico.getExperiencia();
            anhosTrabajados+=cientifico.getAnhosTrabajados();
        }
    }

        presupuesto= (numEmpleados*experienciaTotal)+anhosTrabajados;
    }


    //eliminarDelDepartamento
    public void eliminarDelDepartamento(String nombre){
        for (int i=0; i<cientificos.length;i++){
            if(cientificos[i]!=null){
            if(cientificos[i].getNombre().equals(nombre)){
                cientificos[i]=null;
            }
        }}
    }


}
