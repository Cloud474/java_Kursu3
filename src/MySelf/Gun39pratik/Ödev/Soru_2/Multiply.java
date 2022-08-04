package MySelf.Gun39pratik.Ödev.Soru_2;

public class Multiply extends Calculator{
    @Override
    public int calculating(int a, int b) {
        int carpim=a*b;
        System.out.println("Çarpma işlemi = " + carpim);
        return carpim;
    }
}
