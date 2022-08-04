package MySelf._0_Derstekrarı;

import java.util.Scanner;

public class _0while {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int sayac=1;
        int toplam=0;

        while (sayac<=4){
            System.out.print(sayac +".sayı giriniz=");
            int sayi=oku.nextInt();
            toplam =toplam +sayi;
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
