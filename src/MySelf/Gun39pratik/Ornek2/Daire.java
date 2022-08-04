package MySelf.Gun39pratik.Ornek2;

public class Daire extends Sekil{
    @Override
    public double alan() {
        return Math.PI*yariCap*yariCap;
    }

    @Override
    public double cevre() {
        return 2*Math.PI*yariCap;
    }

    private double yariCap;

    public Daire(double yariCap) {
        setYariCap(yariCap);
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }
}
