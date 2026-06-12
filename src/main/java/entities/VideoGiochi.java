package entities;

import entities.enums.Genere;

import java.time.LocalDate;

public class VideoGiochi extends Giochi {
    private String piattaforma;
    private int durataGioco;
    private Genere genere;


    public VideoGiochi(Long id, String titolo, LocalDate annoDiPubblicazione, double prezzo, String piattaforma, int durataGioco, Genere genere) {
        super(id, titolo, annoDiPubblicazione, prezzo);
        this.piattaforma = piattaforma;
        this.durataGioco = durataGioco;
        this.genere = genere;
    }

    public Genere getGenere() {
        return genere;
    }

    public int getDurataGioco() {
        return durataGioco;
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    @Override
    public String toString() {
        return "VideoGiochi{" +
                "piattaforma='" + piattaforma + '\'' +
                ", durataGioco=" + durataGioco +
                ", genere=" + genere +
                "} " + super.toString();
    }
}
