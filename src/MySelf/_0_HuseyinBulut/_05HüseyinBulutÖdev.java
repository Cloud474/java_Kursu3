package MySelf._0_HuseyinBulut;

import java.util.Scanner;

public class _05HüseyinBulutÖdev {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Cümle giriniz=");
        String cümle = oku.nextLine();
        char ilkharf=cümle.charAt(0);
        char sonharf=cümle.charAt(cümle.length()-1);
        System.out.println("Cümlenin ilk ve son harfi = " + ilkharf + sonharf);

        Scanner oku1=new Scanner(System.in);
        System.out.print("üç kelimelik cümle=");
        String kelime=oku1.nextLine();
        int tamamı=kelime.length();
        String ilkkelime=kelime.substring(0, kelime.indexOf(" "));
        String ikincikelime=kelime.substring(kelime.indexOf(" ")+1,kelime.lastIndexOf(" ")+1 );
        String üçüncükelime=kelime.substring(kelime.lastIndexOf(" ")+1,tamamı);
        System.out.println("ilkkelime = " + ilkkelime);
        System.out.println("ikincikelime = " + ikincikelime);
        System.out.println("üçüncükelime = " + üçüncükelime);


        Scanner oku2=new Scanner(System.in);
        System.out.print("üç kelime cümle=");
        String text=oku2.nextLine();
        char ilkkharf=text.charAt(0);
        char ikkinci=text.charAt(text.indexOf(" ")+1);
        char ükharf=text.charAt(text.lastIndexOf(" ")+1);
        System.out.println("ilkkharf = " + ilkkharf);
        System.out.println("ikkinci = " + ikkinci);
        System.out.println("ükharf = " + ükharf);

        Scanner oku3=new Scanner(System.in);
        System.out.print("Kelime giriniz=");
        String text2=oku3.nextLine();
        boolean varmi=text2.contains("B");
        System.out.println("varmi = " + varmi);

        Scanner oku4=new Scanner(System.in);
        System.out.print("Şifreli kredi kartı no=");
        String no=oku4.nextLine();
        int uzunluk=no.length();
        String ilk=no.substring(0,no.indexOf(" "));
        String ikinci=no.substring(no.indexOf(" ")+1,no.lastIndexOf(" ")-5);
        String ücüncü=no.substring(no.indexOf(" ")+6, no.lastIndexOf(" "));
        String dördüncü=no.substring(no.lastIndexOf(" ")+1,uzunluk);
        String ilkdört=ilk.replaceAll("[0-9]","*");
        String ikincidört=ikinci.replaceAll("[0-9]","*");
        String üçüncüdört=ücüncü.replaceAll("[0-9]","*");
        System.out.println("Top Secret = " + ilkdört+" "+ikincidört+" "+üçüncüdört+" "+dördüncü);

        Scanner oku5=new Scanner(System.in);
        System.out.print("Cümle Giriniz =");
        String text5=oku5.nextLine();
        int uzunluk5=text5.length();
        String sonkelime=text5.substring(text5.lastIndexOf(" "),uzunluk5);
        System.out.println("sonkelime = " + sonkelime);


















    }
}
