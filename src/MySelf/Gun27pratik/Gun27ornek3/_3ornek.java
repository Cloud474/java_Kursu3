package MySelf.Gun27pratik.Gun27ornek3;

public class _3ornek {
    public static void main(String[] args) {

        Musteri M1=new Musteri();
        M1.Name="Rümeysa BULUT";

        ElektrikHesabi hesap=new ElektrikHesabi();
        M1.ElektrikHesabi= hesap;

        M1.ElektrikHesabi.tuketimEkle(100);
        M1.ElektrikHesabi.tuketimEkle(200);
        M1.ElektrikHesabi.tuketimEkle(150);

        M1.ElektrikHesabi.toplamtuketimYaz();
        M1.ElektrikHesabi.odenecekTutar();
    }
}
