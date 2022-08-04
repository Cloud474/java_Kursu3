package Gun39.Ornek2;

public abstract class Sekil {
    private String name;

    public abstract double alan();
    public abstract double cevre();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void ciz(){
        System.out.println(this.name +" isimli şekil çizildi.");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "name='" + Math.round(alan()) + '\'' +
                "name='" + Math.round(cevre()) + '\'' +
                '}';
    }
}


