package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_ArrayList_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak
        // yazdırınız.
        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[6];

        for(int i=0;i< dizi.length ; i++) {
            System.out.print("Sayi=");
            dizi[i] = oku.nextInt();
        }
         ArrayList<Integer> teksayilar=tekler(dizi);
         System.out.println("tekler = " + teksayilar);





        // TODO : Ödev : tek elemanlarını ayrı diziye bir metodda atayarak main de yazdırınız.
    }
    public static ArrayList<Integer> tekler(int[] dizi)  {
        ArrayList<Integer> tekler=new ArrayList<>();
        for(int i=0;i< dizi.length ; i++)
            if (dizi[i] %2==1)
                tekler.add(dizi[i]);
        return tekler;
        //ne dönecekse onu metoda yazmak zorundasın örn arraylist ınteger UNUTMA
    }
}
