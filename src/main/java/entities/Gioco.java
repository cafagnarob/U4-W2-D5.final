package entities;

import java.time.LocalDate;

public abstract class Gioco {
    // counter generazione ID
    private static Long counter = 1L;
    //ATTRIBUTI
    private Long id;
    private String titolo;
    private LocalDate annoDiPubblicazione;
    private double prezzo;

    //COSTRUTTORE
    public Gioco(String titolo, LocalDate annoDiPubblicazione, double prezzo) {
        this.id = counter++;
        this.titolo = titolo;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.prezzo = prezzo;
    }

    //METODI
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "id=" + id + "\n" +
                ", titolo='" + titolo + '\'' + "\n" +
                ", annoDiPubblicazione=" + annoDiPubblicazione + "\n" +
                ", prezzo=" + prezzo + "\n" +
                '}' + "\n";
    }
}
