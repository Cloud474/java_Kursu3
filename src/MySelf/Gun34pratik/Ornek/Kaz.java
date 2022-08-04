package MySelf.Gun34pratik.Ornek;

public class Kaz extends Ordekler{//torun özelliği ördekten aldı
    public void konustu(){
        super.konustu();
        System.out.println("vik vik dedi");
    }

    public Kaz(String name, String cinsi, int kilo, int kanatAcikligi) {
        super(name, cinsi, kilo, kanatAcikligi);
    }

    @Override
    public String toString() {
        return "Kaz{" +
                "kanatAcikligi=" + kanatAcikligi +super.toString()+
                '}';
    }
}
