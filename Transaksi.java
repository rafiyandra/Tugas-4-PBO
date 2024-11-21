package Tugas_4;

// Transaksi.java
public class Transaksi extends Barang {
    private String noFaktur;
    private int jumlahBeli;
    private double total;

    // Constructor
    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang);
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
        this.total = 0.0;
    }

    // Method untuk menghitung total
    public void hitungTotal() {
        total = hargaBarang * jumlahBeli;
    }

    // Method untuk menampilkan detail transaksi
    public void tampilkanDetail() {
        System.out.println("\n===== Detail Transaksi =====");
        System.out.println("No Faktur    : " + noFaktur);
        System.out.println("Kode Barang  : " + kodeBarang);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Barang : " + hargaBarang);
        System.out.println("Jumlah Beli  : " + jumlahBeli);
        System.out.println("Total Harga  : " + total);
    }
}

