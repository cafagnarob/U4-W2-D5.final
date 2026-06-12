package entities;

import java.util.*;

public class Collezione {

    private List<Giochi> collezione;

    public Collezione() {
        this.collezione = new ArrayList<>();
    }


    public List<Giochi> getCollezione() {
        return collezione;
    }

    //esercizio 1
    public void aggiuntaGioco(Giochi gioco) {
        try {
            boolean checkID = collezione.stream().anyMatch(g -> g.getId().equals(gioco.getId()));
            if (checkID) {
                throw new Exception("Gioco gia aggiunto");
            } else {
                collezione.add(gioco);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    //esercizio 2
    public Giochi ricercaId(Long id) {
        Optional<Giochi> giocoperID = collezione.stream()
                .filter(giochi -> giochi.getId().equals(id))
                .findFirst();


        if (giocoperID.isPresent()) {
            System.out.println("GIOCO SELEZIONATO: " + " " + giocoperID);
            Giochi trovato = giocoperID.get();
            return trovato;
        } else {
            System.out.println("NESSUN GIOCO TROVATO");
            return null;
        }

    }

    //esercizio 3

    public List<Giochi> listaPrezziSottoX(double prezzo) {
        List<Giochi> risultati = collezione.stream()
                .filter(giochi -> giochi.getPrezzo() < prezzo)
                .toList();

        System.out.println("Trovati: " + risultati.size());

        return risultati;
    }

    //esercizio 4
    public List<GiochiDaTavolo> listaPerNGiocatori(int numeroGiocatori) {
        return collezione.stream()
                .filter(giochi -> giochi instanceof GiochiDaTavolo)
                .map(giochi -> (GiochiDaTavolo) giochi)
                .filter(giochiDaTavolo -> giochiDaTavolo.getNumeroGiocatori() == numeroGiocatori)
                .toList();
    }

    //esercizio 5

    public void rimuoviPerId(Long id) {
        Giochi giocoDaRimuovere = ricercaId(id);
        collezione.remove(giocoDaRimuovere);
    }


    //esercizio 6
    public void aggiornamentoPerId(Long id, Giochi nuovoGioco) {
        Giochi giocoDaAggiornare = ricercaId(id);
        int indexGiocoDaAggiornare = collezione.indexOf(giocoDaAggiornare);

        nuovoGioco.setId(id);
        collezione.set(indexGiocoDaAggiornare, nuovoGioco);

    }

    //esercizio 7
    public void statisticheDellaCollezione() {
        if (collezione.isEmpty()) {
            System.out.println("collezione vuota");
        } else {

            System.out.println("--------STATISTICHE--------");
            Long lunghezzaVideogiochi = collezione.stream()
                    .filter(giochi -> giochi instanceof VideoGiochi).count();

            System.out.println("------VIDEOGIOCHI TOTALI:" + " " + lunghezzaVideogiochi + "---------");


            Long lunghezzaGiochiDaTavola = collezione.stream()
                    .filter(giochi -> giochi instanceof GiochiDaTavolo).count();

            System.out.println("------VIDEOGIOCHI TOTALI:" + " " + lunghezzaGiochiDaTavola + "---------");

            Optional<Giochi> giocoPrezzoPiuAlto = collezione.stream()
                    .max(Comparator.comparingDouble(Giochi::getPrezzo));

            if (giocoPrezzoPiuAlto.isPresent()) {
                System.out.println("IL GIOCO PIU COSTOSO E':" + " " + giocoPrezzoPiuAlto);
            } else {
                System.out.println("nessun dato a disposizione");
            }

            OptionalDouble mediaPrezziTot = collezione.stream().mapToDouble(Giochi::getPrezzo).average();

            if (mediaPrezziTot.isPresent()) {
                System.out.println("MEDIA PREZZO TOTALE:" + " " + mediaPrezziTot);
            } else {
                System.out.println("non è stato possibile calcolare la media");
            }

        }

    }

}
