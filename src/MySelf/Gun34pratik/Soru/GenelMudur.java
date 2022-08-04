package MySelf.Gun34pratik.Soru;

public class GenelMudur extends Calisan{
    double tazminat;
    public GenelMudur(String isim, int maas, int maasKatsayisi,double tazminat) {
        super(isim, maas, maasKatsayisi);
        this.tazminat=tazminat;
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "tazminat=" + tazminat +
                super.toString()+
                '}';
    }
}
