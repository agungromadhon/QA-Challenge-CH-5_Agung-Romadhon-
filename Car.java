// Class Car yang meng inherit attribute dan method dari Vehicle
public class Car extends Vehicle {
    // Attribute private untuk menyimpan informasi mobil secara spesifik
    private int tankCapacity;
    private int transmission;
    private boolean engineStatus;

    // Constructor untuk memberikan initial value pada attribute
    public Car(int wheels, String color, double speed, int tankCapacity, int transmission, boolean engineStatus) {
        // Memanggil constructor dari parent class
        super(wheels, color, speed);
        // Memberikan initial value pada attribute spesifik
        this.tankCapacity = tankCapacity;
        this.transmission = transmission;
        this.engineStatus = engineStatus;
    }

    // Getter dan setter untuk setiap attribute
    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public int getTransmission() {
        return transmission;
    }

    public void setTransmission(int transmission) {
        this.transmission = transmission;
    }

    public boolean isEngineStatus() {
        return engineStatus;
    }

    public void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }

    // Method untuk menampilkan informasi mobil
    @Override
    public void showInfo() {
        // Memanggil method dari parent class
        super.showInfo();
        // Menambahkan informasi spesifik
        System.out.println("Mobil ini memiliki kapasitas tangki " + tankCapacity + " liter, transmisi " + transmission + ", dan status mesin " + engineStatus + ".");
    }

    // Method untuk menyalakan mesin mobil
    public void startEngine() {
        // Mengecek apakah mesin sudah menyala atau belum
        if (engineStatus) {
            // Menampilkan pesan error
            System.out.println("Mesin sudah menyala.");
        }
        else {
            // Mengubah status mesin menjadi true
            engineStatus = true;
            // Menampilkan pesan konfirmasi
            System.out.println("Mesin dinyalakan.");
        }
    }

    // Method untuk mematikan mesin mobil
    public void stopEngine() {
        // Mengecek apakah mesin sudah mati atau belum
        if (!engineStatus) {
            // Menampilkan pesan error
            System.out.println("Mesin sudah mati.");
        }
        else {
            // Mengubah status mesin menjadi false
            engineStatus = false;
            // Menampilkan pesan konfirmasi
            System.out.println("Mesin dimatikan.");
        }
    }

    // Method untuk mengganti transmisi mobil
    public void changeTransmission(int newTransmission) {
        // Mengecek apakah transmisi baru valid atau tidak
        if (newTransmission < 0 || newTransmission > 6) {
            // Menampilkan pesan error
            System.out.println("Transmisi tidak valid.");
        } else {
            // Mengubah transmisi dengan nilai baru
            setTransmission(newTransmission);
            // Menampilkan pesan konfirmasi
            System.out.println("Transmisi diganti menjadi " + newTransmission + ".");
        }
    }
}
