package MySelf._0_HuseyinBulut.Odev27tarih;

import java.util.ArrayList;
import java.util.Collections;

public class Soru5 {
    public static void main(String[] args) {
        //rotateList() isminde bir method oluşturun.
        //Parametre olarak String ArrayList
        //ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        //Tersten yazılmış halini return edin.

        ArrayList<String> arrayliste=new ArrayList<>();
        System.out.println(rotateList(arrayliste));

    }
    public static ArrayList<String> rotateList(ArrayList<String> arrayliste){
        arrayliste.add("New jersey");
        arrayliste.add("New york");
        arrayliste.add("Atlanta");
        arrayliste.add("Florida");
        arrayliste.add("Ohio");
        Collections.reverse(arrayliste);
        return arrayliste;
    }
}
