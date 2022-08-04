package MySelf.Gun39pratik.Ornek2;

public class Main {
    public static void main(String[] args) {
        Dikdortgen dikdortgen=new Dikdortgen(4,5);
        dikdortgen.setName("Yeni Dikdortgen");
        System.out.println("dikdortgen = " + dikdortgen);
        dikdortgen.ciz();

        Daire daire=new Daire(4);
        daire.setName("Yeni Daire");
        System.out.println("daire = " + daire);
        daire.ciz();
    }
}
