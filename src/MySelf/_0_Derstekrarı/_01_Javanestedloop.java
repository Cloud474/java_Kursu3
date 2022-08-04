package MySelf._0_Derstekrarı;

public class _01_Javanestedloop {
    public static void main(String[] args) {

        for (int j=1;j<=10;j++) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(j + "x" + i + "=" + (i * j));
            }
            System.out.println();
        }
    }
}
