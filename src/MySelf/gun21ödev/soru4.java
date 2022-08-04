package MySelf.gun21ödev;

import java.util.Scanner;

public class soru4 {
    // adı  reverseWord olan bir method oluşturun
    //Bu methodun String olarak bir parametresi olmalıdır
    //Ve bu cümledeki kelimelerle tersine çevirmeli
    public static void main(String[] args) {
        String ters=reverseWord(stringoku());
        System.out.println("Ters Kelimeler = " + ters);

    }

    public static String stringoku() {
        Scanner oku = new Scanner(System.in);
        System.out.print("Cümle Giriniz = ");
        return oku.nextLine();
    }

    public static String reverseWord (String cümle) {
        String ters=" ";
            String[] kelimeler = cümle.split(" ");
            ters=kelimeler[1]+" "+kelimeler[0];


        return ters;
    }
}
