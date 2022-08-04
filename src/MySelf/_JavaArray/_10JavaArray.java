package MySelf._JavaArray;

public class _10JavaArray {
    public static void main(String[] args) {
       int[][] tablo={
               {1,2,3,4},
               {1,2},
               {12,34,67,45,48},
               {8,9,45}
       };

        for (int i = 0; i < tablo.length; i++){
            for (int j = 0; j < tablo[i].length; j++)
                System.out.print(tablo[i][j]+" ");
        System.out.println();
        }



    }
}
