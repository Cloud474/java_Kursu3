package MySelf._0_Derstekrarı;

import java.util.Scanner;

public class _01while {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz =");
        int sayi=oku.nextInt();

        int sayac=0;
        int toplam=0;

        while (sayac <= sayi){
            toplam=toplam+sayac;
            sayac++;}
        System.out.println("toplam = " + toplam);
    }
}
