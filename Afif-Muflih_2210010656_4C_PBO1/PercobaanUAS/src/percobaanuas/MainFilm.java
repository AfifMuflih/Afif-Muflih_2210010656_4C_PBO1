
package percobaanuas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFilm {
    //13. array
    private static RentalFilm[] listfilm = new RentalFilm[3];
    private static int FilmCount = 0;
    // 12. I/O Sederhana
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // 11. perulangan
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Film");
            System.out.println("2. Tampilkan Hasil Film");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            // 10. seleksi
            int pilihan = getInputInt();
            switch (pilihan) {
                case 1:
                    tambahFilm();
                    break;
                case 2:
                    tampilkanFilm();
                    break;
                case 3:
                    System.out.println("Keluar...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void tambahFilm() {
        if (FilmCount >= listfilm.length) {
            System.out.println("Daftar Rental Film penuh. Tidak dapat menambahkan Film lagi.");
            return;
        }

        System.out.print("Masukkan jenis film (1. Film lokal, 2. Film luar): ");
        int jenis = getInputInt();
        
        

        System.out.print("Masukkan Judul Film : ");
        String Judul = scanner.next();

        System.out.print("Masukkan KodeFilm: ");
        int KodeFilm = getInputInt();

        System.out.print("Masukkan Batasan Umur (Semua Umur/Remaja/Dewasa): ");
        String BatasanUmur = scanner.next();

       RentalFilm Film;
    if (jenis == 1) {
     // 2. object
        Film = new RentalFilm(Judul, KodeFilm, BatasanUmur);
    } else if (jenis == 2) {
        boolean BatasanUsia;
        while (true) {
            System.out.print("Apakah Film memiliki batasan usia? (true/false): ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("true")) {
                BatasanUsia = true;
                break;
            } else if (input.equalsIgnoreCase("false")) {
                BatasanUsia = false;
                break;
            } else {
                System.out.println("Masukkan harus true atau false.");
            }
        }
        Film = new GenreFilm(Judul, KodeFilm,, BatasanUmur, BatasanUsia);
    } else {
        System.out.println("Jenis Film tidak valid.");
        return;
    }

    listfilm[FilmCount] = Film;
    FilmCount++;
    if (FilmCount == listfilm.length) {
        System.out.println("Sewa Film Melebihi batas. Tidak dapat menambahkan film lagi.");
    } else {
        System.out.println("Film berhasil ditambahkan.");
    }
}

    private static void tampilkanFilm() {
        if (FilmCount == 0) {
            System.out.println("Belum ada Film yang ditambahkan.");
        } else {
            for (int i = 0; i < FilmCount; i++) {
                System.out.println(listfilm[i]);
            }
        }
    }
    // 14. error handling
    private static int getInputInt() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka.");
            scanner.next(); // Clear the invalid input
            return -1;
        }
    }
}