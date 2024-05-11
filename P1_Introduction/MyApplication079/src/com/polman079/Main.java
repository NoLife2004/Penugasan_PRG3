package com.polman079;

public class Main {
    public static void main(String[] args) throws Exception {
        double hargaBarang1 = 150000.0;
        double hargaBarang2 = 200000.0;
        double totalHarga, pajak, hargaAkhir;

        totalHarga = hargaBarang1 + hargaBarang2;
        pajak = totalHarga * 0.1;
        hargaAkhir = totalHarga + pajak;
        System.out.println("Berikut rincian total belanja anda :\n");
        System.out.println("Harga Barang 1  : " + hargaBarang1);
        System.out.println("Harga Barang 2  : " + hargaBarang2);
        System.out.println("Total Harga     : " + totalHarga);
        System.out.println("Pajak           : " + pajak + "\n");

        System.out.println("Total belanja anda adalah : " + hargaAkhir);
        // System.out.println("Hello, World!");
    }
}
