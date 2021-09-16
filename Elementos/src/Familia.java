import javax.swing.text.Element;

public class Familia {
    public String nombre;
    public Elemento elemento1;
    public Elemento elemento2;
    public Elemento elemento3;

    public Familia(String nombre, Elemento elemento1, Elemento elemento2, Elemento elemento3) {
        this.nombre = nombre;
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
        this.elemento3 = elemento3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Elemento getElemento1() {
        return elemento1;
    }

    public void setElemento1(Elemento elemento1) {
        this.elemento1 = elemento1;
    }

    public Elemento getElemento2() {
        return elemento2;
    }

    public void setElemento2(Elemento elemento2) {
        this.elemento2 = elemento2;
    }

    public Elemento getElemento3() {
        return elemento3;
    }

    public void setElemento3(Elemento elemento3) {
        this.elemento3 = elemento3;
    }
    public String imprimirElemento(){
        return "Nombre: "+elemento1.getNombre()+", símbolo: "+elemento1.getSimbolo()+", número atómico: "+elemento1.getNumeroAtomico()+ "\n" +
                "Nombre: "+elemento2.getNombre()+", símbolo: "+elemento2.getSimbolo()+", número atómico: "+elemento2.getNumeroAtomico()+ "\n" +
                "Nombre: "+elemento3.getNombre()+", símbolo: "+elemento3.getSimbolo()+", número atómico: "+elemento3.getNumeroAtomico()+ "\n";

    }
}
