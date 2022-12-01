package ObjectOrientedDesign.Components;

public class Wheel {
    private float wheelRadius;
    private String wheelType;
    public Wheel()
    {
        wheelRadius = 0.0f;
        wheelType = "Tubeless";
    }
    public Wheel(float radius)
    {
        wheelRadius = radius;
        wheelType = "Tubeless";
    }
    public void setWheelRadius(float wheelRadius) {
        this.wheelRadius = wheelRadius;
    }
    public float getWheelRadius() {
        return wheelRadius;
    }
    public String getWheelType() {
        return wheelType;
    }
}
