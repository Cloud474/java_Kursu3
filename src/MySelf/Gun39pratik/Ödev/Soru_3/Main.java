package MySelf.Gun39pratik.Ödev.Soru_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        System.out.println("Which Brand phone would you like to buy? ");
        System.out.println("for Apple push 1 ");
        System.out.println("for Samsung push 2 ");
        System.out.print(" Selection = ");
        int secim=okuInt.nextInt();

        if (secim==1){
            System.out.print("Your desired memory capacity = ");
            String str1 = oku.nextLine();
            System.out.print("The screen size you want = ");
            String str2 = oku.nextLine();
            Apple apple = new Apple();
            apple.options(str1, str2);
            System.out.println("Total amount = " + apple.getSum(apple.cart)+" $");}

        if (secim==2){
        System.out.print("Your desired memory capacity = ");
        String str3= oku.nextLine();
        System.out.print("The screen size you want = ");
        String str4= oku.nextLine();
        Samsung samsung=new Samsung();
        samsung.options(str3,str4);
        System.out.println("Total amount =" + samsung.getSum(samsung.cart)+" $");}

    }
}
