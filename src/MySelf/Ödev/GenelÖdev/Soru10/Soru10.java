package MySelf.Ödev.GenelÖdev.Soru10;

public class Soru10 {
    public static void main(String[] args) {
        String[][] dizi = {{"$12", "$22", "5$"}, {"€9", "€40", "$1", "$2"}, {"€12"}};

        double toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j].contains("$")) {
                    String para1 = dizi[i][j].replaceAll("\\$", "");
                    toplam = toplam + Integer.parseInt(para1) * 3.2;
                } else if (dizi[i][j].contains("€")) {
                    String para2 = dizi[i][j].replaceAll("€", "");
                    toplam = toplam + Integer.parseInt(para2) * 4.2;
                }
            }
        }
        System.out.println("toplam = " +toplam);
    }
}