package MySelf.Gun32pratik.Ornek3;

public class Pizza {
    PizzaSize size;
    double Price;

    public Pizza(double price) {
        Price = price;
    }

    public Pizza(PizzaSize size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", Price=" + Price +
                '}';
    }
}
