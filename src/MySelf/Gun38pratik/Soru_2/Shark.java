package MySelf.Gun38pratik.Soru_2;

public class Shark implements Salling{
    @Override
    public String food() {
        return "Beslerken dikkat edin tehlikelidir";
    }
    private String isim;

    public Shark(String isim) {
        setIsim(isim);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Shark{" +
                "isim='" + isim + '\'' +
                '}';
    }
}
