package MySelf.Ödev.GenelÖdev.Soru2;

import java.util.ArrayList;
import java.util.Collections;

public class Soru2 {
    public static void main(String[] args) {
        ArrayList<String> liste= new ArrayList<>();
        liste.add("Peach");
        liste.add("Berry");
        liste.add("Orange");
        liste.add("WaterMelon");
        liste.add("Orange");

        Collections.replaceAll(liste,"Orange","Apple");
        System.out.println("liste = " + liste);

    }
}
