# Proyek Akhir Pemrograman Berbasis Objek 1

Project percobaan aplikasi pengolahan data rental film menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa Judul, KodeFilm dan BatasanUmur serta BatasanUsia, dan memberikan output informasi detail dari rental film tersebut seperti  Judul, KodeFilm dan BatasanUmur, BatasanUsia.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** Class adalah pembagian atau pengelompkan bagian data pada project yang dikerjakan. Pada kode ini, `RentalFilm`, `MainFilm`, dan `GenreFilm` adalah contoh dari class.

```bash
public class RentalFilm {
    ...
}

public class MainFilm {
    ...
}

public class GenreFilm extends RentalFilm {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Film = new RentalFilm(Judul, KodeFilm, BatasanUmur);
Film = new GenreFilm(Judul, KodeFilm,, BatasanUmur, BatasanUsia);` bagian contoh dari object.

```bash
Film = new RentalFilm(Judul, KodeFilm, BatasanUmur);
Film = new GenreFilm(Judul, KodeFilm,, BatasanUmur, BatasanUsia);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `Judul` ,`KodeFilm`, `BatasanUmur` dan `BatasanUsia`  adalah contoh atribut.

```bash
    String Judul;
    int KodeFilm;
    String BatasanUmur;
    boolean BatasanUsia;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `RentalFilm` dan `GenreFilm`.

```bash
   public RentalFilm(String Judul, int KodeFilm, String BatasanUmur) {
        this.Judul = Judul;
        this.KodeFilm = KodeFilm;
        this.BatasanUmur = BatasanUmur;
    }

   public GenreFilm(String Judul, int KodeFilm, String BatasanUmur, boolean BatasanUsia) {
        super(Judul, KodeFilm, BatasanUmur);
        this.BatasanUsia= BatasanUsia;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setJudul`,`setKodeFilm`, `setBatasanUmur` adalah contoh method mutator.

```bash
    public void setJudul(String Judul) {
        this.Judul = Judul;
    }
    public void setKodeFilm(int KodeFilm) {
        this.KodeFilm = KodeFilm;
    }

    public void setBatasanUmur(String BatasanUmur) {
        this.BatasanUmur = BatasanUmur;
    }
   public void setBatasanUsia(boolean BatasanUsia) {
        this.BatasanUsia = BatasanUsia;
    }
    
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJudul`, `getKodeFilm`, `getBatasanUmur`, `getBatasanUsia` adalah contoh method accessor.

```bash
   public String getJudul() {
        return Judul;
    }

   public int getKodeFilm() {
        return KodeFilm;
    }

    public String getBatasanUmur() {
        return BatasanUmur;
    }

    public boolean BatasanUsia() {
        return BatasanUsia;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut`Judul` , `KodeFilm`, `BatasanUmur`, `BatasanUsia` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String Judul;
    private int KodeFilm;
    private String BatasanUmur;
    private boolean BatasanUsia;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `GenreFilm` mewarisi `RentalFilm` dengan sintaks `extends`.

```bash
public class GenreFilm extends RentalFilm {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `public String toString()` di `RentalFilm` merupakan overloading method `toString` di `GenreFilm`.

```bash
 public String toString() {
        return "Film{" +
                "Judul'" + Judul + '\'' +
                ", KodeFilm=" + KodeFilm + "Rent" +
                ", BatasanUmur=" + BatasanUmur + "boleh" +
                ", BatasanUsia=" + BatasanUsia +
                '}';
    }

@Override
public String toString() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` untuk membuat pilihan dan seleksi `if` untuk membuat pembatasan pada tambah kapal yang sesuai dengan array, seleksi `if else-if switch if else-if else else ` disini untuk menampilkan menu dan meminta input pengguna.

```bash
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
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` menampilkan menu ,meminta input dan menampilkan Apakah kapal pesiar memiliki fasilitas mewah .

```bash
while (true) {
    ...
}

while (true) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `MainFilm` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Masukkan Judul Film : ");
        String Judul = scanner.next();
String nama = scanner.next();
 System.out.print("Apakah Film memiliki batasan usia? (true/false): ");
            String input = scanner.next();
try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka.");
            scanner.next(); // Clear the invalid input
            return -1;
        }

System.out.print("Masukkan Judul Film : ");
System.out.print("Apakah Film memiliki batasan usia? (true/false): ");
System.out.println("Masukkan harus true atau false.");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `RentalFilm[] listfilm = new RentalFilm[3];` adalah contoh penggunaan array.

```bash
private static RentalFilm[] listfilm = new RentalFilm[3];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` dan `if else` langsung pada pembuatan object untuk menangani error.

```bash
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

try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka.");
            scanner.next(); // Clear the invalid input
            return -1;
        }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Afif Muflih
NPM: 2210010656
