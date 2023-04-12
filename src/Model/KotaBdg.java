package Model;

import java.util.ArrayList;

public class KotaBdg {
    private ArrayList<WisataAlam> wisataAlam = new ArrayList<>();
    private ArrayList<WisataNonAlam> wisataNonAlam = new ArrayList<>();
    private ArrayList<WisataKuliner> wistaKuliner = new ArrayList<>();

    public ArrayList<WisataAlam> getWisataAlam() {
        return wisataAlam;
    }

    public void setWisataAlam(ArrayList<WisataAlam> wisataAlam) {
        this.wisataAlam = wisataAlam;
    }

    public ArrayList<WisataNonAlam> getWisataNonAlam() {
        return wisataNonAlam;
    }

    public void setWisataNonAlam(ArrayList<WisataNonAlam> wisataNonAlam) {
        this.wisataNonAlam = wisataNonAlam;
    }

    public ArrayList<WisataKuliner> getWistaKuliner() {
        return wistaKuliner;
    }

    public void setWistaKuliner(ArrayList<WisataKuliner> wistaKuliner) {
        this.wistaKuliner = wistaKuliner;
    }
    
    
}
