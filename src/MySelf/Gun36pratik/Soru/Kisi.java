package MySelf.Gun36pratik.Soru;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    public void KimlikYaz (Kisi k) {

        if (k instanceof Ogrenci) System.out.println("Kisi{ Ad='" + ad + ' '+", Soyad='" + soyad +
                ", Görevi='" + gorevi + ", Şube='" + ((Ogrenci) k).getSube()+'}');
        if (k instanceof Calisan) System.out.println("Kisi{ Ad='" + ad + ' '+", Soyad='" + soyad +
                ", Görev='" + gorevi + ", Departman='" + ((Calisan) k).getDepartman()+'}');

    }
}
