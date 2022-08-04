package MySelf.Gun33.Encapsolutıon;

public class KisiMain {
    public static void main(String[] args) {

        Kisi kisi1=new Kisi();
        kisi1.ad="Rümeysa";
        kisi1.soyad="Bulut";
        //kisi1.yas=-24;
        kisi1.YasAta(-24);

        int yas= kisi1.YasGetir();
        System.out.println("kisi1 = " + kisi1);

        Kisi kisi2=new Kisi("Rümeysa","Bulut",24);
        System.out.println("kisi2 = " + kisi2);




    }
}
