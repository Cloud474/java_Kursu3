package MySelf._0_publicmain;

import java.util.Scanner;

public class _5publicmain {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            System.out.print("öğrenci adı = ");
            String isim = oku.nextLine();
            System.out.print("not giriniz = ");
            String not = oku.nextLine();

            int ort = ortalamaBul(not);
            System.out.println("ort = " + isim + " " + ort);
        }


    }

    public static int ortalamaBul (String not) {
        String[] notdizisi = not.split(" ");
        int toplam = 0;
        for (int i = 0; i < notdizisi.length; i++)
            toplam = toplam + Integer.parseInt(notdizisi[i]);
            return toplam / notdizisi.length;



    }
}
