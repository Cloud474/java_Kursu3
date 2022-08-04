package MySelf.Ödev.GenelÖdev.Soru12;

import java.util.ArrayList;

public class Soru12 {
    public static void main(String[] args) {
        String str = "aabbbcccc";

        System.out.println("charCount(str) = " + charCount(str));

    }

    public static String charCount(String str) {
        int count = 1;
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                stringArrayList.add(count + "" + str.charAt(i - 1));
                count = 1;
            }
        }
        stringArrayList.add(count + "" + str.charAt(str.length() - 1));
        return String.valueOf(stringArrayList);
    }

}

