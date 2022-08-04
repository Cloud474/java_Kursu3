package MySelf._0_HuseyinBulut;

import java.util.Scanner;

public class _13HüseyinBulutödev {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayıların çarpım sonucnu bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz =");
        int sayi= oku.nextInt();
        int sayac=1;
        int sonuc=1;
        while ( sayac <= sayi){
                sonuc=sonuc*sayac;
            sayac++;
        }System.out.println("sonuc = " + sonuc);

        // 0-100 arasındaki sayılardan teklerin ayrı çiftleri ayrı toplamını bulunuz
        int sayac1=1;
        int toplam=0;
        //tek sayı
        while (sayac1 <= 10) {
            toplam=toplam+sayac1;
            sayac1= sayac1+2;}
        System.out.println("Tek sayı  = " + toplam);
        //çift sayı
        int sayac2=1;
        int toplam2=0;
        while (sayac2 <= 10) {
            if (sayac2 %2==0 )
                toplam2=toplam2+sayac2;
            sayac2++;}
        System.out.println("Çift sayı = " +  toplam2);

        //  100 den 0 a kadar olan tüm tek sayıları ekrana yazdırınız.
        int sayac4=100;
        while (sayac4>0){
            if (sayac4%2==1)
                System.out.println("Tek sayılar= " +sayac4);
            sayac4--;}


        // 0 ile 100 arasındaki sayılardan hem 4 e hem de 5 tam bölünebilen sayıları ekrana yazdırınız
            int sayac5=0;
        while (sayac5 <= 100){
            if (sayac5%4==0 && sayac5%5==0)
                System.out.println("Tam bölünebilen sayılar= " + sayac5);
            sayac5++;}

        //Sayı bulmaca oyununu tam hali ile cözünüz.
        Scanner oku1=new Scanner(System.in);
        System.out.print("0 ile 10 arası sayı giriniz=");
        int tahmin=oku1.nextInt();
        int randomsayi=(int)(Math.random()*11);
        while (tahmin !=randomsayi){
            if (tahmin==randomsayi)
                System.out.println("Tebrikler Bildiniz Sayı= " +randomsayi);
            else System.out.println("Malesef Bilemediniz sayı= " + randomsayi);break;
        }
    }
}
