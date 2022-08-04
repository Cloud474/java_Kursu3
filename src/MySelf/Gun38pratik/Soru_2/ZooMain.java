package MySelf.Gun38pratik.Soru_2;

import MySelf.Gun38pratik.Soru.TeslaElectric;

import java.util.ArrayList;

public class ZooMain {
    public static void main(String[] args) {
        Duck duck=new Duck("dafi","1");
        Shark shark=new Shark("Zalım");
        Cat cat=new Cat("Priences");
        Swallow swallow=new Swallow("kırlngıc");
        ArrayList<Animal> hayvanlar=new ArrayList<>();
        hayvanlar.add(duck);
        hayvanlar.add(shark);
        hayvanlar.add(cat);
        hayvanlar.add(swallow);

        for (Animal a: hayvanlar){
            System.out.println("-----------------");

            if (a instanceof Duck){
                System.out.println("Duck food = " + ((Duck) a).food());}
            if (a instanceof Shark){
                System.out.println("Shark food = " + ((Shark) a).food());}
            if (a instanceof Cat){
                System.out.println("Cat food = " + ((Cat) a).food());}
            if (a instanceof Swallow){
                System.out.println("Swallow food = " + ((Swallow) a).food());}
        }
    }
}
