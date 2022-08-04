package MySelf.Gun34pratik.Ornek;

public class Ordekler extends Hayvanlar {//baba oldu kaza özellik verdi
    int kanatAcikligi;

    public void konustu() {
        super.konustu();
        System.out.println("vak vak dedi");
    }

    public Ordekler(String name, String cinsi, int kilo, int kanatAcikligi) {
        super(name, cinsi, kilo);
        this.kanatAcikligi = kanatAcikligi;
    }

    @Override
    public String toString() {
        return "Ordekler{" +
                "kanatAcikligi=" + kanatAcikligi +super.toString()+
                '}';
    }
}

