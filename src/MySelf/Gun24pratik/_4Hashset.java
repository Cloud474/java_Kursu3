package MySelf.Gun24pratik;

import java.util.HashSet;

public class _4Hashset {
    public static void main(String[] args) {

        HashSet<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        System.out.println("setA = " + setA);

        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("setB = " + setB);


        HashSet<Integer> birlesikhali=new HashSet<>();
        birlesikhali.addAll(setA);
        birlesikhali.addAll(setB);
        System.out.println("birlesikhali = " + birlesikhali);

        HashSet<Integer> farki=new HashSet<>();
        farki.addAll(setA);
        farki.remove(setB);
        System.out.println("farki = " + farki);

        HashSet<Integer>ortakelemanlar=new HashSet<>();
        ortakelemanlar.addAll(setA);
        ortakelemanlar.retainAll(setB);
        System.out.println("ortakelemanlar = " + ortakelemanlar);
    }
}
