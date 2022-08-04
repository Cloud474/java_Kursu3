package MySelf.Gun26pRatik.Gun26_JavaClass_3;

public class _3kampüs {

    public static void main(String[] args) {

        ogrenci ogr=new ogrenci();
        okul okl=new okul();
        ogr.okulNo=123;
        ogr.tamAdi="Ahmet mütahit";
        okul dgr=new okul();
        ogr.okul=dgr;

        okl.adi="cumhuriyet lisesi";
        okl.mudurAdi="zalımın oğlu";
        okl.ucreti=12500;

        System.out.println("ogr = " + ogr.okulNo);
        System.out.println("ogr.tamAdi = " + ogr.tamAdi);
        System.out.println("ogr.okul = " + ogr.okul);
        System.out.println("okl.adi = " + okl.adi);
        System.out.println("okl.mudurAdi = " + okl.mudurAdi);
        System.out.println("okl.ucreti = " + okl.ucreti);

    }
}
