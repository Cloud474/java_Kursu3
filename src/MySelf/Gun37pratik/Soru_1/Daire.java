package MySelf.Gun37pratik.Soru_1;

public class Daire implements ICevresi{


    @Override
    public void alan(int yariCap) {
        double alan=Math.PI * yariCap * yariCap;
        System.out.println("Dairenin alanı = " + alan);
    }

    @Override
    public void cevre(int yariCap) {
        double cevre=2*(Math.PI*yariCap);
        System.out.println("Dairedin Çevresi = " + cevre);
    }
}
