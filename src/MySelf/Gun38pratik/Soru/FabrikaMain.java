package MySelf.Gun38pratik.Soru;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {
        TeslaElectric tesla=new TeslaElectric("Model S",350);
        ToyotaPirus toyota=new ToyotaPirus("pirus",900);
        Bus bus=new Bus("IVECO",7000);
        ArrayList<Vehicle> arabalar=new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(toyota);
        arabalar.add(bus);

        for (Vehicle v: arabalar){
            System.out.println(v.getClass().getSimpleName());
            System.out.println("-------------------");

            System.out.println(" Model = " + v.getModel());
            System.out.println(" Engine = " + v.getEngine());

            if (v instanceof TeslaElectric){
                System.out.println(((TeslaElectric)v).drive());
            System.out.println(((TeslaElectric)v).changeBattery());}

            if (v instanceof ToyotaPirus){
                System.out.println(((ToyotaPirus)v).drive());
            System.out.println(((ToyotaPirus)v).changeBattery());
            System.out.println(((ToyotaPirus)v).changeOil());}

            if (v instanceof Bus){
                System.out.println(((Bus)v).drive());
            System.out.println(((Bus)v).changeDiesel());}


        }
    }
}
