package MySelf.Gun35pratik.Soru1;

public class Otobus extends Arac{
    private int yolcuKapasitesi;

    public Otobus(String renk, int motor, String marka, int kapiSayisi, int yolcuKapasitesi) {
        super(renk, motor, marka, kapiSayisi);
        setYolcuKapasitesi(yolcuKapasitesi);
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString() {
        return "Otobus{" +
                "yolcuKapasitesi=" + yolcuKapasitesi +super.toString()+
                '}';
    }
}
