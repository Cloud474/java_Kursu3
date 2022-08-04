package MySelf.Gun43pRatik;

public class JavaTryCatch_3 {
    public static void main(String[] args) {
        String str="";
        long startTime=0;
        try {
            startTime=System.currentTimeMillis();
            System.out.println("hatadan önceki nokta");
            char ilkHarf=str.charAt(0);
            System.out.println("hatadan sonraki nokta");

        }catch (Exception hata){
            System.out.println("catch bloğu çalıştı");
        }
        finally {//try-catch finali
            long gecensure=System.currentTimeMillis()-startTime;
            System.out.println("gecensure = " + gecensure);
            System.out.println("tray-catch bloğuyla ilgili son yapılcaklar");
        }
        //hata olsun veya olmasın çalışacak final bölümü
        //her zaman çalışır
        //kullanma sebebi: try catchin içinde yapılmış
        //işlemlerde arta kalan kapama gibi bu bölüme ait işlemler
        //yapılarak kod düzeni sağlamış olur


    }
}
