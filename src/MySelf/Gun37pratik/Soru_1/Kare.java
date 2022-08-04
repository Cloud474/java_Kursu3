package MySelf.Gun37pratik.Soru_1;

public class Kare implements IAlan{

    @Override
    public void alan(int uzunluk, int genislik) {    }

    @Override
    public void alan(int uzunluk) {
        int alan=uzunluk*uzunluk;
        int cevre=(uzunluk*uzunluk)*2;
        System.out.println("Karenin Alanı = " + alan);
        System.out.println("Karenin Çevresi = " + cevre);
    }
}
