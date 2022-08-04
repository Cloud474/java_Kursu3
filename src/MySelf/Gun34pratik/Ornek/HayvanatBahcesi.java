package MySelf.Gun34pratik.Ornek;

public class HayvanatBahcesi {
    public static void main(String[] args) {
       //Kopek kopek1=new Kopek();

       //kopek1.name="fifi";
       //kopek1.cinsi="pitbul";
       //kopek1.kilo=6;
       //kopek1.hayvanId=1;
       //kopek1.konustu();
       //Ordekler ordek=new Ordekler();
       //ordek.konustu();
       //Kedi kedi=new Kedi();
       //kedi.konustu();
       //Yilan yilan=new Yilan();
       //yilan.konustu();
       //Kaz kaz=new Kaz();
       //kaz.konustu();
        // classlara yeni metod ekleyince mevcuttakiler
        // default duruma düştü.
        // unutma öncelik ilk classtakilerde
        Ordekler o1=new Ordekler("fifi","pekin",3,4);
        Kopek k1=new Kopek("fifi","pitbull",10);
        Yilan y1=new Yilan("anakonda","piton",150,10);
        Kedi kedi1=new Kedi("pati","van",10);
        Kaz kaz=new Kaz("pekin","kaz",5,2);

        o1.konustu();
        System.out.println("o1 = " + o1);
        k1.konustu();
        System.out.println("k1 = " + k1);
        y1.konustu();
        System.out.println("y1 = " + y1);
        kedi1.konustu();
        System.out.println("kedi1 = " + kedi1);
        kaz.konustu();
        System.out.println("kaz = " + kaz);
    }
}
