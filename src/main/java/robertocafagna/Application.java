package robertocafagna;

import entities.Collezione;
import entities.Gioco;

import entities.GiocoDaTavolo;
import entities.VideoGioco;
import entities.enums.Genere;
import entities.enums.Piattaforma;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


// --- VIDEOGIOCHI  ---
        Gioco EldenRing = (new VideoGioco("Elden Ring", LocalDate.of(2022, 2, 25), 59.99, Piattaforma.PC, 80, Genere.RPG));
        Gioco Cyberpunk2077 = (new VideoGioco("Cyberpunk 2077", LocalDate.of(2020, 12, 10), 49.99, Piattaforma.PC, 40, Genere.RPG));
        Gioco GodofWarRagnarok = (new VideoGioco("God of War Ragnarok", LocalDate.of(2022, 11, 9), 69.99, Piattaforma.PS5, 35, Genere.ACTION));
        Gioco TheLastofUsPartI = (new VideoGioco("The Last of Us Part I", LocalDate.of(2022, 9, 2), 69.99, Piattaforma.PS5, 15, Genere.ADVENTURE));
        Gioco HaloInfinite = (new VideoGioco("Halo Infinite", LocalDate.of(2021, 12, 8), 59.99, Piattaforma.XBOX, 20, Genere.FPS));
        Gioco ForzaHorizon5 = (new VideoGioco("Forza Horizon 5", LocalDate.of(2021, 11, 9), 59.99, Piattaforma.XBOX, 30, Genere.RACING));
        Gioco ZeldaTearsoftheKingdom = (new VideoGioco("Zelda: Tears of the Kingdom", LocalDate.of(2023, 5, 12), 69.99, Piattaforma.NINTENDOSWITCH2, 70, Genere.ADVENTURE));
        Gioco SuperMarioBrosWonder = (new VideoGioco("Super Mario Bros. Wonder", LocalDate.of(2023, 10, 20), 59.99, Piattaforma.NINTENDOSWITCH2, 12, Genere.ADVENTURE));
        Gioco HadesII = (new VideoGioco("Hades II", LocalDate.of(2024, 5, 6), 29.99, Piattaforma.PC, 50, Genere.RPG));
        Gioco ResidentEvil4Remake = (new VideoGioco("Resident Evil 4 Remake", LocalDate.of(2023, 3, 24), 59.99, Piattaforma.PS5, 16, Genere.HORROR));

        Gioco DoomEternal = (new VideoGioco("Doom Eternal", LocalDate.of(2020, 3, 20), 39.99, Piattaforma.PC, 15, Genere.FPS));
        Gioco Starfield = (new VideoGioco("Starfield", LocalDate.of(2023, 9, 6), 69.99, Piattaforma.XBOX, 60, Genere.RPG));
        Gioco FinalFantasyVIIRebirth = (new VideoGioco("Final Fantasy VII Rebirth", LocalDate.of(2024, 2, 29), 79.99, Piattaforma.PS5, 90, Genere.RPG));
        Gioco ApexLegends = (new VideoGioco("Apex Legends", LocalDate.of(2019, 2, 4), 0.00, Piattaforma.PC, 500, Genere.FPS));
        Gioco LeagueofLegends = (new VideoGioco("League of Legends", LocalDate.of(2009, 10, 27), 0.00, Piattaforma.PC, 1000, Genere.MMO));

// --- GIOCHI DA TAVOLO  ---

        Gioco Monopoly = (new GiocoDaTavolo("Monopoly", LocalDate.of(1935, 2, 6), 24.99, 5, 120));
        Gioco Risiko = (new GiocoDaTavolo("Risiko!", LocalDate.of(1957, 10, 15), 34.99, 6, 180));
        Gioco Catan = (new GiocoDaTavolo("Catan", LocalDate.of(1995, 4, 19), 42.00, 3, 90));
        Gioco Carcassonne = (new GiocoDaTavolo("Carcassonne", LocalDate.of(2000, 10, 1), 29.99, 5, 45));
        Gioco TickettoRide = (new GiocoDaTavolo("Ticket to Ride", LocalDate.of(2004, 3, 1), 44.99, 2, 60));
        Gioco Dixit = (new GiocoDaTavolo("Dixit", LocalDate.of(2008, 12, 1), 29.99, 10, 30));
        Gioco ExplodingKittens = (new GiocoDaTavolo("Exploding Kittens", LocalDate.of(2015, 7, 1), 19.99, 4, 15));
        Gioco Wonders = (new GiocoDaTavolo("7 Wonders", LocalDate.of(2010, 10, 1), 45.00, 10, 45));
        Gioco Pandemic = (new GiocoDaTavolo("Pandemic", LocalDate.of(2008, 1, 1), 39.99, 10, 60));
        Gioco Scrabble = (new GiocoDaTavolo("Scrabble", LocalDate.of(1948, 12, 1), 22.50, 4, 90));

        List<Gioco> gameStop = new ArrayList<>(List.of(TickettoRide, ResidentEvil4Remake, DoomEternal, Starfield, FinalFantasyVIIRebirth, ApexLegends, LeagueofLegends,
                Monopoly, Risiko, Catan, Dixit, ExplodingKittens, Wonders, Carcassonne, Scrabble, Pandemic, EldenRing, Cyberpunk2077, GodofWarRagnarok, TheLastofUsPartI,
                HaloInfinite, ForzaHorizon5, ZeldaTearsoftheKingdom, SuperMarioBrosWonder, HadesII));

        Collezione carello = new Collezione();


        System.out.println("-------- benvenuto a GAMESTOP------");
        while (true) {
            System.out.println("------ LISTA PRODOTTI------");
            System.out.println(gameStop);
            System.out.println("-------KAREN: come posso aiutarti? :) -------");

            System.out.println("------ TU: salve vorrei...------ ");
            System.out.println("**** SELEZIONA ****");
            System.out.println("1 per consultare la lista prodotti ");
            System.out.println("2 per aggiungere un gioco al tuo carrello");
            System.out.println("3 per cerca un gioco nella tuo carrello per id ");
            System.out.println("4 per scegliere di vederi giochi sotto -X- prezzo");
            System.out.println("5 per scegliere i GIOCHI DA TAVOLO per numero di giocatori");
            System.out.println("6 per Rimuovare un gioco dal carrello usando l'id");
            System.out.println("7 per aggiornare/sostituire un gioco del tuo carrello");
            System.out.println("8 per stampare le statistiche del negozio ( numero totale di videogiochi, numero totale di giochi da tavolo, il gioco più costoso, la media prezzo del negozio)");
            System.out.println("0 per uscire dal negozio");
            int scelta = Integer.parseInt(scanner.nextLine());

            switch (scelta) {
                case 0 -> System.out.println("------- KAREN: Grazie e arrivederci :)------");
                case 1 -> System.out.println(gameStop);
                case 2 -> {
                    System.out.println("------KAREN: segli quale gioco vuoi aggiungere...-------");
                    System.out.println("------TU: vorrei....--------");
                    String titoloGiocoSelezionato = scanner.nextLine();
                    Optional<Gioco> giocoDaAggiungere = gameStop.stream()
                            .filter(gioco -> gioco.getTitolo().equals(titoloGiocoSelezionato))
                            .findFirst();
                    if (giocoDaAggiungere.isPresent()) {

                        carello.aggiuntaGioco(giocoDaAggiungere.get());
                    } else {
                        System.out.println("gioco non trovato");
                    }
                }
            }
        }


    }
}
