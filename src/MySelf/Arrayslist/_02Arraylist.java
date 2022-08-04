package MySelf.Arrayslist;

import java.util.ArrayList;
import java.util.Scanner;

public class _02Arraylist {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        Scanner okıInt=new Scanner(System.in);
        ArrayList<Integer>notlar=new ArrayList<>();

        String devammı="";
        int toplam=0;

        do {
            System.out.print("Not = ");
            int ogrnot=okıInt.nextInt();
            notlar.add(ogrnot);
            toplam+=ogrnot;
            System.out.print("Devam etmek istiyor musunuz = ");
            devammı=oku.next();

        }while (devammı.equalsIgnoreCase("E"));

        int ort=toplam/notlar.size();
        System.out.println("ort = " + ort);
        int gecensayisi=0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)>=ort)
                gecensayisi++;

        }
        System.out.println("gecensayisi = " + gecensayisi);



    }
}
