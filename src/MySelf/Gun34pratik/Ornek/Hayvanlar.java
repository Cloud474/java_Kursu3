package MySelf.Gun34pratik.Ornek;

public class Hayvanlar {//dede gibi miras verdi herkese
    String name;
    String cinsi;
    int kilo;


    public void konustu(){
        System.out.println("hayvan konuştu");
    }

    public Hayvanlar(String name, String cinsi, int kilo) {
        this.name = name;
        this.cinsi = cinsi;
        this.kilo = kilo;
    }

    @Override
    public String toString() {
        return "Hayvanlar{" +
                "name='" + name + '\'' +
                ", cinsi='" + cinsi + '\'' +
                ", kilo=" + kilo +
                '}';
    }
}
