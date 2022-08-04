package MySelf.Gun35pratik.Soru2;

public class Daire extends Sekil{
    private int yariCap;


    public Daire(int yariCap) {
        setYariCap(yariCap);
    }

    public Daire() {
    }

    public double getAlan(){
        return Math.PI*this.yariCap*this.yariCap;
    }

    @Override
    public double getCevre() {
        return super.getCevre();
    }

    public int getYariCap() {
        return yariCap;
    }

    public void setYariCap(int yariCap) {
        this.yariCap = yariCap;
    }

}
