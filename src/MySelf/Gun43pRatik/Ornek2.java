package MySelf.Gun43pRatik;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print(" 1.Sayi gir= ");//4
        int sayi1=oku.nextInt();

        System.out.print(" 1.Sayi gir= ");//0 olunca hata verir runtime
        int sayi2=oku.nextInt();

        System.out.println("bolum = " + (sayi1/sayi2));
    }
}
