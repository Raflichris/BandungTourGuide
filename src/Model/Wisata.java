package Model;

public class Wisata {
    private String namaWisata;
    private String alamatWisata;
    private String noTelpWisata;
    private int hargaWisata;
    private String jamOperasional;

    public Wisata(String namaWisata, String alamatWisata, String noTelpWisata, int hargaWisata, String jamOperasional) {
        this.namaWisata = namaWisata;
        this.alamatWisata = alamatWisata;
        this.noTelpWisata = noTelpWisata;
        this.hargaWisata = hargaWisata;
        this.jamOperasional = jamOperasional;
    }

    public String getNamaWisata() {
        return namaWisata;
    }

    public void setNamaWisata(String namaWisata) {
        this.namaWisata = namaWisata;
    }

    public String getAlamatWisata() {
        return alamatWisata;
    }

    public void setAlamatWisata(String alamatWisata) {
        this.alamatWisata = alamatWisata;
    }

    public String getNoTelpWisata() {
        return noTelpWisata;
    }

    public void setNoTelpWisata(String noTelpWisata) {
        this.noTelpWisata = noTelpWisata;
    }

    public int getHargaWisata() {
        return hargaWisata;
    }

    public void setHargaWisata(int hargaWisata) {
        this.hargaWisata = hargaWisata;
    }

    public String getJamOperasional() {
        return jamOperasional;
    }

    public void setJamOperasional(String jamOperasional) {
        this.jamOperasional = jamOperasional;
    }
}
