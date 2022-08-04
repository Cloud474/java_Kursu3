package MySelf.Gun28prati._3soru;

public class Soru {
    public static void main(String[] args) {
        // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
        // 1- Ders Class : adı: Lesson , fields : name, credit (1-10 arasında değer alıyor)
        // 2- Öğrenci Class: adı: Student, fields : name, maxCredit, dersleri listesini
        //    tutacak bir liste
        // 3- 3 adet ders oluşturunuz.
        // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredi si 10 olsun.
        // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
        //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse

        Lesson ders1=new Lesson();
        ders1.Name="Java";
        ders1.credit=4;
        Lesson ders2=new Lesson();
        ders2.Name="Math";
        ders2.credit=4;
        Lesson ders3=new Lesson();
        ders3.Name="Geo";
        ders3.credit=4;
        Student ogr=new Student();
        ogr.name="Rümeysa";
        ogr.maxcredit=10;

        ogr.dersekle(ders1);
        ogr.dersekle(ders2);
        ogr.dersekle(ders3);


    }
}
