package MySelf.Gun33.Encaptulatıon2;

public class ArabaMain {
    public static void main(String[] args) {

        Araba araba1=new Araba();
        araba1.setRenk("Kirmizi");
        araba1.setModel("Sedan");
        araba1.setMotorHacmi(2000);
        araba1.setKapiSayisi(4);

        System.out.println("araba1 = " + araba1);

        System.out.println("araba1.getRenk() = " + araba1.getRenk());
        System.out.println("araba1.getModel() = " + araba1.getModel());
        System.out.println("araba1.getMotorHacmi() = " + araba1.getMotorHacmi());
        System.out.println("araba1.getKapiSayisi() = " + araba1.getKapiSayisi());

        // KURAL: genel yazılım kuralıdır.
        // bütün değişkenler private yapılır.
        // yani Kapsulleme ile kullanılır.
        // Eğer gerekiyorsa private kaldırılır.
        // değişkene direk erişimi kapatıp
        // bir metod ile korumalı veri gonderme ve alma
        // işlemine Encapsulation denir.

    }
}
