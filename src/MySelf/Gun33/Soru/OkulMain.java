package MySelf.Gun33.Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        Okul okul=new Okul("Cumhuriyet lisesi",5);

        do {
            System.out.print("Öğrenci ad = ");
            String ad=oku.nextLine();

            System.out.print("Öğrenci soyad = ");
            String soyad=oku.nextLine();

            System.out.print("Öğrenci yaş = ");
            int yas=okuInt.nextInt();

            if (yas<15){
                Ogrenci ogr=new Ogrenci(ad,soyad,yas);
                okul.ogrenciler.add(ogr);}
            else{ System.out.println("Öğrenci yaş sebiyle alınamadı");}
            System.out.println("okul = " + okul.ogrenciler);
        }while (okul.ogrenciler.size()< okul.getKontenjan());


    }
}
