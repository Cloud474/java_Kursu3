package MySelf.Gun30pratik.Soru;

import java.util.Scanner;

public class Banka {
    public static void main(String[] args) {
        // Hesap (yatan(int), cekilen(int), bakiye(int)(direk erişim olmamalı))
        // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
        // Bir banka uygulaması için 1 müşteri tanımlayınız,
        // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
        // Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
        // bakiyeye direk para atanamadıgını kontrol ediniz.

        Musteri mus1=new Musteri();
        mus1.id=47;
        mus1.ad="Gülcan";
        mus1.soyad="BULUT";
        mus1.musteriHesap=new Hesap();

        mus1.musteriHesap.paraEkle(1000);
        mus1.musteriHesap.paraEkle(500);
        mus1.musteriHesap.paraCek();







    }
}
