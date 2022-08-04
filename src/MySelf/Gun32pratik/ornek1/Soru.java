package MySelf.Gun32pratik.ornek1;

public class Soru {
    public static void main(String[] args) {
        Aylar ay=Aylar.MAYIS;
        switch (ay){
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK:System.out.println(31);
            case SUBAT:System.out.println(28);
            case NISAN:
            case HAZIRAN:
            case EYLUL:
            case KASIM:System.out.println(30);
        }
        System.out.println("ay.ordinal() = " + ay.ordinal());
        System.out.println("ay.name() = " + ay.name());

        for (Aylar a:Aylar.values())
            System.out.println((a.ordinal()+1)+"= " + a);

    }
}
