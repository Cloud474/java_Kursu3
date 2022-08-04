package MySelf.Gun40pratik.Soru1;

public class Main {
    public static void main(String[] args) {
        Kartal kartal=new Kartal();
        kartal.setIsim("Kartal");
        kartal.setVahsi(true);
        kartal.setDogumTarihi("12.08.2020");
        System.out.println("kartal = " + kartal);

        Kedi kedi=new Kedi();
        kedi.setIsim("Tekil");
        kedi.setVahsi(false);
        kedi.setDogumTarihi("12.9.2021");
        System.out.println("kedi = " + kedi);
    }
}
