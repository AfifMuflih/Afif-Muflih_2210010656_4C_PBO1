
package percobaanuas;
//8. inheritance
public class GenreFilm extends RentalFilm {
    private boolean BatasanUsia;
    // 4. constructor
    public GenreFilm(String Judul, int KodeFilm, String BatasanUmur, boolean BatasanUsia) {
        super(Judul, KodeFilm, BatasanUmur);
        this.BatasanUsia= BatasanUsia;
    }
    
    // Getter untuk atribut BatasanUsia
    public boolean BatasanUsia() {
        return BatasanUsia;
    }
    // Setter untuk atribut BatasanUsia
    public void setBatasanUsia(boolean BatasanUsia) {
        this.BatasanUsia = BatasanUsia;
    }

    // 9. Polymorphism  // Override method toString untuk representasi String dari objek GenreFilm
    public String toString() {
        return "GenreFilm" +
                "Judul='" + getJudul() + '\'' +
                ", KodeFilm=" + getKodeFilm() + " Rent" +
                ", panjang=" + getBatasanUmur() + " boleh" +
                ", BatasanUsia=" + BatasanUsia +
                '}';
    } 
}
