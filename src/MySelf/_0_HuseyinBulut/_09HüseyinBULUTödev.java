package MySelf._0_HuseyinBulut;

import java.util.Scanner;

public class _09HüseyinBULUTödev {
    public static void main(String[] args) {
        //Soru 1
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayı = oku.nextInt();
        int onlar = (sayı / 10) % 10;
        if (onlar % 2 == 1) {
            System.out.println("Tek");}
        if (onlar % 2 != 1) {
            System.out.println("Tek Değil");}

        //Soru2
        Scanner text = new Scanner(System.in);
        System.out.print("Password=");
        String şifre = text.nextLine();
        boolean evetMi=şifre.equals("Bayrak");

        if (evetMi==true){
            System.out.println("Doğru");}
        if (evetMi==false){
            System.out.println(" Yanlış" );}

        //soru3
        Scanner text2=new Scanner(System.in);
        System.out.print("Kelime giriniz=");
        String kelime=text2.nextLine();
        char ilkharf=kelime.charAt(0);
        char sonharf=kelime.charAt(kelime.length()-1);
        if (ilkharf==sonharf){
            System.out.println("true");}
        if (ilkharf!=sonharf){
            System.out.println("false");}

        //soru4
        Scanner text3=new Scanner(System.in);
        System.out.print("Kelime giriniz=");
        String kelime1=text3.nextLine();
        boolean varmı=kelime1.contains("A");
        if (varmı==true){
            System.out.println("Var");}
        if (varmı==false){
            System.out.println("Yok");}

        //soru5
        Scanner oku3=new Scanner(System.in);
        System.out.print("Birinci Kelime=");
        String yeni1=oku3.nextLine();
        System.out.print("İkinci Kelime=");
        String yeni2=oku3.nextLine();
        int uzunluk1=yeni1.length();
        int uzunluk2=yeni2.length();
        if (uzunluk1==uzunluk2){
            System.out.println("true");}
        if (uzunluk1!=uzunluk2){
            System.out.println("false");}

        //soru6
        Scanner oku5=new Scanner(System.in);
        System.out.print("New Password=");
        String yeni=oku5.nextLine();
        int uzunluk5=yeni.length();
        if (yeni.length()>=8){
            System.out.println("Şifreniz başarı ile değişmiştir");}
        if (yeni.length()<8){
            System.out.println("Tekrar Deneyiniz");}
    }
}
