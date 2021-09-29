package Automovil;

public class Automovil {
    private String numero;
    private Caracteristicas caract1;

    public Automovil(String numero, Caracteristicas caract1) {
        this.numero = numero;
        this.caract1 = caract1;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Caracteristicas getCaract1() {
        return caract1;
    }

    public void setCaract1(Caracteristicas caract1) {
        this.caract1 = caract1;
    }
}
