package MySelf._JavaArray;

import java.util.Arrays;
import java.util.Scanner;

public class _05JavaArray {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("cümle giriniz= ");
        String cümle=oku.nextLine();

        String[] kelimeler=cümle.split(" ");
        System.out.println("kelimeler = " + Arrays.toString(kelimeler));

        System.out.println("kelimeler = " + kelimeler.length);


        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);


        }
    }
}
