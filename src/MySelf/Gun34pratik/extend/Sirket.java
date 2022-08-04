package MySelf.Gun34pratik.extend;

public class Sirket {
    public static void main(String[] args) {
        Yonetici yon1=new Yonetici();
        yon1.ad="ismet";
        yon1.maas=4000;
        yon1.departman="Destek ekibi";
        yon1.sicilNo=3454;
        yon1.tcNo="12345";
        yon1.zamYap();
        yon1.bordroYazdir();
        // bir classtaki bütün özellikleri başka bir classa tanımlamak istıyorsan extends class ismi
        // yazıp bütün özellikleri başka bir classa bir nevi miras kalıyor
        //  extends Personel yazıp personeldeki bütün özellikleri alabiliyoruz
        // yeniden yazmamıza gerk kalmıyor. büyük kolaylık. çok kullanılıyor. ezberle...

    }
}
