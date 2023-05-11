import java.util.List;

public class Room {

    double area;
    List<Furniture> furnitureList;

    public Room(double area, List<Furniture> furnitureList) {
        this.area = area;
        this.furnitureList = furnitureList;
    }
    public double getTotalPriceIncludingVat() {
        double totalPrice = 0;
        for (Furniture furniture : furnitureList) {
            totalPrice += furniture.getPriceIncludingVat();
        }
        return totalPrice;
    }

}