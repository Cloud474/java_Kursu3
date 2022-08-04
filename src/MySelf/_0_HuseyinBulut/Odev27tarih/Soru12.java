package MySelf._0_HuseyinBulut.Odev27tarih;

import java.util.HashSet;

public class Soru12 {
    public static void main(String[] args) {
        //changeSet() isminde bir method oluşturun.
        //Parametre olarak bir String HashSet   ve  iki String. return hashset olmalı
        //Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
        HashSet<String> meyveler=new HashSet<>();
        String meyve1="Banana";
        String meyve2="Peach";
        System.out.println(changeSet(meyveler,meyve1,meyve2));


    }
    public static HashSet<String> changeSet(HashSet<String> meyveler, String meyve1, String meyve2){
        meyveler.add("Banana");
        meyveler.add("strawberry");
        meyveler.add("kiwi");
        meyveler.add("pineapple");
        if (meyveler.contains(meyve1))
            meyveler.remove(meyve1);
        meyveler.add(meyve2);

        return meyveler;
    }
}
