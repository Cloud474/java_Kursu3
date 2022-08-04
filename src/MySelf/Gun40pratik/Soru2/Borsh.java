package MySelf.Gun40pratik.Soru2;

public class Borsh implements Food{
    @Override
    public void taste() {
        System.out.println("Yemeğin tadı çok iyi karamelize");
    }

    @Override
    public double ucret() {
        int ucret=33;
        System.out.println("Lahmacun ucreti = " + ucret);
        return ucret;
    }
    public void boil(){
        System.out.println("kısık ateşte kaynatıldı ");
    }
    public void eatTomorrow(){
        System.out.println("Bir gün geçtikten sonra müşterilere veriliyor faydalı ve daha güzel");
    }
}
