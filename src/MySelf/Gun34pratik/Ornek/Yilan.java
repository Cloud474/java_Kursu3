package MySelf.Gun34pratik.Ornek;

public class Yilan extends Hayvanlar{
    int uzunluk;
    public void konustu(){
        super.konustu();
        System.out.println("tıss dedi");
    }

    public Yilan(String name, String cinsi, int kilo, int uzunluk) {
        super(name, cinsi, kilo);
        this.uzunluk = uzunluk;
    }

    @Override
    public String toString() {
        return "Yilan{" +
                "uzunluk=" + uzunluk +super.toString()+
                '}';
    }
}
