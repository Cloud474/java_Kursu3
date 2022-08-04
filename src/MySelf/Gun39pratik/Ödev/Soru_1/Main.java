package MySelf.Gun39pratik.Ödev.Soru_1;

public class Main {
    public static void main(String[] args) {
        Tigers tiger=new Tigers();
        System.out.println(Tigers.class.getSimpleName());
        tiger.talk();
        tiger.walk();
        Lions lion=new Lions();
        System.out.println(Lions.class.getSimpleName());
        lion.talk();
        lion.walk();
        HomeCats homeCat=new HomeCats();
        System.out.println(HomeCats.class.getSimpleName());
        homeCat.talk();
        homeCat.walk();
    }
}
