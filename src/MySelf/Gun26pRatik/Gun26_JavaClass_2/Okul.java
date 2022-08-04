package MySelf.Gun26pRatik.Gun26_JavaClass_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        ArrayList<ogrenci> notlistesi=new ArrayList<>();
        Scanner oku=new Scanner(System.in);
        Scanner okuint=new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            ogrenci ogr=new ogrenci();
            System.out.print("Ad soyad = ");
            ogr.Tamadi=oku.nextLine();
            System.out.print("Okul No = ");
            ogr.okulNo=okuint.nextInt();
            System.out.print("Not = " );
            ogr.not=okuint.nextInt();
            notlistesi.add(ogr);

        }
        bilgiYaz(notlistesi);
        ortalamayaz(notlistesi);
    }
    public static void bilgiYaz( ArrayList<ogrenci> notlistesi){
        for (ogrenci ogr:notlistesi){
            System.out.println(ogr.okulNo+" "+ogr.Tamadi+" "+ogr.not);
        }
    }
    public static void ortalamayaz( ArrayList<ogrenci> notlistesi){
        int toplam=0;
        int ort=0;
        for (ogrenci ogr:notlistesi) {
            toplam+=ogr.not;
        }
        System.out.println("Sınıf ortalaması = " + toplam / notlistesi.size());
    }
}

