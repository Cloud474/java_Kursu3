package MySelf._0_HuseyinBulut;

import java.util.Scanner;

public class _11HüseyinBULUTödev {
    public static void main(String[] args) {
        //SORU1
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayının tam kısmı=");
        String tam = oku.nextLine();
        System.out.print("Sayının ondalık kısmı=");
        String ondalik = oku.nextLine();
        String tamsayi = tam.concat(",").concat(ondalik);
        System.out.println("tamsayi = " + tamsayi);

        //SORU2
        Scanner oku1 = new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi = oku1.nextInt();
        if ((sayi % 9 == 0) && (sayi % 5 == 0))
            System.out.println("Able to divide by 9 and 5");
        if ((sayi % 4 == 0) && (sayi % 5 == 0))
            System.out.println("Able to divide by 4 and 15");

        //SORU3
        Scanner oku2 = new Scanner(System.in);
        System.out.print("Birinci Giriniz=");
        int a = oku2.nextInt();
        Scanner oku3 = new Scanner(System.in);
        System.out.print("İkinci Giriniz=");
        int b = oku3.nextInt();
        Scanner oku4 = new Scanner(System.in);
        System.out.print("Üçüncü Giriniz=");
        int c = oku4.nextInt();
        int enk = Math.min(a, Math.min(b, c));
        System.out.println("en küçük sayı = " + enk);

        //SORU4
        Scanner oku5 = new Scanner(System.in);
        System.out.print("Para Birimi=");
        String para = oku5.nextLine();
        if (para.contains("€")) {
            System.out.println("This is euro");}
        if (para.contains("$")) {
            System.out.println("This is dollar");
        } else {
            System.out.println("no money");}

        //SORU5
        Scanner oku6 = new Scanner(System.in);
        System.out.print("Sınav=");
        int sinav = oku6.nextInt();
        Scanner oku7 = new Scanner(System.in);
        System.out.print("Ara Sınav=");
        int ara = oku7.nextInt();
        Scanner oku8 = new Scanner(System.in);
        System.out.print("Final Puanı=");
        int fınal = oku8.nextInt();
        int ortnot = (sinav + ara + fınal) / 3;
        if (ortnot >=90){
            System.out.println("ortnot= A ");}
        if (ortnot >= 70 && ortnot <90){
            System.out.println("ortnot= B ");}
        if (ortnot>=50 && ortnot <70){
            System.out.println("ortnot= C");}
        if (ortnot<50 ){
            System.out.println("ortnot= F");}
    }
}
