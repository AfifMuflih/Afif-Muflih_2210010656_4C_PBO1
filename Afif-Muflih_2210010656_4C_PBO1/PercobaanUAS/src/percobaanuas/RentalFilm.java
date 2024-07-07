
package percobaanuas;

// 1. class
public class RentalFilm {
    // 3. atribut
    // 7. Encapsulation 
    private String Judul;
    private int KodeFilm;
    private String BatasanUmur;
     // 4. constructor   
    public RentalFilm(String Judul, int KodeFilm, String BatasanUmur) {
        this.Judul = Judul;
        this.KodeFilm = KodeFilm;
        this.BatasanUmur = BatasanUmur;
    }
    // 6. accessor
    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public int getKodeFilm() {
        return KodeFilm;
    }
    // 5. mutator
    public void setKodeFilm(int KodeFilm) {
        this.KodeFilm = KodeFilm;
    }

    public String getBatasanUmur() {
        return BatasanUmur;
    }

    public void setBatasanUmur(String BatasanUmur) {
        this.BatasanUmur = BatasanUmur;
    }

    // 9.Polymorphism @Override
    public String toString() {
        return "Film{" +
                "Judul'" + Judul + '\'' +
                ", KodeFilm=" + KodeFilm + "Rent" +
                ", BatasanUmur=" + BatasanUmur + "boleh" +
                '}';
    }
}