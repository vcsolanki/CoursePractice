package ObjectOrientedDesign.Components;

import java.util.ArrayList;

public class Vehicle {
    protected ArrayList<Wheel> wheels;
    public Vehicle()
    {
        wheels = new ArrayList<Wheel>();
    }
    public void setWheel(int count, float radius)
    {
        for (int i = 0; i < count; i++) {
            var wheel = new Wheel(radius);
            wheels.add(wheel);
        }
    }
    public int getWheelCount()
    {
        return wheels.size();
    }
}
