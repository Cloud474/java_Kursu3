package MySelf._JavaArray;

import java.util.Arrays;

public class _07JavaArray {
    public static void main(String[] args) {

        int[] dizi=new int[10];
        for (int i = 0; i < dizi.length; i++)
            dizi[i]=(int)(Math.random()*100);

        int teklermiktar=0;
        for (int i = 0; i < dizi.length; i++)
            if (dizi[i]%2==1)
                teklermiktar++;

        int[] tekler=new int[teklermiktar];

        int tekindex=0;
        for (int i = 0; i < dizi.length; i++)
            if (dizi[i]%2==1){
                tekler[tekindex]= dizi[i];
                tekindex++;
            }

        System.out.println("dizi = " + Arrays.toString(dizi));
        System.out.println("tekler = " + Arrays.toString(tekler));


    }
}
