package MySelf._0_Derstekrarı;

import java.util.Scanner;

public class _0do {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        String okunan= "";

        do {
            System.out.print("ifade girinniz=");
            okunan=oku.nextLine();
            System.out.println("Program çalışıyor");
        } while (!okunan.equalsIgnoreCase("X"));//yada sona!=truesondaki iki parntez arasına
        System.out.println("program bitti");

    }
}
