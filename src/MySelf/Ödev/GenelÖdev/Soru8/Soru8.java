package MySelf.Ödev.GenelÖdev.Soru8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Soru8 {
    public static void main(String[] args) {

        ArrayList<String> cumle=new ArrayList<>();
        cumle.add("Bugün");
        cumle.add("hava");
        cumle.add("çok");
        cumle.add("güzel");
        Collections.reverse(cumle);
        System.out.println("cumle = " + cumle);
    }
}
