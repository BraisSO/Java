

public class Investigacion {
    private int id;
    private String nombre;
    private Double calculo;

    public Investigacion(){

    }
    
    public Investigacion(int id, String nombre, Double calculo) {
        this.id = id;
        this.nombre = nombre;
        this.calculo = calculo;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getCalculo() {
        return calculo;
    }
    public void setCalculo(Double calculo) {
        this.calculo = calculo;
    }

    
}
