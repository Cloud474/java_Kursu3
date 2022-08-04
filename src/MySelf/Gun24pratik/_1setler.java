package MySelf.Gun24pratik;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _1setler {
    public static void main(String[] args) {
        //hızlı çalışmak için kendi özel algoritmasını tutar
        HashSet<String> hsh=new HashSet<>();
        hsh.add("bir");
        hsh.add("iki");
        hsh.add("üç");
        hsh.add("dört");
        hsh.add("bes");
        System.out.println("hsh = " + hsh);
        //Ekleme sırasına göre tutar
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("bes");
        System.out.println("lhs = " + lhs);
        //Alfabetik olarak sıralı tutar
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("bes");
        System.out.println("ts = " + ts);
        //sayısal olarak sıralı tutabiliyor Integerda
        TreeSet<Integer> tsInt=new TreeSet<>();
        tsInt.add(1);
        tsInt.add(2);
        tsInt.add(3);
        tsInt.add(4);
        tsInt.add(5);
        System.out.println("tsInt = " + tsInt);

    }
}
