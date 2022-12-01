package ObjectOrientedDesign;

import ObjectOrientedDesign.Components.Vehicle;

/*
 * Vehicle object cannot exist without Wheel object.
 */

public class Composition {
    public static void main(String[] args) {
        var vh = new Vehicle();
        vh.setWheel(4, 35.56f);
        System.out.println("Vehicle with "+vh.getWheelCount()+" wheels!");
    }
}
