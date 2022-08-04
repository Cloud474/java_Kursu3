package MySelf.Gun39pratik.Ödev.Soru_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print(" 1. Sayı = ");
        int sayi1= oku.nextInt();
        System.out.print(" 2.Sayı = ");
        int sayi2= oku.nextInt();
        Sum sum=new Sum();
        sum.calculating(sayi1,sayi2);
        Divide divide=new Divide();
        divide.calculating(sayi1,sayi2);
        Multiply multiply=new Multiply();
        multiply.calculating(sayi1,sayi2);
        Substract substract=new Substract();
        substract.calculating(sayi1,sayi2);

    }
}
