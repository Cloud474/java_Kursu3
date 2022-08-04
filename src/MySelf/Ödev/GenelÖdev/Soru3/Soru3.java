package MySelf.Ödev.GenelÖdev.Soru3;

import java.util.ArrayList;

public class Soru3 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        ArrayList<Integer> b=new ArrayList<>();
        b.add(2);
        b.add(6);
        b.add(8);
        b.add(3);
        int a1=a.get(0);
        int b1=b.get(0);
        if (a1==b1){
            System.out.println("eşit mi= " +true);}
        else System.out.println("eşit mi = " + false);

        int a2=a.get(2);
        int b2=b.get(3);
        if (a2==b2){
            System.out.println("eşit mi= " +true);}
        else System.out.println("eşit mi = " + false);




    }
}
