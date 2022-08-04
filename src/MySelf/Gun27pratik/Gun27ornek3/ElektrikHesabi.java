package MySelf.Gun27pratik.Gun27ornek3;

public class ElektrikHesabi {
    int toplamTuketim;
    double birimfiyat=0.7;
    double fatura;
    public void tuketimEkle(int tuketim){
        toplamTuketim+=tuketim;
    }
    public void toplamtuketimYaz(){
        System.out.println("toplamtuketim = " + toplamTuketim);
    }
    public void odenecekTutar(){
        System.out.println("ödenecek tutar = " +(birimfiyat*toplamTuketim)+" TL");
    }
}
