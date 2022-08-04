package MySelf.Gun38pratik.Soru_2;

public class Duck implements Flying,Salling{
    @Override
    public String food() {
        return "Katı gıdaları yiyemez";
    }
    private String isim;
    private String id;

    public Duck(String isim, String id) {
        setIsim(isim);
        setId(id);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "isim='" + isim + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
