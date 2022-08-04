package MySelf.Ödev.GenelÖdev.Soru15;

import java.util.HashSet;
import java.util.Set;

public class Soru15 {
    public static void main(String[] args) {
        Set<String> kelimeler=new HashSet<>();
        kelimeler.add("repl");
        kelimeler.add("is");
        kelimeler.add("work");
        System.out.println("getTotalLength(kelimeler) = " + getTotalLength(kelimeler));
    }
    public static int getTotalLength(Set<String> kelimeler){
        int totalLength = 0;
        for (String s : kelimeler) {
            totalLength += s.length();
        }
        if (totalLength == 0) {
            return -1;
        }
        return totalLength;
    }
}
