package MySelf.Gun35Odev;

public class Ogrenci extends Calisan{
    private int ucret;

    public Ogrenci(String isim, String adres, String okul, UyeTipi tipi, int ucret) {
        super(isim, adres, okul,tipi,ucret);
        setUcret(ucret);
    }

    public int getUcret() {return ucret;}

    public void setUcret(int ucret) {this.ucret = ucret;}

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ucret=" + ucret +super.toString()+
                '}';
    }
}
