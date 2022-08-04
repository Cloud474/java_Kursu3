package MySelf._0_HuseyinBulut;

import java.util.Scanner;

public class _0HuseyinBulutOdev {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Adınız=");
        String ad=oku.next();

        System.out.print("Sayı=");
        int sayı=oku.nextInt();

        System.out.print("Sevdiğiniz Meyve=");
        String Meyve=oku.next();

        System.out.print("Arabanızdaki kapı sayısı=");
        int kapısayısı=oku.nextInt();

        System.out.print("10 sene öne yaşadığınız şehir=");
        String yaşadığınızşehir=oku.next();

        System.out.print("Doğum Gününüz=");
        String doğumGününüz=oku.next();

        System.out.print("Bir Banka Hesabınız var mı ?=");
        boolean Hesabınızvarmı=oku.nextBoolean();

        System.out.print("Ağırlık=");
        byte Ağırlık=oku.nextByte();

        System.out.print("Boyunuz=");
        float Boyunuz=oku.nextFloat();


    }
}
