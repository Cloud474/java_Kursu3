package MySelf.Ödev.GenelÖdev.Soru5;

public class Soru5 {
    public static void main(String[] args) {
        int[][] dizi={{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};

        int max=dizi[0][0];
        for (int i = 0; i < dizi.length; i++)
            for (int j = 0; j < dizi[i].length; j++)
                    if (dizi[i][j]>max)
                        max=dizi[i][j];
        System.out.println("max = " + max);
    }
}
