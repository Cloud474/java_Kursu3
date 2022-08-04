package MySelf.Ödev.GenelÖdev.Soru9;

import java.util.ArrayList;

public class Soru9 {
    public static void main(String[] args) {
        ArrayList<Integer> dizi=new ArrayList<>();
        dizi.add(1);
        dizi.add(2);
        dizi.add(3);
        dizi.add(1);
        int ilk=dizi.get(0);
        int son=dizi.get(3);
        if (ilk==son){
            System.out.println("true = " + true);}
        else System.out.println("false = " + false);

    }
}
