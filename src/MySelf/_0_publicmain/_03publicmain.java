package MySelf._0_publicmain;

import java.util.Arrays;
import java.util.Scanner;

public class _03publicmain {
    public static void main(String[] args) {
        int [] dizi= new int[5];

        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < dizi.length ; i++) {
            System.out.print("Sayı Giriniz = ");
            dizi[i] = oku.nextInt();
        }
        int[] dizi2=new int[5];
        for (int i = 0; i < dizi.length; i++) {
            dizi2[i]=dizi[i]*dizi[i];
        }
        enkücükyaz(dizi);
        enbuyukyaz(dizi);
        ortalamayaz(dizi);
        enkücükyaz(dizi2);
        enbuyukyaz(dizi2);
        ortalamayaz(dizi2);




    }
    public static void enkücükyaz(int dizi[]) {

        Arrays.sort(dizi);
        System.out.println("en küçük " + dizi[0]);

    }
    public static void enbuyukyaz(int dizi[]) {

        Arrays.sort(dizi);
        System.out.println("en büyük " + dizi[dizi.length-1]);


    }
    public static void ortalamayaz(int dizi[]) {
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam=toplam+dizi[i];

        }
        int ort=toplam/ dizi.length;
        System.out.println("ort = " + ort);



    }


}
