package MySelf.Ödev.GenelÖdev.Soru6;

public class Soru6 {
    public static void main(String[] args) {

        int[][] dizi={{1,2,3},{2,3,1},{5,5,5},{2,1,3}};

        int min=dizi[0][0];
        for (int i = 0; i < dizi.length; i++)
            for (int j = 0; j < dizi[i].length; j++)
                if (dizi[i][j]<min)
                    min=dizi[i][j];
        System.out.println("min = " + min);
    }
}
