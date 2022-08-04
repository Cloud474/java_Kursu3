package MySelf.Gun40pratik.Soru1;

public class Kedi extends Hayvan{
    @Override
    public void yiyecegi() {
        System.out.println("et ve mama");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("günde 3 5 defa. bu hayvan aç");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("günde en az 10 saat tembel hayvan");
    }

    @Override
    public void sesi() {
        System.out.println("meaw meaw");
    }
}
