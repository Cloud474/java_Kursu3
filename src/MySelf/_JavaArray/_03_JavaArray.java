package MySelf._JavaArray;

import java.util.Scanner;

public class _03_JavaArray {
    public static void main(String[] args) {



        int[] dizi=new int[5];
        int toplam=0;
        Scanner oku=new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+".Notu Giriniz = ");
            dizi[i]=oku.nextInt();
            toplam=toplam+dizi[i];

        }
        double ortalama=toplam/dizi.length;
        System.out.println("ortalama = " + ortalama);

        int adet=0;
        for (int j = 0; j <dizi.length; j++) {
            if (dizi[j]>ortalama)
                System.out.println( dizi[j]);
            adet++;

        }
        System.out.println("ortalamadan büyük sayılar = " + adet);



    }
}
