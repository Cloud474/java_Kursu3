package MySelf._0_HuseyinBulut.Odev27tarih;

import java.util.ArrayList;
import java.util.Collections;

public class Soru8 {
    public static void main(String[] args) {
        //secondMax()  isminde bir method oluşturun.
        //Parametre olarak integer ArrayList.
        //Return tipi int olmalı.
        //ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ArrayList<Integer> rakamlar=new ArrayList<>();
        System.out.println(secondMax(rakamlar));
    }

    public static int secondMax(ArrayList<Integer> rakamlar){
        rakamlar.add(6);
        rakamlar.add(9);
        rakamlar.add(1);
        rakamlar.add(98);
        rakamlar.add(47);
        Collections.sort(rakamlar);

        return rakamlar.get(rakamlar.size()-2);
    }
}
