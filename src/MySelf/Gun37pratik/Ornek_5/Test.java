package MySelf.Gun37pratik.Ornek_5;

public class Test implements IYazdirir,IGosterir{
    @Override
    public void gozter() {
        System.out.println("göster");
    }

    @Override
    public void yaz(String mesaj) {
        System.out.println("mesaj = " + mesaj);
    }

    @Override
    public void yaz() {
        System.out.println("yaz");
    }
}
