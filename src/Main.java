import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // sprawdzenie kalsy multiply
        Multiplier multiplier = new Multiplier();
        int a=1;
        int b=2;
        int result1= multiplier.multiply(a,b);
        System.out.println(result1);

        int c=3;
        int d=4;
        int result2 = multiplier.multiply(a,b,c,d);
        System.out.println(result2);

        double e=5.1;
        double f=6.1;
        double result3= multiplier.multiply(e,f);
        System.out.println(result3);

        BigDecimal g=new BigDecimal("1234567890.1");
        BigDecimal h=new BigDecimal("234567809.1");
        BigDecimal result4 = multiplier.multiply(g,h);
        System.out.println(result4);
        //sprawdzenie klasy adder
        Adder adder = new Adder();

        int a1 = 10;
        int b1 = 11;
        int result1a=adder.add(a1,b1);
        System.out.println(result1a);

        BigDecimal i=new BigDecimal("1234567890.1");
        BigDecimal j=new BigDecimal("234567809.1");
        List<BigDecimal> bigDecimalList = new ArrayList<>();
        bigDecimalList.add(i);
        bigDecimalList.add(j);
        BigDecimal result5 = adder.add(bigDecimalList);
        System.out.println(result5);

        //sprawdzenie klasy furniture
        Furniture chair = new Furniture("Krzesło",100.00);
        System.out.println("Cena bez vat to:"+" "+chair.getPrice()+"PLN");
        System.out.println("Cena z vat to:"+" "+chair.getPriceIncludingVat()+"PLN");

        //Sprawdzenie klasy room
        ArrayList<Furniture> room1Furnitures = new ArrayList<>();
        room1Furnitures.add(chair);

        Furniture bed = new Furniture("Łóżko", 1200.0);
        room1Furnitures.add(bed);

        Furniture table = new Furniture("stół", 200.0);
        room1Furnitures.add(table);
        Room room1 = new Room(15.0, room1Furnitures);

        System.out.println(room1.getTotalPriceIncludingVat());

        //Sprawdzenie klasy House
        Room room2 = new Room(100,room1Furnitures);
        Room room3 = new Room(200,room1Furnitures);
        List <Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        House home1 = new House(roomList);
        System.out.println("Aktualna lista pokoi to:"+House.getRoomCount());
        home1.addRoom(room3);
        System.out.println("Po zmianie lista pokoi to:"+House.getRoomCount());

        Room room4 = new Room(300,room1Furnitures);
        Room room5 = new Room(400,room1Furnitures);
        List<Room> rooms = new ArrayList<>();
        rooms.add(room4);
        rooms.add(room5);
        home1.addRooms(rooms);
        System.out.println("Po dodaniu listy pokoi to:"+House.getRoomCount());


    }
}