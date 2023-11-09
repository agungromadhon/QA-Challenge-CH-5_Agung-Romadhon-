// Class Motorcycle yang meng inherit attribute dan method dari Vehicle
public class Motorcycle extends Vehicle {
    // Attribute private untuk menyimpan informasi sepeda motor secara spesifik
    private int tankCapacity;
    private boolean engineStatus;

    // Constructor untuk memberikan initial value pada attribute
    public Motorcycle(int wheels, String color, double speed, int tankCapacity, boolean engineStatus) {
        // Memanggil constructor dari parent class
        super(wheels, color, speed);
        // Memberikan initial value pada attribute spesifik
        this.tankCapacity = tankCapacity;
        this
