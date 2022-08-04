package MySelf._0_HuseyinBulut.Odev27tarih;

import java.util.HashSet;

public class Soru13 {
    public static void main(String[] args) {
        //commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
        //return tipi arraylist olmalı.
        HashSet<String> ulkeler1=new HashSet<>();
        HashSet<String> ulkeler2=new HashSet<>();
        System.out.println(commonValues(ulkeler1,ulkeler2));

    }
    public static HashSet<String> commonValues(HashSet<String> ulkeler1, HashSet<String> ulkeler2){
        ulkeler1.add("Germany");
        ulkeler1.add("England");
        ulkeler1.add("South Africa");
        ulkeler1.add("Brazil");
        ulkeler1.add("USA");
        ulkeler2.add("Germany");
        ulkeler2.add("China");
        ulkeler2.add("South Africa");
        ulkeler2.add("France");
        ulkeler2.add("USA");
        HashSet<String> ortak=new HashSet<>();
        ortak.addAll(ulkeler1);
        ortak.retainAll(ulkeler2);
        return ortak;
    }
}
