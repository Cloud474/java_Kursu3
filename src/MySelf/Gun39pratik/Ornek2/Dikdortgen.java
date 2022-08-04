package MySelf.Gun39pratik.Ornek2;

public class Dikdortgen extends Sekil{
    private double kisaKenar;
    private double uzunKenar;

    @Override
    public double alan() {
        return kisaKenar*uzunKenar;
    }

    @Override
    public double cevre() {
        return (kisaKenar+uzunKenar)*2;
    }

    public Dikdortgen(double kisaKenar, double uzunKenar) {
         setKisaKenar(kisaKenar);
         setUzunKenar(uzunKenar);
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
}
