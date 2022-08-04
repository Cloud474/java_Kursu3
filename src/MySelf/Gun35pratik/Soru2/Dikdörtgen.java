package MySelf.Gun35pratik.Soru2;

public class Dikdörtgen extends Daire{
    private int uzunluk;
    private int genislik;

    public Dikdörtgen(int uzunluk, int genislik) {
        setUzunluk(uzunluk);
        setGenislik(genislik);
    }

    @Override
    public double getAlan() {
        return this.genislik*this.uzunluk;
    }

    @Override
    public double getCevre() {
        return super.getCevre();
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int genislik) {
        this.genislik = genislik;
    }

    @Override
    public String toString() {
        return "Dikdörtgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +super.toString()+
                '}';
    }
}
