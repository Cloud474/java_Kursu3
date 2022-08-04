package MySelf.Ödev.GenelÖdev.Soru14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Soru14 {
    public static void main(String[] args) {
        Set<Integer> numbers=new HashSet<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(9);
        System.out.println("allNumbers(numbers) = " + allNumbers(numbers));
    }
    public static ArrayList<Integer> allNumbers(Set<Integer> numbers){
        ArrayList<Integer> allNumbers=new ArrayList<>();
        for (Integer i:numbers)
            allNumbers.add(i);
        return allNumbers;
    }
}
