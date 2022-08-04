package MySelf.Gun31pratik.StaticModifier.Soru2;

public class Vatandas {
    String isim;
   final int tcNo;//değiştirilemez
    //yani bir kez veri atama şansı var

    static int tcNosayac=10032;

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = ++tcNosayac;
        //final değişkenlerine sadece bir kez veri atanabilir
        //o da ya tanımlanırken(mainde) yada consractorda
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
