package MySelf.Gun39pratik.Ödev.Soru_2;

public class Substract extends Calculator{
    @Override
    public int calculating(int a, int b) {
        int cikarma=a-b;
        System.out.println("Çıkarma işlemi = " + cikarma);
        return cikarma;
    }
}
