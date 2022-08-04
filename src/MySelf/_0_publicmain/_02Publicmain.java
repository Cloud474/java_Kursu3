package MySelf._0_publicmain;

import java.util.Scanner;

public class _02Publicmain {
    public static void main(String[] args) {

        tekmiciftmi(33);
        tekmiciftmi(34);
        tekmiciftmioku();




    }
    public static void tekmiciftmi(int sayi) {
        if (sayi%2==0)
            System.out.println("çift");
        else System.out.println("Tek");




    }
    public static void tekmiciftmioku () {
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int okunansayi= oku.nextInt();

        if (okunansayi%2==0)
            System.out.println("çift");
        else System.out.println("Tek");





    }
}
