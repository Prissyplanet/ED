package Automovil;

public class Caracteristicas {
    private String color;
    private String modelo;
    private int cilindros;

    public Caracteristicas(String color, String modelo, int cilindros) {
        this.color = color;
        this.modelo = modelo;
        this.cilindros = cilindros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
}
