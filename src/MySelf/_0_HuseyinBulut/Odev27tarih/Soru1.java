package MySelf._0_HuseyinBulut.Odev27tarih;

import java.util.ArrayList;

public class Soru1 {
    public static void main(String[] args) {
        //ismi getCount() olan bir method oluşturun.
        //Parametre olarak bir String ArayList  ve  bir tane String
        //Return tipi int olmalı.
        //ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        ArrayList<String> fruit=new ArrayList<>();
        String s1="Orange";
        System.out.println("Orange"+getCount(fruit,s1));

    }
    public static int getCount(ArrayList<String> fruit, String s1){
        int count=0;
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Peach");
        fruit.add("Orange");
        for (int i = 0; i < fruit.size(); i++) {
            if (fruit.get(i) == s1)
                count++;
        }

        return count;
    }
}
