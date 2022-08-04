package MySelf.Gun33.Encapsolutıon;

public class Kisi {
    String ad;
    String soyad;
   private int yas;

    public Kisi() {
    }
    //değişkene direk erişimi kapatıp
    //bir metod ile korumalı veri gönderme ve alma
    //alma işlemine Encaptulatıon denir

    public Kisi(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
    public void YasAta(int yas){
        this.yas=Math.abs(yas);
    }
    public int YasGetir(){
        return this.yas;
    }
}
