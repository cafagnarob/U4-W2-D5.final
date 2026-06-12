package entities;

import java.time.LocalDate;

public class GiochiDaTavolo extends Giochi {
    private int numeroGiocatori;
    private int durataMediaPartita;


    public GiochiDaTavolo(Long id, String titolo, LocalDate annoPubblicazione, double prezzo, int numeroGiocatori, int durataMediaPartita) {
        super(id, titolo, annoPubblicazione, prezzo);

        this.numeroGiocatori = numeroGiocatori;
        this.durataMediaPartita = durataMediaPartita;

    }

    public int getDurataMediaPartita() {
        return durataMediaPartita;
    }

    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }

    @Override
    public String toString() {
        return "GiochiDaTavolo{" +
                "numeroGiocatori=" + numeroGiocatori +
                ", durataMediaPartita=" + durataMediaPartita +
                "} " + super.toString();
    }
}
