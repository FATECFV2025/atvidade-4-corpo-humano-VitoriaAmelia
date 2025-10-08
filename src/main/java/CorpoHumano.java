package main.java;
public class CorpoHumano {
    // Atributos da classe
    private double massa;
    private double volumeCorpo;
    private double densidadeCorpo;
    private double alturaPessoa;

    // Construtor
    public CorpoHumano(double massa, double volumeCorpo, double densidadeCorpo, double alturaPessoa) {
        this.massa = massa;
        this.volumeCorpo = volumeCorpo;
        this.densidadeCorpo = densidadeCorpo;
        this.alturaPessoa = alturaPessoa;
    }

    // Métodos getters 
    public double getMassa() {
        return massa;
    }

    public double getVolumeCorpo() {
        return volumeCorpo;
    }

    public double getDensidadeCorpo() {
        return densidadeCorpo;
    }

    public double getAlturaPessoa() {
        return alturaPessoa;
    }

    // Métodos setters 

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public void setVolumeCorpo(double volumeCorpo) {
        this.volumeCorpo = volumeCorpo;
    }

    public void setDensidadeCorpo(double densidadeCorpo) {
        this.densidadeCorpo = densidadeCorpo;
    }

    public void setAlturaPessoa(double alturaPessoa) {
        this.alturaPessoa = alturaPessoa;
    }

    // Método que calcula o IMC
    public double calcularIMC() {
        return massa / (alturaPessoa * alturaPessoa);
    }
}
