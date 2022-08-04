package MySelf._JavaArray;

import java.util.Arrays;

public class _05JavaArraytekrar {
    public static void main(String[] args) {
        String[] kelimeler={"ahmet","melike","samet","rümeysa"};
        System.out.println("Arrays.toString(kelimeler) = " + Arrays.toString(kelimeler));

        Arrays.sort(kelimeler);
        System.out.println("Arrays.sort(kelimeler); = " + Arrays.toString(kelimeler));

        int[] a={1,2,6,7,4};
        int[] b={1,2,6,7,4};
        int[] c={1,2,6,2,4};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a, b));
        System.out.println("Arrays.equals(b,c) = " + Arrays.equals(b, c));

        Arrays.sort(c);
        System.out.println("Arrays.equals(c) = " + Arrays.toString(c));


        Arrays.fill(c,7);
        System.out.println("Arrays.fill(c); = " + Arrays.toString(c));

        int[] rakamlar={2,6,9,4,90};
        System.out.println("Arrays.binarySearch(rakamlar,6) = " + Arrays.binarySearch(rakamlar, 6));


    }
}
