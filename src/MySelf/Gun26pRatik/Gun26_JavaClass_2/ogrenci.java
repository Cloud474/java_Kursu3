package MySelf.Gun26pRatik.Gun26_JavaClass_2;

import java.util.ArrayList;

public class ogrenci {
    String Tamadi;
    int okulNo;
    int not;
    public void bilgiYaz( ArrayList<ogrenci> notlistesi){
        for (ogrenci ogr:notlistesi){
            System.out.println(ogr.okulNo+" "+ogr.Tamadi+" "+ogr.not);
        }
    }
    public  void ortalamayaz( ArrayList<ogrenci> notlistesi){
        int toplam=0;
        int ort=0;
        for (ogrenci ogr:notlistesi) {
            toplam+=ogr.not;
        }
        System.out.println("Sınıf ortalaması = " + toplam / notlistesi.size());
    }


}
