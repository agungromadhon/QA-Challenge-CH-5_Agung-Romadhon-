// Class Vehicle untuk merepresentasikan model kendaraan secara general
public class Vehicle {
    // Attribute protected untuk menyimpan informasi kendaraan
    protected int wheels;
    protected String color;
    protected double speed;

    // Constructor untuk memberikan initial value pada attribute
    public Vehicle(int wheels, String color, double speed) {
        this.wheels = wheels;
        this.color = color;
        this.speed = speed;
    }

    // Getter dan setter untuk setiap attribute
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // Method untuk menampilkan informasi kendaraan
    public void showInfo() {
        System.out.println("Kendaraan ini memiliki " + wheels + " roda, berwarna " + color + ", dan dapat bergerak dengan kecepatan " + speed + " km/jam.");
    }

    // Method untuk menggerakkan kendaraan maju
    public void moveForward() {
        System.out.println("Kendaraan ini bergerak maju.");
    }

    // Method untuk menggerakkan kendaraan mundur
    public void moveBackward() {
        System.out.println("Kendaraan ini bergerak mundur.");
    }

    // Method untuk membelokkan kendaraan ke kiri
    public void turnLeft() {
        System.out.println("Kendaraan ini berbelok ke kiri.");
    }

    // Method untuk membelokkan kendaraan ke kanan
    public void turnRight() {
        System.out.println("Kendaraan ini berbelok ke kanan.");
    }
}
