package MySelf.Arrayslist;

import java.util.ArrayList;
import java.util.Collections;

public class _03Arraylist {
    public static void main(String[] args) {
        //// ArrayList Collection grubunun bir elemanı
        //        // Array i sıralatırken Arrays.sort u kullandığımız gibi,
        //        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> rakamlar=new ArrayList<>();
        rakamlar.add(23);
        rakamlar.add(98);
        rakamlar.add(904);
        rakamlar.add(123);
        rakamlar.add(16);
        System.out.println("rakamlar ilk hali= " + rakamlar);

        Collections.sort(rakamlar);
        System.out.println("rakamlar sıralı = " + rakamlar);

        Collections.reverse(rakamlar);
        System.out.println("rakamlar reverse= " + rakamlar);

        System.out.println("Collections.max(rakamlar) = " + Collections.max(rakamlar));
        System.out.println("Collections.min(rakamlar) = " + Collections.min(rakamlar));

        Collections.fill(rakamlar,0);
        System.out.println("rakamlar fill = " + rakamlar);

        Collections.replaceAll(rakamlar,0,2);
        System.out.println("rakamlar replaceall= " + rakamlar);





    }
}
