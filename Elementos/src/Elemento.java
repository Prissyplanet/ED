import org.w3c.dom.ls.LSOutput;

public class Elemento {
    private String nombre;
    private String simbolo;
    private int numeroAtomico;

    public Elemento(String nombre, String simbolo, int numeroAtomico){
        this.nombre=nombre;
        this.simbolo=simbolo;
        this.numeroAtomico=numeroAtomico;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumeroAtomico(int numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

}
