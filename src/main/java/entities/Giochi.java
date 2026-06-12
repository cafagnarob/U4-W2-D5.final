package entities;

import java.time.LocalDate;

public abstract class Giochi {
    private Long id;
    private String titolo;
    private LocalDate annoDiPubblicazione;
    private double prezzo;


    public Giochi(Long id, String titolo, LocalDate annoPubblicazione, double prezzo) {
        this.id = id;
        this.titolo = titolo;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.prezzo = prezzo;
    }


    public Long getId() {
        return id;
    }


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public LocalDate getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setAnnoDiPubblicazione(LocalDate annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    @Override
    public String toString() {
        return "Giochi{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                ", prezzo=" + prezzo +
                '}';
    }
}
