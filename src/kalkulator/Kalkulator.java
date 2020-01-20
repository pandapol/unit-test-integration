package kalkulator;

public class Kalkulator {
    public Hasil pertambahan(int niali1, int nilai2) {

        return new Hasil((niali1 + nilai2), "BERHASIL");
    }

    public Hasil pengurangan(int nilai1, int nilai2) {
        return new Hasil((nilai1 - nilai2), "BERHASIL");
    }

    public Hasil perkalian(int nilai1, int nilai2) {
        return new Hasil((nilai1 * nilai2), "BERHASIL");
    }

    public Hasil pembagian(int nilai1, int nilai2) {
        if(nilai2 == 0){
            return new Hasil(-1, "ERROR: Tidak boleh di bagi 0"); //jika pembagian ada nilai yang dibagi 0
        }else{
            return new Hasil((nilai1 / nilai2), "BERHASIL");
        }
    }
}
