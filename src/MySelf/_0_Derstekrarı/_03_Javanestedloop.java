package MySelf._0_Derstekrarı;

public class _03_Javanestedloop {
    public static void main(String[] args) {

            for (int j = 0; j <= 5; j++) {
                for (int i = 0; i < j; i++)
                    System.out.print("*");
                System.out.println();
            }

        for (int j = 5; j >= 0; j--) {
            for (int i = 0; i < j; i++)
                System.out.print("*");
            System.out.println();
        }

    }
}
