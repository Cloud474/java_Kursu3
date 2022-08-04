package MySelf._0_HuseyinBulut.Odev27tarih;

import java.util.ArrayList;

public class Soru3 {
    public static void main(String[] args) {
//getLength() isminde bir method oluşturun.
//Parametre olarak String ArrayList
//Return tipi Integer ArrayList
//ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
//Tüm elementlerin uzunluğunu döndürün
        ArrayList<String> sehirler=new ArrayList<>();
        sehirler.add("New Jersey"); //
        sehirler.add("New york");  //
        sehirler.add("Ohio");
        sehirler.add("Florida");
        sehirler.add("Boston");

        ArrayList<Integer> sayilar=getLenght(sehirler);
        System.out.println("sayilar = " + sayilar);

    }
    public static ArrayList<Integer> getLenght(ArrayList<String> array){
        ArrayList<Integer> uzunluk=new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            uzunluk.add(array.get(i).length());
        }
        return uzunluk;
    }
}
