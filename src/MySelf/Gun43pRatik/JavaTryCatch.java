package MySelf.Gun43pRatik;

import java.time.LocalDate;

public class JavaTryCatch {
    public static void main(String[] args) {

        try {// hatanın oluğunu düşündüğün yere koy

            System.out.println("program başladı");
            LocalDate tarih = LocalDate.of(2020, 10, 40);
            System.out.println("işlem tamam");

        }// hata olduğu zaman programı kırma

        catch (Exception hata){// hata olan değişkende oluşan hataların bilgisini atanıyor

            System.out.println("hata =" + hata.getMessage());

            // kendine mail at: gelen detayı ve hatayı
            //veritabanın kalıcı yerine yaz
        }
        System.out.println("program bitti");

        try {
            //java çalışmaya devam

        } // anlamadığın yer mi oldu ? kırılmadan devam
        catch (Exception hata)
        {
            // hatanın sebebını anla
            // gereken videoları tekrar izle
            // arkadaşlarına sonra mentöre sonra hocaya mutalak sor
            // öğren ve kırılmadn devma et
        }
        // Sonunda seni güzel bir meslek bekliyor



    }
}
