import java.util.Scanner;

// Kelas induk
class Faktur {
    protected String noFaktur;
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;
    protected int jumlahBeli;

    public Faktur(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        this.noFaktur = noFaktur;
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBeli = jumlahBeli;
    }
}

// Kelas turunan
class HitungFaktur extends Faktur {

    public HitungFaktur(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);
    }

    // Metode untuk menghitung total harga
    public double hitungTotal() {
        return hargaBarang * jumlahBeli;
    }
}

// Kelas utama
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("=== Input Data Faktur ===");
            System.out.print("Masukkan Nomor Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Membuat objek dari kelas HitungFaktur
            HitungFaktur faktur = new HitungFaktur(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Menghitung total harga
            double total = faktur.hitungTotal();

            // Menampilkan data faktur
            System.out.println("\n=== Faktur ===");
            System.out.println("No Faktur   : " + faktur.noFaktur);
            System.out.println("Kode Barang : " + faktur.kodeBarang);
            System.out.println("Nama Barang : " + faktur.namaBarang);
            System.out.println("Harga Barang: Rp" + faktur.hargaBarang);
            System.out.println("Jumlah Beli : " + faktur.jumlahBeli);
            System.out.println("Total Harga : Rp" + total);

        } catch (Exception e) {
            System.out.println("\n[Error] Input tidak valid! Pastikan harga dan jumlah beli berupa angka.");
        } finally {
            scanner.close();
        }
    }
}
