package MySelf.Gun34pratik.Soru;

public class SirketMain {
    public static void main(String[] args) {
        Calisan calisan=new Calisan("Ahmet",4000,30);
        GenelMudur mudur=new GenelMudur("Rümeysa",3500,20,5000);
        System.out.println("calisan = " + calisan.maasHesapla());
        System.out.println("mudur = " + mudur.maasHesapla());

    }
}
