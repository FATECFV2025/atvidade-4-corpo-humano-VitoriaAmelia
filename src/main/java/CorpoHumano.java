package main.java;
public class CorpoHumano {
    private double massa;
    private double volumeCorpo;
    private double densidadeCorpo;
    private double alturaPessoa;

    public CorpoHumano(double massa, double volumeCorpo, double densidadeCorpo, double alturaPessoa) {
        this.massa = massa;
        this.volumeCorpo = volumeCorpo;
        this.densidadeCorpo = densidadeCorpo;
        this.alturaPessoa = alturaPessoa;
    }

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

    public double calcularIMC() {
        return massa / (alturaPessoa * alturaPessoa);
    }
}
