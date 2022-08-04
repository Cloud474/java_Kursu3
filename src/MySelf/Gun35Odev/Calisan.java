package MySelf.Gun35Odev;

public class Calisan {
    private String isim;
    private String adres;
    private String okul;
    private int maas;
    private UyeTipi tipi;

    public Calisan(String isim, String adres, String okul, UyeTipi tipi, int maas) {
        setIsim(isim);
        setAdres(adres);
        setOkul(okul);
        setMaas(maas);
        setTipi(tipi);
    }

    public String getIsim() {return isim;}

    public void setIsim(String isim) {this.isim = isim;}

    public String getAdres() {return adres;}

    public void setAdres(String adres) {this.adres = adres;}

    public int getMaas() {return maas;}

    public void setMaas(int maas) {this.maas = maas;}

    public UyeTipi getTipi() {return tipi;}

    public void setTipi(UyeTipi tipi) {this.tipi = tipi;}

    public String getOkul() {return okul;}

    public void setOkul(String okul) {this.okul = okul;}

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", okul='" + okul + '\'' +
                ", maas=" + maas +
                ", tipi=" + tipi +
                '}';
    }
}
