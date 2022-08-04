package MySelf.Gun37pratik.Ornek_4;

public class A4 implements IGosterir, IYazdirir {
    @Override
    public void goster() {
        System.out.println("gösterdi");
    }

    @Override
    public void yaz() {
        System.out.println("yazdırdı");
    }
}
