package MySelf.TersiTekrar;

import java.util.Scanner;

public class Tersi {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle Gir = ");
        String cümle= oku.nextLine();

        String tersi="";
        int i=0;
        for (i=cümle.length()-1;i>=0;i--)
            tersi+=cümle.charAt(i);
        System.out.println("tersi = " + tersi);

        Scanner oku1=new Scanner(System.in);
        System.out.print("Cümle Gir = ");
        int sayi= oku1.nextInt();
        int tersSayi=0;
        while (sayi>0){
            int basamak=sayi%10;
            tersSayi=tersSayi*10+basamak;
            sayi=sayi/10;
        }
        System.out.println("tersSayi = " + tersSayi);
    }

}
