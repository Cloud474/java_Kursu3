package MySelf._0_HuseyinBulut.Odev27tarih;

import java.util.ArrayList;

public class Soru6 {
    public static void main(String[] args) {
        //hillNum() isminde bir method oluşturun.
        //Parametre olarak Integer ArrayList
        //Return tipi int
        //Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın
         ArrayList<Integer> rakamlar=new ArrayList<>();
        System.out.println(hillNum(rakamlar));

    }
    public static int hillNum(ArrayList<Integer> rakamlar){
        rakamlar.add(5);
        rakamlar.add(4);
        rakamlar.add(6);
        rakamlar.add(2);
        rakamlar.add(1);
        int j=0;
        for (int i = 0; i < rakamlar.size(); i++) {
            if (rakamlar.get(i)>j   &&   j<i)
                j=i;
        }

        return j;
    }
}
