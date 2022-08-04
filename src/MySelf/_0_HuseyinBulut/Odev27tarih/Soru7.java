package MySelf._0_HuseyinBulut.Odev27tarih;

import java.util.ArrayList;

public class Soru7 {
    public static void main(String[] args) {
        //common_values() isminde bir method oluşturun.
        //Parametre olarak 2 tane Integer ArrayList
        //Return tipi integer ArrayList olmalı
        // İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        ArrayList<Integer> r1 = new ArrayList<>();
        ArrayList<Integer> r2 = new ArrayList<>();
        System.out.println(common_values(r1,r2));

    }
   public static ArrayList<Integer> common_values(ArrayList<Integer> r1, ArrayList<Integer> r2) {
       r1.add(3);
       r1.add(4);
       r1.add(5);
       r1.add(7);
       r1.add(2);
       r2.add(6);
       r2.add(4);
       r2.add(8);
       r2.add(7);
       ArrayList<Integer> ortak= new ArrayList<>(r1);
       ortak.retainAll(r2);

       return ortak;
   }
}