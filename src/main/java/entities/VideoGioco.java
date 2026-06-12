package entities;

import entities.enums.Genere;
import entities.enums.Piattaforma;

import java.time.LocalDate;

public class VideoGioco extends Gioco {
    private Piattaforma piattaforma;
    private int durataGioco;
    private Genere genere;


    public VideoGioco(String titolo, LocalDate annoDiPubblicazione, double prezzo, Piattaforma piattaforma, int durataGioco, Genere genere) {
        super(titolo, annoDiPubblicazione, prezzo);
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

    public Piattaforma getPiattaforma() {
        return piattaforma;
    }

    @Override
    public String toString() {
        return "VideoGiochi{" + "\n" +
                "piattaforma='" + piattaforma + '\'' + "\n" +
                ", durataGioco=" + durataGioco + "\n" +
                ", genere=" + genere + "\n" +
                "} " + super.toString() + "\n";
    }
}
