package MySelf.Gun35pratik.Soru2;

public class Geometri {
    public static void main(String[] args) {
        Daire daire=new Daire(3);
        System.out.println("daire.getAlan() = " + daire.getAlan());
        System.out.println("daire.getCevre() = " + daire.getCevre());

        Dikdörtgen dikdörtgen=new Dikdörtgen(5,4);
        System.out.println("dikdörtgen = " + dikdörtgen.getAlan());
        System.out.println("dikdörtgen = " + dikdörtgen.getCevre());

        Kare kare=new Kare(5);
        System.out.println("kare.getAlan() = " + kare.getAlan());
        System.out.println("kare.getCevre() = " + kare.getCevre());
    }
}
