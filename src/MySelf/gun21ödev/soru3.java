package MySelf.gun21ödev;

import java.util.Scanner;

public class soru3 {
    //reverseString isminde bir method oluşturun.
    //Bu method bir String'i parametre olarak alsın.
    //Ve bu method, girilen String'i tersten yazsın.
    //Terste yazılmış halini yazdırınız.

    public static void main(String[] args) {

        String tersi=reversestring(stringoku());
        System.out.println("tersi = " + tersi);
    }
    public static String stringoku () {
        Scanner oku = new Scanner(System.in);
        System.out.print("Cümle Giriniz = ");
        return oku.nextLine();
    }
    public static String reversestring(String cümle) {
        String ters = " ";
        for (int i= cümle.length()-1; i>=0;i--) {
            ters = ters + cümle.charAt(i);
        }
        return ters;
    }
}
