package MySelf._JavaArray;

import java.util.Arrays;

public class _06JavaArray {
    public static void main(String[] args) {
        int[] dizi=new int[10];
        int[] tekler=new int[10];
        for (int i = 0; i < dizi.length; i++)
            dizi[i]=(int)(Math.random()*100);

        int tekindex=0;
        for (int i = 0; i < dizi.length; i++)
            if (dizi[i]%2==1) {
                tekler[tekindex]=dizi[i];
                tekindex++;

            }
        System.out.println("Arrays.toString(tekler) = " + Arrays.toString(tekler));








    }
}
