package MySelf.Gun34Odev.Soru3;

public class Silver extends Gold{
    String Silver;

    public Silver(String silver) {
        super(silver);
        Silver = silver;
    }

    @Override
    public String toString() {
        return "Silver{" +
                "Silver='" + Silver + '\'' +
                '}';
    }

    public void üyelik(){
        System.out.println("**Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework. yazdırınız.**");

    }
}
