package MySelf.Gun40pratik.Soru2;

public class Lahmacun implements Food{
    @Override
    public void taste() {
        System.out.println("Tadı damağınıza layık");
    }

    @Override
    public double ucret() {
        int ucret=33;
        System.out.println("Lahmacun ücreti = " + ucret);
        return ucret;
    }
    public void dough(){
        System.out.println("İnce hamurdan yapıldı");
    }

    public void addMeat(){
        System.out.println("Etler dana kıyma");
    }
    public void bake(){
        System.out.println(" tam kıvamında pişirildi");
    }
}
