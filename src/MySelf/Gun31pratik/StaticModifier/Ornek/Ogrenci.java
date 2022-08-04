package MySelf.Gun31pratik.StaticModifier.Ornek;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd="Cumhuriyet ortaokulu";
    //hepsi için geçerli tek bir tane eleman
    //tekrarlayan ve tüm nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}
