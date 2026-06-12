package entities;

import java.util.*;

public class Collezione {

    private List<Gioco> collezione;

    public Collezione() {
        this.collezione = new ArrayList<>();
    }


    public List<Gioco> getCollezione() {
        return collezione;
    }

    //esercizio 1
    public void aggiuntaGioco(Gioco gioco) {
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
    public Gioco ricercaId(Long id) {
        Optional<Gioco> giocoperID = collezione.stream()
                .filter(gioco -> gioco.getId().equals(id))
                .findFirst();


        if (giocoperID.isPresent()) {
            System.out.println("GIOCO SELEZIONATO: " + " " + giocoperID);
            Gioco trovato = giocoperID.get();
            return trovato;
        } else {
            System.out.println("NESSUN GIOCO TROVATO");
            return null;
        }

    }

    //esercizio 3

    public List<Gioco> listaPrezziSottoX(double prezzo) {
        List<Gioco> risultati = collezione.stream()
                .filter(gioco -> gioco.getPrezzo() < prezzo)
                .toList();

        System.out.println("Trovati: " + risultati.size());

        return risultati;
    }

    //esercizio 4
    public List<GiocoDaTavolo> listaPerNGiocatori(int numeroGiocatori) {
        return collezione.stream()
                .filter(gioco -> gioco instanceof GiocoDaTavolo)
                .map(gioco -> (GiocoDaTavolo) gioco)
                .filter(giochiDaTavolo -> giochiDaTavolo.getNumeroGiocatori() == numeroGiocatori)
                .toList();
    }

    //esercizio 5

    public void rimuoviPerId(Long id) {
        Gioco giocoDaRimuovere = ricercaId(id);
        collezione.remove(giocoDaRimuovere);
    }


    //esercizio 6
    public void aggiornamentoPerId(Long id, Gioco nuovoGioco) {
        Gioco giocoDaAggiornare = ricercaId(id);
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
                    .filter(gioco -> gioco instanceof VideoGioco).count();

            System.out.println("------VIDEOGIOCHI TOTALI:" + " " + lunghezzaVideogiochi + "---------");


            Long lunghezzaGiochiDaTavola = collezione.stream()
                    .filter(gioco -> gioco instanceof GiocoDaTavolo).count();

            System.out.println("------VIDEOGIOCHI TOTALI:" + " " + lunghezzaGiochiDaTavola + "---------");

            Optional<Gioco> giocoPrezzoPiuAlto = collezione.stream()
                    .max(Comparator.comparingDouble(Gioco::getPrezzo));

            if (giocoPrezzoPiuAlto.isPresent()) {
                System.out.println("IL GIOCO PIU COSTOSO E':" + " " + giocoPrezzoPiuAlto);
            } else {
                System.out.println("nessun dato a disposizione");
            }

            OptionalDouble mediaPrezziTot = collezione.stream().mapToDouble(Gioco::getPrezzo).average();

            if (mediaPrezziTot.isPresent()) {
                System.out.println("MEDIA PREZZO TOTALE:" + " " + mediaPrezziTot);
            } else {
                System.out.println("non è stato possibile calcolare la media");
            }

        }

    }


    @Override
    public String toString() {
        return "Collezione{" +
                "collezione=" + collezione +
                '}';
    }
}
