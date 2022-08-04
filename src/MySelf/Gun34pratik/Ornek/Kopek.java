package MySelf.Gun34pratik.Ornek;

public class Kopek extends Hayvanlar{
    public void konustu(){
        super.konustu();
        System.out.println("hav hav dedi");
    }

    public Kopek(String name, String cinsi, int kilo) {
        super(name, cinsi, kilo);
    }

    @Override
    public String toString() {
        return "Kopek{" +
                "name='" + name + '\'' +
                ", cinsi='" + cinsi + '\'' +
                ", kilo=" + kilo +
                '}';
    }
}
