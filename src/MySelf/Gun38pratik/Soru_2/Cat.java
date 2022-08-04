package MySelf.Gun38pratik.Soru_2;

public class Cat implements Animal{
    @Override
    public String food() {
        return "Çok hırçın. beslerken tırmalayabilir";
    }
    private String isim;

    public Cat(String isim) {
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
        return "Cat{" +
                "isim='" + isim + '\'' +
                '}';
    }
}
