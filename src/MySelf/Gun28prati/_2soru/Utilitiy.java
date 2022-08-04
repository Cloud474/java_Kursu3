package MySelf.Gun28prati._2soru;

public class Utilitiy {

public static int getMax(int a, int b) {
   return Math.max(a, b);
}
public static int getMin(int a, int b){
    return Math.min(a, b);
}
    public static int getRandom(int max, int min){
    int random=(int) (Math.random()*(max-min)+1)+min;
    return random;
    }
    public static int getAbs(int a){
    return Math.abs(a);
    }
    public static int getCeil(int a){
    return (int) Math.ceil(a);
    }
    public static int getdiziElemanlarTopla(int[] dizi){
    int toplam=0;
    for (int e:dizi)
        toplam+=e;
    return toplam;
    }

}
