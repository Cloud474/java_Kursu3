package MySelf.Arrayslist;

import java.util.ArrayList;
import java.util.Scanner;

public class _04Arraylist {
    public static void main(String[] args) {
        int[] dizi=new int[6];
        Scanner oku=new Scanner(System.in);

        for (int i = 0; i < dizi.length; i++) {

            System.out.print("Sayı = ");
            dizi[i]=oku.nextInt();

        }

        ArrayList<Integer>tekler=new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==1)
                tekler.add(dizi[i]);

        }
        System.out.println("tekler = " + tekler);




    }
}
