package MySelf.gun21ödev;

public class Soru10 {
    //**isUnique** adında bir method oluşturun.
    //Parametre olarak int array alır.
    // ve bu dizideki değerlerin benzersiz olup olmadığını gösteren
    // bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8};
        System.out.println(isUnique(array));


    }

    public static boolean isUnique(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = (1+i); j < array.length; j++) {

                if (array[i]==array[j]){
                    return false;
                }
            }
        }

        return true;
    }
}
