package MySelf.Gun24pratik;

import java.util.HashSet;

public class _3Hashset {
    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(8);
        hs.add(10);
        hs.add(6);
        System.out.println("hs = " + hs);
        System.out.println("hs.size() = " + hs.size());

        hs.remove(1);
        System.out.println("remove = " + hs);

        if (hs.contains(5)) {
            System.out.println("5 var ");
        }else System.out.println(" 5 yok");

        hs.clear();
        System.out.println("hs = " + hs);

    }
}
