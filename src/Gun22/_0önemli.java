package Gun22;

public class _0önemli {
    public static void main(String[] args) {

        int[] dizi1 = {2, 6, 7, 8, 9};
        int[] dizi2 = {1, 2, 3, 3, 4, 7, 7, 8};
        int[] sonuc = new int [dizi1.length + dizi2.length];

        for (int i=0; i<dizi1.length + dizi2.length; i++)
        {
            if (i<dizi1.length)
                sonuc[i]=dizi1[i];
            else
                sonuc[i]=dizi2[i-dizi1.length];
        }




    }
}
