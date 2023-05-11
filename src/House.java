import java.util.ArrayList;
import java.util.List;

public class House {

    List<Room> roomList;
    static int roomCount =0;

    public House(List<Room> roomList) {
        this.roomList = new ArrayList<>();
        roomCount+=roomList.size();
    }

    public void addRoom(Room room){
        roomList.add(room);
        roomCount++;
    }

    public void addRooms(List<Room> rooms){
        roomList.addAll(rooms);
        roomCount+=rooms.size();
    }

    public static int getRoomCount(){
        return roomCount;
    }
}