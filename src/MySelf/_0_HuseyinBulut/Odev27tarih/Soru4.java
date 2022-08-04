package MySelf._0_HuseyinBulut.Odev27tarih;

import java.util.ArrayList;
import java.util.Collections;

public class Soru4 {
    public static void main(String[] args) {
        //İsmi changelnArraylist() olan bir method oluşturun.
        //Parametre olarak String ArrayList, String s1, String s2
        //   Arraylist'te s1'i s2 olarak değiştirin
        //Return String arrayList

        ArrayList<String> colors=new ArrayList<>();
        colors.add("yellow");
        colors.add("red");
        colors.add("blue");
        colors.add("red");
        colors.add("blue");
        System.out.println(changelnArraylist(colors));

    }
    public static ArrayList<String> changelnArraylist(ArrayList<String> colors){

        Collections.replaceAll(colors, "blue", "yellow");
        return colors;
    }
}
