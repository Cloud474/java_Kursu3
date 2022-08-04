package MySelf.Gun24pratik;

import java.util.ArrayList;
import java.util.HashSet;

public class _0Hashset {
    public static void main(String[] args) {

        int sayi=5;  // hafızada 1 sayı tutar
        int[] dizi=new int[5];  // hafızada 5 rakam tutuyor.
        int[][] tablo=new int[3][4];  // 12 adet sayı tutuyor.

        // dinamik boyutlu diziler lazım.
        ArrayList<Integer> liste=new ArrayList<>(); // boyu eklendikçe artan dinamik dizi.
        ArrayList< ArrayList<Integer> > listelerinListesi=new ArrayList<>(); // dinamik 2 boyutlu

        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(22);
        hs1.add(3);
        hs1.add(8);
        hs1.add(65);
        hs1.add(9);
        boolean ekledimi=hs1.add(9);
        System.out.println("ekledimi = " + ekledimi);
        System.out.println("hs1 = " + hs1);





    }
}
