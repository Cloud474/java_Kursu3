package MySelf._0_HuseyinBulut;

import java.util.Scanner;

public class _0Genelödev {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz = ");
        int yas = oku.nextInt();
        if (yas < 10){
            System.out.println("facebook hesabi acmak icin cok gencsin");}
        if (yas > 10 && yas<=16){
            System.out.println("facebook hesabi acmak icin cok gencsin");}
        if (yas>16 && yas<=18){
            System.out.println("dovme yaptirmak icin cok gencsin");}
        if (yas>18 && yas<=21){
            System.out.println("alkol icmek icin cok gencsin");}
        if (yas>21)
            System.out.println("istediğini yapabilirsin");

        //Girilen bir sayı çift ise "true" , tek ise "false" yazdırınız.
        Scanner oku1 = new Scanner(System.in);
        System.out.print("Sayı(tek,çift) giriniz = ");
        int sayi=oku1.nextInt();
        if (sayi%2==0){
            System.out.println(true);}
        if (sayi%2==1){
            System.out.println(false);}

        //Girilen bir string de kaç tane b harfi olduğunu yazdırınız.
        Scanner oku2=new Scanner(System.in);
        System.out.print("String(b) giriniz = ");
        String str=oku2.nextLine();
        int uzunluk=str.length();
        int harfsayisi =str.replaceAll("[Bb]","").length();
        System.out.println("harfsayisi = " +(uzunluk-harfsayisi));

        //Girilen bir gün numarasına karşılık gelen gün adını
        //yazınız.
        Scanner oku3=new Scanner(System.in);
        System.out.print("Gün No giriniz = ");
        int gunNo=oku3.nextInt();
        switch (gunNo){
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
            default: System.out.println("ERROR");}

        //Girilen bir sayının faktöriyel değerini bulmak için bir program yazın.
        Scanner reader = new Scanner(System.in);
        System.out.print("Faktöriel Sayı Girin:");

        int num = reader.nextInt();
        long faktoriyel = 1;
        for(int i = 1; i <= num; ++i)
        {faktoriyel *= i;}
        System.out.println("faktoriyel = " + faktoriyel);

        //İçinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String
        //okutunuz

        String[] tablo=new String[3];
        Scanner oku4=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
                System.out.print("Para birimi giriniz = ");
                tablo[i] = oku4.next();
        }
        int toplam=0;
        for (int i = 0; i < 3; i++) {
                int para= Integer.parseInt(tablo[i].replaceAll("[^0-9-]",""));
                toplam = toplam + para;
        }System.out.println("toplam = " + toplam+"$");

        //Girilen pozitif bir sayının tam kare olup olmadığını bulunuz, tam kare ise true değilse false
        //yazdırınız.

        Scanner oku5=new Scanner(System.in);
        System.out.print("Tam kare sayısı için Sayı giriniz = ");
        int sayi4= oku5.nextInt();
        int i=0;
        int aranansayı=0;
        while (i<=sayi4){
            if (i*i==sayi4){
                aranansayı=i;break;
            }i++;
        }if (aranansayı>0)
            System.out.println("Tam karedir sayı = " + aranansayı);
        else System.out.println("Bu sayı tam kare değildir");

        //Girilen bir sayıya kadar olan çift sayıları (0 ve girilen sayı dahil) yazdırınız

        Scanner text = new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayicift=text.nextInt();
        int sayac=0;
        while (sayac<=sayicift ) {
            if (sayac % 2 == 0) {
                System.out.println("sayac = " + sayac);
            }sayac++;
        }

        //Kullanıcıdan pozitif bir sayı alınız ve 0 ile girilen sayı arasında Random int tipinde bir sayı
        //üreten programı yazınız

        Scanner oku6 = new Scanner(System.in);
        System.out.print("Random için Sayı Giriniz=");
        int sayi6=oku6.nextInt();

        int random= (int) (Math.random()*sayi6);
        System.out.println("Bilgisayarın ürettiği random sayı = " + random);

        //Girilen 2 sayı arasında Random integer sayı üreten programı yazınız

        Scanner oku7=new Scanner(System.in);
        System.out.print("Random için 1.Sayıyı Giriniz = ");
        int sayi7=oku7.nextInt();
        System.out.print("Random için 2.Sayıyı Giriniz = ");
        int sayi8=oku7.nextInt();
        int random1= (int) (Math.random()*((sayi7-sayi8)+1))+sayi8;
        System.out.println("iki sayı arası random = " + random1);

        //Girilen bir string deki harf sayısı tek ise true , değilse false yazdırınız

        Scanner oku9 = new Scanner(System.in);
        System.out.print("Cümle Giriniz=");
        String cümle10=oku9.nextLine();
        int uzunluk2=cümle10.length();
        if (uzunluk2%2==1)
            System.out.println("Harf sayısı tek = " + true);
        else System.out.println("Harf sayısı çift = " + false);

        // Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle

        Scanner oku12 = new Scanner(System.in);
        System.out.print("Eklenecek 1.kelime giriniz Giriniz=");
        String cümle12=oku12.nextLine();
        System.out.print("Eklenecek 2.kelime giriniz Giriniz=");
        String cümle13=oku12.nextLine();
        System.out.println("Birleşik hali= "+(cümle12+" "+cümle13));


    }
}
