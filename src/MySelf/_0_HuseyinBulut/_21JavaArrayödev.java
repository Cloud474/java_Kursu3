package MySelf._0_HuseyinBulut;

import java.util.Scanner;

public class _21JavaArrayödev {
    public static void main(String[] args) {
        //4 elemanlı bir dizi tanımlayınız değerlei kullanıcan alınız.
        // Dizideki en küçük ve enbüyük elemanlar arasındaki farkı bulunuz.

        int[] dizi=new int[4];
        Scanner oku=new Scanner(System.in);

        int enb=dizi[0];
        int enk=99999;
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayı giriniz = ");
            dizi[i]= oku.nextInt();

            if (dizi[i] > enb){
                enb = dizi[i];}
            if (dizi[i]<enk){
                enk=dizi[i];}
        }
        System.out.println("enbüyük ve enküçük sayı farkı= " + (enb-enk));

        // 2x3 lük String bir tablo tanımlayınız, kullanıcıdan $22 veya $65  şeklinde
        // para simgesi ve rakam olan değerlerle doldurunuz.
        // sonrasında bütün RAKAMLARI toplayıp ö toplam para değerini bulunuz.

        String[][] tablo=new String[2][3];
        Scanner oku1=new Scanner(System.in);


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Rakam giriniz = ");
                tablo[i][j] = oku1.next();
            }
        }

        int toplam=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int para= Integer.parseInt(tablo[i][j].replaceAll("[^0-9]",""));
                toplam = toplam + para;
            }
        }
        System.out.println("toplam = " + toplam+"$");





    }
}
