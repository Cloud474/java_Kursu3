package MySelf._0_HuseyinBulut.Odev27tarih;

import java.util.ArrayList;

public class Soru9 {
    public static void main(String[] args) {
        //rangeBtw() isminde bir method oluşturun.
        //Parametre olarak   bir Arraylist  ve iki ayrı int
        //return tipi int 3 , 5 , 22,20 ,14 , 25 , 30,
        // Arraylist'in iki int arasında kaç değeri olduğunu sayın.
        //return  count       (sayacı (count) döndürün.)
        ArrayList<Integer> sayilar = new ArrayList<>();
        int min = 20;
        int max = 30;

        System.out.println("Min Max dahil değer aralığı sayısı ="+rangeBtw(sayilar,min,max));
    }

    public static int rangeBtw(ArrayList<Integer> sayilar, int min, int max) {
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(22);
        sayilar.add(20);
        sayilar.add(28);
        sayilar.add(25);
        sayilar.add(30);
        int count=0;
        for (int i = 0; i < sayilar.size(); i++)
            if (sayilar.get(i) >= min && sayilar.get(i) <= max)
                count++;
        return count;
    }
}
