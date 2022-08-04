package MySelf._0_HuseyinBulut;

import java.util.Scanner;

public class _04HuseyinBulutÖdev {
    public static void main(String[] args) {

        String text="paper";
        System.out.println("Büyük hali = " + text.toUpperCase());

        String text1="OraNge";
        System.out.println("küçük hali = " + text1.toLowerCase());

        String text2="New Jersey";
        System.out.println("Büyük hali = " + text2.toUpperCase());

        String text3="New York";
        System.out.println("küçük hali = " + text3.toLowerCase());

        String text4="PADDLE";
        System.out.println("küçük hali = " + text4.toLowerCase());

        String text5="apple";
        System.out.println(" Varmı= " + text5.contains("app"));

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle Giriniz=");
        String metin=oku.nextLine();
        char ilkharf=metin.charAt(0);
        // özel sorular için daha uğraşıyorum hocam :)








    }
}
