package MySelf.Gun34pratik.Soru;

public class Calisan {
    String isim;
    double maas;
    int maasKatsayisi;

    public Calisan(String isim, int maas, int maasKatsayisi) {
        this.isim = isim;
        this.maas = maas;
        this.maasKatsayisi = maasKatsayisi;
    }
    public double maasHesapla(){
        return maas * maasKatsayisi;

    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }
}
