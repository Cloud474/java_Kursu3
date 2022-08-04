package MySelf._JavaArray;

import java.util.Scanner;

public class _02Javadiziler {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle giriniz = ");
        String cumle= oku.nextLine();
        int bosluksayısı=0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i)==' ')
                bosluksayısı++;}
        System.out.println("Kelime sayısı = " + (bosluksayısı+1));

    }
}
