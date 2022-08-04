package MySelf.Gun26pRatik;

public class _1JavaClass {
    public static void main(String[] args) {
        Araba arb=new Araba();
        arb.model="A7";
        arb.renk="Kırmızı";
        arb.motor=750;
        arb.hacim=2000;
        System.out.println("arb.model = " + arb.model);
        System.out.println("arb.renk = " + arb.renk);
        System.out.println("arb.motor = " + arb.motor);
        System.out.println("arb.hacim = " + arb.hacim);


    }
    static class Araba{
        String model;
        String renk;
        int motor;
        int hacim;
    }
}

