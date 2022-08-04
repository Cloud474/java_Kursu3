package MySelf.Gun37pratik.Soru_1;

public class Diktorgen implements IAlan{

    @Override
    public void alan(int uzunluk, int genislik) {
        int alan=genislik*uzunluk;
        int cevre=(genislik*uzunluk)*2;
        System.out.println("Diktörtgenin alanı = " + alan);
        System.out.println("Diktörtgenin cevresi = " + cevre);
    }

    @Override
    public void alan(int uzunluk) {
    }
}
