package MySelf._0_HuseyinBulut.Odev27tarih;

import java.util.ArrayList;
import java.util.HashSet;

public class Soru10 {
    public static void main(String[] args) {
        //Store all the elements in one arraylist and print the arraylist
        //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.

        ArrayList<Integer> dizi1=new ArrayList<>();
        dizi1.add(1);
        dizi1.add(2);
        dizi1.add(3);
        ArrayList<Integer> dizi2=new ArrayList<>();
        dizi2.add(4);
        dizi2.add(5);
        dizi2.add(6);
        ArrayList<Integer> dizi3=new ArrayList<>();
        dizi3.add(7);
        dizi3.add(8);
        dizi3.add(9);
        HashSet<Integer> birlesikHali=new HashSet<>();
        birlesikHali.addAll(dizi1);
        birlesikHali.addAll(dizi2);
        birlesikHali.addAll(dizi3);
        System.out.println("birlesikHali = " + birlesikHali);


    }
}
