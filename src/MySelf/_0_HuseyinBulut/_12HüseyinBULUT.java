package MySelf._0_HuseyinBulut;

import java.util.Scanner;
//Girilen bir ay numarasına göre , ayın hem adını hem de kaç gün olduğunu sayı ile yazdırınız
public class _12HüseyinBULUT {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Ay Giriniz=");
        int aylar = oku.nextInt();

        switch (aylar) {
            case 1: System.out.println("Ocak 31");break;
            case 2: System.out.println("Şubat 28");break;
            case 3: System.out.println("Mart 31");break;
            case 4: System.out.println("Nisan 30");break;
            case 5: System.out.println("Mayıs 31");break;
            case 6: System.out.println("Haziran 30");break;
            case 7: System.out.println("Temmuz 31");break;
            case 8: System.out.println("Ağustos 31");break;
            case 9: System.out.println("Eylül 30");break;
            case 10: System.out.println("Ekim 31");break;
            case 11: System.out.println("Kasım 30");break;
            case 12: System.out.println("Aralık 31");break;}

        //Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız
        Scanner oku1 = new Scanner(System.in);
        System.out.print("Üç basamaklı sayı Giriniz=");
        int sayi = oku1.nextInt();
        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yüzler = (sayi / 100) % 10;


        switch (yüzler) {
        case 1: System.out.print("yüz");break;
        case 2: System.out.print("ikiyüz");break;
        case 3: System.out.print("üçyüz");break;
        case 4: System.out.print("dörtyüz");break;
        case 5: System.out.print("beşyüz");break;
        case 6: System.out.print("altıtüz");break;
        case 7: System.out.print("yediyüz");break;
        case 8: System.out.print("sekizyüz");break;
        case 9: System.out.print("dokuzyüz");break;}
        switch (onlar) {
            case 1: System.out.print(" on");break;
            case 2: System.out.print(" yirmi");break;
            case 3: System.out.print(" otuz");break;
            case 4: System.out.print(" kırk");break;
            case 5: System.out.print(" elli");break;
            case 6: System.out.print(" altmış");break;
            case 7: System.out.print(" yetmiş");break;
            case 8: System.out.print(" seksen");break;
            case 9: System.out.print(" doksan");break;}
        switch (birler){
        case 1: System.out.print(" bir");break;
            case 2: System.out.print(" iki");break;
            case 3: System.out.print(" üç");break;
            case 4: System.out.print(" dört");break;
            case 5: System.out.print(" beş");break;
            case 6: System.out.print(" altı");break;
            case 7: System.out.print(" yedi");break;
            case 8: System.out.print(" sekiz");break;
            case 9: System.out.print(" dokuz");break;}

        //20-80 arasında üretilen bir sayının birler basamağını yazı ile yazdırınız.
        int random=(int)( Math.random()*(80-20)+1)+20;
        int birlerbsmk= random % 10;
        System.out.println("random = " + random);
        switch (birlerbsmk)
        {case 0: System.out.println("sıfır ");break;
            case 1: System.out.println("bir ");break;
            case 2: System.out.println("iki ");break;
            case 3: System.out.println("üç ");break;
            case 4: System.out.println("dört ");break;
            case 5: System.out.println("beş ");break;
            case 6: System.out.println("altı ");break;
            case 7: System.out.println("yedi ");break;
            case 8: System.out.println("sekiz ");break;
            case 9: System.out.println("dokuz ");break;
            default: System.out.println("Hatalı giriş");}

    }
}
