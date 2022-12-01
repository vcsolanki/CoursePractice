package ObjectOrientedDesign.Components;

import java.util.ArrayList;

public class House {
    private ArrayList<Room> rooms;
    public House()
    {
        rooms = new ArrayList<Room>();
    }
    public int getNumberOfRooms()
    {
        return rooms.size();
    }
    public void addRoom(int doorCount, int windowCount)
    {
        var room = new Room();
        room.doorCount=doorCount;
        room.windowCount =windowCount;
        rooms.add(room);
    }
}
