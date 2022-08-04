package MySelf._JavaArray;

import java.util.Scanner;

public class _04_JavaArraysoru {
    public static void main(String[] args) {

        int[] dizi=new int[7];
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+".Sayı Giriniz=");
            dizi[i]=oku.nextInt();
            toplam=toplam+dizi[i];

        }
        double ortalama=toplam/dizi.length;
        System.out.println("ortalama = " + ortalama);

        int adet=0;
        for (int j = 0; j < dizi.length; j++) {
            if (dizi[j]>ortalama && dizi[j]%2==1)
                System.out.println(dizi[j]);
            adet++;

        }
        System.out.println("ortalamadan büyük ve tek sayılar = " + adet);



    }
}
