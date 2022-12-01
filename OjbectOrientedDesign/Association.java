package OjbectOrientedDesign;

import OjbectOrientedDesign.Components.House;

public class Association {
    public static void main(String[] args) {
        var house = new House();
        house.addRoom(1, 2);
        System.out.println("Room count: "+house.getNumberOfRooms());
    }
}
