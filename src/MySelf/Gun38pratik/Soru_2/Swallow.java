package MySelf.Gun38pratik.Soru_2;

public class Swallow implements Flying{
    @Override
    public String food() {
        return "Yutulabilir";
    }

    private String isim;

    public Swallow(String isim) {
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
        return "Swallow{" +
                "isim='" + isim + '\'' +
                '}';
    }
}
