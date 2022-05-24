package ceilingFanProgram;
/**
 * Write a description of class CeilingFan here.
 *
 * @author Harshilkumar Vaghela(3116318)
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;
    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location+" Ceiling fan is on high");
        // code to set fan to high
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location+" Ceiling fan is on medium");
        // code to set fan to medium
    }

    public void low() {
        speed = LOW;
        System.out.println(location+" Ceiling fan is on low");
        // code to set fan to low
    }

    public void off() {
        speed = OFF;
        System.out.println(location+" Ceiling fan is on off");
        // code to turn fan off
    }

    public int getSpeed() {
        return speed;
    }
}
