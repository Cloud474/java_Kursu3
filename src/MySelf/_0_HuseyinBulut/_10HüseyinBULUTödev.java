package MySelf._0_HuseyinBulut;

import java.util.Scanner;

public class _10HüseyinBULUTödev {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Birinci Sayı=");
        int sayi1 = oku.nextInt();
        System.out.print("İkinci Sayı=");
        int sayi2 = oku.nextInt();
        System.out.print("Üçüncü Sayı=");
        int sayi3 = oku.nextInt();
        if (sayi1 > sayi2 && sayi1 > sayi3) {
            System.out.println("En Büyük =" + sayi1);}
        if (sayi2 > sayi1 && sayi2 > sayi3) {
            System.out.println("En Büyük= " + sayi2);}
        if (sayi3 > sayi1 && sayi3 > sayi2) {
            System.out.println("En Büyük=" + sayi3);}

        //SORU 2
        Scanner oku1 = new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int deger = oku1.nextInt();
        if (deger % 10 == (deger/10)%10  && ((deger%10)==1) == ((deger/10)%10==1)){
            System.out.println("Kriterlere uygun");}
        else System.out.println("Uygunsuz Kriter");

        //SORU3
        Scanner oku2 = new Scanner(System.in);
        System.out.print("Kelime Giriniz=");
        String kelime=oku2.nextLine();
        if (kelime.isEmpty() || kelime.contains("A")){
            System.out.println("A harfi veya boşluk mevcut");}
        else System.out.println("Uygunsuz");


    }
}
