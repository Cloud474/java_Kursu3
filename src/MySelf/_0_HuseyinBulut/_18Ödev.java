package MySelf._0_HuseyinBulut;

import java.util.Scanner;

public class _18Ödev {
    public static void main(String[] args) {
        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin
        String[] dizi = {"Apple,Orange,Banana,Pineapple"};

        for (int i = 0; i < dizi.length; i++) {
            boolean varmi = dizi[i].contains("Apple");
            System.out.println("varmi = " + varmi);
            break;
        }

        //int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.

        int[] sayilar = {12, 2, 5, 15};
        int enb = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (enb < sayilar[i]) {
                enb = sayilar[i];
            }
        }
        System.out.println("enb = " + enb);

        //int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız.
        int[] sayilar1 = {14, 19, 5, 21};
        int enk = sayilar[0];
        for (int i = 0; i < sayilar1.length; i++) {
            if (enk > sayilar1[i]) {
                enk = sayilar1[i];
            }
        }
        System.out.println("enk = " + enk);

        //int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
        int[] sayilar2 = {15, 25, 22, 18, 30};
        int enb2 = sayilar2[0];
        for (int i = 0; i < sayilar2.length; i++) {
            if (enb2 < sayilar2[i]) {
                enb2 = sayilar2[i];
            }
        }
        System.out.println("En Büyük ikinci sayı= " + sayilar2[1]);

        //int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //Eğer sayı çiftse topla, tekse çıkar.
        //**Örneğin:****      -5 + 6 + 8 + 12 + 14 - 19 = 16**      Toplamlarını yazdırın.

        int[] sayilar3 = {5, 6, 8, 12, 14, 19};
        int toplam = 0;
        for (int i = 0; i < sayilar3.length; i++) {
            if (sayilar3[i] % 2 == 0) {
                toplam = toplam + sayilar3[i];
            }
            if (sayilar3[i] % 2 == 1) {
                toplam = toplam - sayilar3[i];
            }
        }
        System.out.println("Çift sayılar - Tek sayılar Sonuç = " + toplam);

        //Oluşturacağınız int array'ini
        // length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array) ilk ve son
        // elementlerini kapsayan yeni array'e return edin.

        int[] sayilar4 = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < sayilar4.length; i++) {
        }
        System.out.println("İlk ve son karakterler = " + "[" + sayilar4[0] + "," + sayilar4[6] + "]");

        //int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        //Array'in ortalamasını alınız.

        int[] dizi1 = {12, 14, 21, 23, 10, 4};
        int tplm = 0;
        for (int i = 0; i < dizi1.length; i++) {
            tplm = tplm + dizi1[i];}
            int ortalama = tplm / dizi1.length;
         System.out.println("tplm = " + ortalama);

         //String Array (Dizi) oluşturunuz. elemanları : Apple, Orange , Babana, Kiwi
        //Array'leri tüm elemanları yazdırınız.
        String[] kelimeler={"Apple, Orange , Banana, Kiwi"};
        int bosluksayisi=0;
        for (int i = 0; i < kelimeler.length; i++) {
            if (kelimeler[i].charAt(i)==' ')
                bosluksayisi++;
            System.out.println("kelimeler = " + kelimeler[i]);break;
        }

        //String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        //Array'daki eleman sayısını yazdırınız.

        String[] kelimeler1={"new jersey","new york","boston","California"};
        int boşluk=0;
        for (int i = 0; i < kelimeler1.length; i++) {
            if (kelimeler1[i].charAt(i)==' ');
            boşluk++;
        }System.out.println("Kelime Sayısı = " + boşluk);

        //İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //Array in elemanlarının toplamını yazdır.

        int[] dizi2={25,30,30,35,100};
        int toplam1=0;
        for (int i = 0; i < dizi2.length; i++) {
            if (dizi2[i] < dizi2.length);
            toplam1=toplam1+ dizi2[i];
        }System.out.println("toplam1 = " + toplam1);

        // Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
        // Kelimelerden en uzun olanının ilk ve son harflerinin yerlerini değiştiriniz

        String[] strkelime=new String[5];
        Scanner oku = new Scanner(System.in);
        String en= " ";
        for (int i=0;i< strkelime.length;i++) {
            System.out.print("Kelime giriniz = " );
            strkelime[i]= oku.next();

            if (strkelime[i].length()>en.length()){
                en=strkelime[i];}
        }
        String ilkHarf=en.substring(0,1);
        String sonHarf=en.substring(en.length()-1);
        String orta=en.substring(1,en.length()-1);
        String birlestirme=sonHarf.concat(orta).concat(ilkHarf);
        System.out.println("En uzun kelimenin ilk ve son harfi değişti = " + birlestirme);



    }
}