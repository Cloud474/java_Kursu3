package MySelf._JavaArray;

public class _01Javadizi {
    public static void main(String[] args) {
        int[] dizi=new int[50];

        for (int i = 0; i < dizi.length; i++)
            dizi[i]=(int) (Math.random()*10);



        for (int i = 0; i < dizi.length; i++)
            System.out.println("önce dizi ["+i+"]="   + dizi[i]);

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==1)
                dizi[i]=1;
            else
                dizi[i]=0;
        }

        for (int i = 0; i < dizi.length; i++)
            System.out.println("sonra dizi ["+i+"]="   + dizi[i]);



        }
    }
