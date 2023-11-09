import java.util.Scanner;

class Tugas1 {
  
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari user
        Scanner input = new Scanner(System.in);

        // Meminta user untuk memasukkan jumlah jam parkir
        System.out.print("Masukkan jumlah jam parkir: ");
        int jam = input.nextInt();

        // Memanggil method hitungBiaya untuk menghitung biaya parkir
        double biaya = hitungBiaya(jam);

        // Menampilkan biaya parkir yang harus dibayar
        System.out.println("Biaya parkir yang harus dibayar adalah: $" + biaya);
    }

    // Method untuk menghitung biaya parkir berdasarkan jumlah jam
    public static double hitungBiaya(int jam) {
        // Inisialisasi variabel biaya
        double biaya = 0;

        // Jika jam kurang dari atau sama dengan 5, biaya adalah $1
        if (jam <= 5) {
            biaya = 1;
        }
        // Jika jam lebih dari 5 dan kurang dari atau sama dengan 24, biaya adalah $1 ditambah $0.5 untuk setiap jam setelah 5 jam pertama
        else if (jam > 5 && jam <= 24) {
            biaya = 1 + (0.5 * (jam - 5));
        }
        // Jika jam lebih dari 24, biaya adalah $15 ditambah $0.5 untuk setiap jam setelah 24 jam pertama
        else {
            biaya = 15 + (0.5 * (jam - 24));
        }

        // Mengembalikan nilai biaya
        return biaya;
    }
}
