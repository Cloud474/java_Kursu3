package MySelf._0_HuseyinBulut.Odev27tarih;

import java.util.HashSet;

public class Soru11 {
    public static void main(String[] args) {
        // totalCount() isminde bir method oluşturun.
        //Parametresi  'Integer Hashset' olmalı
        //HashSetteki eleman sayısını alın. totalCount'u döndürün.
        HashSet<Integer> rakamlar=new HashSet<>();
        System.out.println("Dizideki eleman sayısı = "+totalCount(rakamlar));
    }
    public static int totalCount(HashSet<Integer> rakamlar){
        int count=0;
        rakamlar.add(4);
        rakamlar.add(3);
        rakamlar.add(7);
        rakamlar.add(1);
        rakamlar.add(9);
        for (int i = 0; i < rakamlar.size(); i++) {
            count++;
        }
        return count;
    }
}
