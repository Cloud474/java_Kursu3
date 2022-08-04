package MySelf.Gun35Odev;

import java.util.ArrayList;

public class Okul {
    private String isim;
    private final int maxOgrenciSayisi=100;
    private final ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
    private final ArrayList<Calisan> calisanlar = new ArrayList<>();

    public Okul(String isim) {this.isim = isim;}

    public String getIsim() {return isim;}

    public void setIsim(String isim) {this.isim = isim;}

    @Override
    public String toString() {
        return isim+" "+maxOgrenciSayisi;
    }
    public void setOgrenciler(Ogrenci ogrenci){
        ogrenciler.add(ogrenci);}

    public void setCalisanlar(Calisan calisan){
        calisanlar.add(calisan);}

    public void getOgrenciler() {
        System.out.println(ogrenciler);
    }

    public void getCalisanlar() {
        System.out.println(calisanlar);
    }

}
