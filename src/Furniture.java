public class Furniture {
    String name;
    double price;
    final double vat=0.23;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price-(price*vat);
    }

    public double getPriceIncludingVat() {
        return price;
    }

}