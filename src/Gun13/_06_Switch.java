package Gun13;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();

        int onlarbasamagı=(sayi/10)%10;

        switch (onlarbasamagı){
            case 1: System.out.println("Bir" );break;
            case 2: System.out.println("iki");break;
            case 3: System.out.println("üç");break;
            case 4: System.out.println("dört");break;
            case 5: System.out.println("beş");break;
            case 6: System.out.println("altı");break;
            case 7: System.out.println("yedi");break;
            case 8: System.out.println("sekiz");break;
            case 9: System.out.println("dokuz");break;
            case 0: System.out.println("sıfır");break;}
    }
}
