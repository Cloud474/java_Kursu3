package MySelf.Ödev.GenelÖdev.Soru1;

import java.util.Arrays;

public class Soru1 {
    public static void main(String[] args) {

        int[] dizi={1,2,3,2,3};
        int[] dizi1=new int[3];
        int[] dizi2=new int[2];

        int j=0;
        for (int i = 0; i < 3; i++) {
            dizi1[j] = dizi[i];
            j++;
        }
        System.out.println("dizi1 = " + Arrays.toString(dizi1));

        int k=0;
        for (int i = 3; i < dizi.length; i++) {
            dizi2[k]=dizi[i];
                    k++;
        }
        System.out.println("dizi2 = " + Arrays.toString(dizi2));
        System.out.println("Arrays.equals(dizi1,dizi2) = " + Arrays.equals(dizi2, dizi1));
    }
}
