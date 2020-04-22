package oop;

import java.util.*;
/**
 *
 * @author WIN10
 */
public class Aplikasi {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Aplikasi app = new Aplikasi();
        while(true) {
            app.printMenu();
            int pilihan = sc.nextInt();
            switch(pilihan) {
                case 1:
                    System.out.println("Formulir Tambah Data");
                    app.addData();
                    break;
                case 2:
                    System.out.println("Formulir Ubah Data");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("Formulir Hapus Data");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("Daftar Data");
                    app.listData();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Urutan data yang dihapus: "); int idx = Integer.parseInt(sc.nextLine());
        // proses hapus data
        Operasi.removeData(idx-1);
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Urutan data yang diubah: "); int idx = Integer.parseInt(sc.nextLine());
        System.out.println("--------------------------");
        System.out.print("Nama : "); String nama = sc.nextLine();
        System.out.print("Nim : "); String nim = sc.nextLine();
        System.out.print("Prodi : "); String prodi = sc.nextLine();
        System.out.print("Alamat : "); String alamat = sc.nextLine();
        // proses ubah data
        Operasi.editData(new Data(nama, nim, prodi, alamat), idx-1);
    }

    public void listData() {
        // proses tampilkan data
        List<Data> result = Operasi.getListData();
        for(int i=0; i<result.size(); i++) {
            System.out.println();
            System.out.println("Data ke-" + (i+1));
            System.out.println("  Nama : " + result.get(i).getNama());
            System.out.println("  Nim : " + result.get(i).getNim());
            System.out.println("  Prodi : " + result.get(i).getProdi());
            System.out.println("  Alamat : " + result.get(i).getAlamat());
        }
    }

    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Nama : "); String nama = sc.nextLine();
        System.out.print("Nim : "); String nim = sc.nextLine();
        System.out.print("Prodi : "); String prodi = sc.nextLine();
        System.out.print("Alamat : "); String alamat = sc.nextLine();
        // proses tambah data
        Operasi.addData(new Data(nama, nim, prodi, alamat));
    }

    public void printMenu() {
        System.out.println("---------------------------------");
        System.out.println("Aplikasi Perekaman Data Mahasiswa");
        System.out.println("---------------------------------");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan: ");
    }


}
