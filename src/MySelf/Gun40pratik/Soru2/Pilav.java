package MySelf.Gun40pratik.Soru2;

public class Pilav implements Food{
    @Override
    public void taste() {
        System.out.println("Yemeğin tadı çok iyi karamelize");
    }

    @Override
    public double ucret() {
        int ucret=44;
        System.out.println("Pilav ücreti = " + ucret);
        return ucret;
    }
    public void fry(){
        System.out.println("yağda kızartıldı");
    }
    public void boil(){
        System.out.println("Kaynama derecesi 90");
    }
}
