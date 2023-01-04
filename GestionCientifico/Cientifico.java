public class Cientifico {

    public static final int BAJA = 10;
    public static final int MEDIA = 25;
    public static final int ALTA = 50;

    private String nombre;
    private String apellidos;
    private int experiencia;
    private int anhosTrabajados;
    private Investigacion investigacion;

    public Cientifico(String nombre, String apellidos, int experiencia, int anhosTrabajados,
            Investigacion investigacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.experiencia = experiencia;
        this.anhosTrabajados = anhosTrabajados;
        this.investigacion = investigacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
            this.experiencia = experiencia;
    }

    public int getAnhosTrabajados() {
        return anhosTrabajados;
    }

    public void setAnhosTrabajados(int anhosTrabajados) {
        this.anhosTrabajados = anhosTrabajados;
    }

    public Investigacion getInvestigacion() {
        return investigacion;
    }

    public void setInvestigacion(Investigacion investigacion) {
        this.investigacion = investigacion;
    }

}
