
package MySelf.Ödev.GenelÖdev.Soru11;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz = ");
        int sayi= oku.nextInt();
        System.out.println("power4(sayi) = " + power4(sayi));
    }
    public static int power4(int sayi) {
        int toplam = 0;
        String strsayi =String.valueOf(sayi);
        for (int i = 0; i < strsayi.length(); i++) {
            double deger = Integer.parseInt(String.valueOf(strsayi.charAt(i)));
            toplam = (int) (toplam + Math.pow(4, deger));
        }
        return toplam;
    }

}
