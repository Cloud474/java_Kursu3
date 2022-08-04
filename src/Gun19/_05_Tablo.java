package Gun19;

import java.util.Arrays;

public class _05_Tablo {
    public static void main(String[] args) {
        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et

        int[][] tablo = new int[4][3];
        int[][] tablo2 = {{1, 2, 3}, {3, 2, 1}, {5, 5, 5}, {2, 10, 3}};
        int enb = tablo2[0][0];


        for (int i = 0; i < tablo.length; i++)  // satır için tablo.length

            for (int j = 0; j < tablo[i].length; j++)  //sütun için tablo[i].length ->her satırın eleman
                                                       //sayısını i verdiği için
                if (tablo2[i][j]>enb)
                    enb=tablo2[i][j];

        System.out.println("en büyük sayı = " + enb);




    }
}
