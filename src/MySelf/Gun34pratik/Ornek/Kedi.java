package MySelf.Gun34pratik.Ornek;

public class Kedi extends Hayvanlar{
    public void konustu(){
        super.konustu();
        System.out.println("miyav dedi");
    }

    public Kedi(String name, String cinsi, int kilo) {
        super(name, cinsi, kilo);
    }

    @Override
    public String toString() {
        return "Kedi{" +
                "name='" + name + '\'' +
                ", cinsi='" + cinsi + '\'' +
                ", kilo=" + kilo +
                '}';
    }
}
