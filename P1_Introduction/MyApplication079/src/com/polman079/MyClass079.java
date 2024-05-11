package com.polman079;

import java.util.Scanner;

public class MyClass079 {
    public static void main(String[] args) throws Exception {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nSilahkan Pilih Fungsi yang ingin ditampilkan :>");
            System.out.print("1. Fungsi 1\n2. Fungsi 2\n3. Fungsi 3\n4. Hitung Balok\n0. Exit\n");            
            System.out.print("Pilihan: ");
            num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1:
                    fungsi();
                    break;
                case 2:
                    fungsi2();
                    break;
                case 3:
                    fungsi3();
                    break;
                case 4:
                    HitungBalok();
                    break;
                case 0:
                    num = -1;
                    break;
            }
        } while (num != -1);
    }

    public static void fungsi() {
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
    }

    public static void fungsi2() {
        double hargaBarang1, hargaBarang2, totalHarga, pajak, hargaAkhir;

        Scanner scan = new Scanner(System.in);
        System.out.print("Harga Barang 1: ");
        hargaBarang1 = Double.parseDouble(scan.nextLine());

        System.out.print("Harga Barang 2: ");
        hargaBarang2 = Double.parseDouble(scan.nextLine());

        totalHarga = hargaBarang1 + hargaBarang2;
        pajak = totalHarga * 0.1;
        hargaAkhir = totalHarga + pajak;
        System.out.println("Berikut rincian total belanja anda :\n");
        System.out.println("Harga Barang 1  : " + hargaBarang1);
        System.out.println("Harga Barang 2  : " + hargaBarang2);
        System.out.println("Total Harga     : " + totalHarga);
        System.out.println("Pajak           : " + pajak + "\n");

        System.out.println("Total belanja anda adalah : " + hargaAkhir);
    }

    public static void fungsi3() {
        int nim, umur, thn;
        String nama, prodi, email, alamat, nomorTelp;

        System.out.println("Pendataan Mahasiswa Politeknik Astra\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("NIM           : ");
        nim = scan.nextInt();
        scan.nextLine();
        System.out.print("Nama          : ");
        nama = scan.nextLine();
        System.out.print("Prodi         : ");
        prodi = scan.nextLine();
        System.out.print("Umur          : ");
        umur = scan.nextInt();
        System.out.print("Tahun Masuk   : ");
        thn = scan.nextInt();
        scan.nextLine();
        System.out.print("Email Address : ");
        email = scan.nextLine();
        System.out.print("Alamat        : ");
        alamat = scan.nextLine();
        System.out.print("Nomor Telepon : ");
        nomorTelp = scan.nextLine();


        System.out.println("\nBerikut adalah data diri anda\n");
        System.out.println("NIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Prodi         : " + prodi);
        System.out.println("Umur          : " + umur);
        System.out.println("Tahun Masuk   : " + thn);
        System.out.println("Email Address : " + email);
        System.out.println("Alamat        : " + alamat);
        System.out.println("Nomor Telepon : " + nomorTelp);
    }

    public static void HitungBalok() {
        double panjang, lebar, tinggi;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Panjang Balok (cm) : ");
        panjang = scanner.nextDouble();
        System.out.print("Lebar Balok (cm) : ");
        lebar = scanner.nextDouble();
        System.out.print("Tinggi Balok (cm) : ");
        tinggi = scanner.nextDouble();

        System.out.print("\nBerikut hasil perhitungan luas dan volume balok\n");
        System.out.println("Luas Balok : " + (2 * (panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)) + " cm^2");
        System.out.print("Volume Balok : " + (panjang * lebar * tinggi) + " cm^3" + "\n");
    }
}
