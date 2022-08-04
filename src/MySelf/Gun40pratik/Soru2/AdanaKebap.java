package MySelf.Gun40pratik.Soru2;

public class AdanaKebap implements Food{
    @Override
    public void taste() {
        System.out.println(" Yemeğin tadı çok iyi karameliza");
    }

    @Override
    public double ucret() {
        int ucret=55;
        System.out.println("Adana Kebap Fiyatı = " +ucret );
        return ucret;
    }
    public void marianadel(){
        System.out.println(" Marine edildi");
    }

    public void grill(){
        System.out.println(" ızgarada pişirildi");
    }
}
