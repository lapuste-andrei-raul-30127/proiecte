package isp.lab6.exercise1;

public class SensorReading {
    private int value;
    private String location;
    private Type type;

    public SensorReading(int value, String location, Type type) {
        this.value = value;
        this.location = location;
        this.type = type;
    }

    public int getValue() {
        return this.value;
    }

    public String getLocation() {
        return this.location;
    }

    public Type getType() {
        return this.type;
    }
}
