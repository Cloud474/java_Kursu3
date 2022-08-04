package MySelf._0_HuseyinBulut.Odev27tarih;

import java.util.LinkedHashSet;

public class Soru14 {
    public static void main(String[] args) {
        //removing() isminde bir method oluşturun.
        //Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
        //Eğer Stringler LinkedHashset 'in içinde varsa, sil. Return tipi linkedhashset
        LinkedHashSet<String> linkedhashset=new LinkedHashSet<>();
        String ulke1="Germany";
        String ulke2="USA";
        System.out.println(removing(linkedhashset,ulke1,ulke2));

    }
    public static LinkedHashSet<String> removing(LinkedHashSet<String> linkedhashset, String ulke1, String ulke2){
        linkedhashset.add("Germany");
        linkedhashset.add("France");
        linkedhashset.add("USA");
        linkedhashset.add("Canada");
        linkedhashset.add("Mexico");
        linkedhashset.add("Brazil");
        if (linkedhashset.contains(ulke1) && linkedhashset.contains(ulke2))
            linkedhashset.remove(ulke1);
        linkedhashset.remove(ulke2);
        return linkedhashset;
    }
}
