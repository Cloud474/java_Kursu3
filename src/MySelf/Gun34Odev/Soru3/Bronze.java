package MySelf.Gun34Odev.Soru3;

public class Bronze extends Gold{
    String Bronze;

    public Bronze(String bronze) {
        super(bronze);
        Bronze = bronze;
    }

    public void üyelik(){
        System.out.println("**Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos. yazdırınız.**");

    }

    @Override
    public String toString() {
        return "Bronze{" +
                "Bronze='" + Bronze + '\'' +
                '}';
    }
}
