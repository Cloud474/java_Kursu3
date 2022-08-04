package MySelf._JavaArray;

public class _09JavaArray {
    public static void main(String[] args) {

        // 2 boyutlu 3x4 diziyi random 1-10 arası sayılarla doldurup,
        // başka döngüde yazdırınız.
        
        int[][] tablo=new int[3][4];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                tablo[i][j]=(int) (Math.random()*10);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(tablo[i][j]+" ");

            System.out.println();
        }





    }
}
