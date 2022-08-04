package MySelf.Gun39pratik.Ödev.Soru_2;

public class Sum extends Calculator{
    @Override
    public int calculating(int a, int b) {
        int toplam=a+b;
        System.out.println("toplam Sonuç = " + toplam);
        return toplam;
    }
}
