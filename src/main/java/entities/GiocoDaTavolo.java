package entities;

import excemption.NumGiocatoriAcc;

import java.time.LocalDate;

public class GiocoDaTavolo extends Gioco {
    private int numeroGiocatori;
    private int durataMediaPartita;


    public GiocoDaTavolo(String titolo, LocalDate annoPubblicazione, double prezzo, int numeroGiocatori, int durataMediaPartita) {
        super(titolo, annoPubblicazione, prezzo);

        numeroDiGiocatoriAcc(numeroGiocatori);

        this.numeroGiocatori = numeroGiocatori;
        this.durataMediaPartita = durataMediaPartita;

    }

    public void numeroDiGiocatoriAcc(int numeroGiocatori) {
        if (numeroGiocatori < 2 || numeroGiocatori > 10) {
            throw new NumGiocatoriAcc("numero di giocatori non valido");
        }
    }

    public int getDurataMediaPartita() {
        return durataMediaPartita;
    }

    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }


    @Override
    public String toString() {
        return "GiochiDaTavolo{" + "\n" +
                "numeroGiocatori=" + numeroGiocatori + "\n" +
                ", durataMediaPartita=" + durataMediaPartita + "\n" +
                "} " + super.toString() + "\n";
    }
}
