package MySelf.Gun39pratik.Ödev.Soru_2;

public class Divide extends Calculator{
    @Override
    public int calculating(int a, int b) {
        int sonuc=a/b;
        System.out.println("Bölme Sonucu = " + sonuc);
        return sonuc;
    }
}
