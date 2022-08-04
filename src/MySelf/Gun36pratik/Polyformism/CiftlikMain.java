package MySelf.Gun36pratik.Polyformism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek=new Kopek("karabaş");
        Kedi kedi=new Kedi("tekir");
        kopek.ses();// gerçekten kopek
        kedi.ses();// gerçekten kedi

        hayvanSes(kedi);
        hayvanSes(kopek);

    }

    public static void hayvanSes(Hayvan h){
        h.ses();
    }
}
