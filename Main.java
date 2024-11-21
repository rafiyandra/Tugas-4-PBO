package Tugas_4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input No Faktur
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            // Input Kode Barang
            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            // Input Nama Barang
            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            // Input Harga Barang
            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = Double.parseDouble(scanner.nextLine());

            // Jika harga barang <= 0, lemparkan exception
            if (hargaBarang <= 0) {
                throw new IllegalArgumentException("Harga barang tidak boleh nol atau negatif!");
            }

            // Input Jumlah Beli
            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = Integer.parseInt(scanner.nextLine());

            // Jika jumlah beli == 0, tampilkan pesan melalui System.out.println
            if (jumlahBeli == 0) {
                System.out.println("Jumlah beli tidak boleh nol!");
                return; // Menghentikan eksekusi lebih lanjut
            }

            // Jika jumlah beli < 0, lemparkan exception
            if (jumlahBeli < 0) {
                throw new IllegalArgumentException("Jumlah beli tidak boleh negatif!");
            }

            // Membuat objek transaksi
            Transaksi transaksi = new Transaksi(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Menghitung total
            transaksi.hitungTotal();

            // Menampilkan detail transaksi
            transaksi.tampilkanDetail();

        } catch (NumberFormatException e) {
            // Menampilkan pesan kesalahan input angka
            System.out.println("Input tidak valid! Pastikan memasukkan angka dengan benar.");
        } catch (IllegalArgumentException e) {
            // Menampilkan pesan kesalahan validasi
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (Exception e) {
            // Menampilkan pesan kesalahan tak terduga
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
