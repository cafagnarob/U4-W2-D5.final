package robertocafagna;

import entities.Collezione;
import entities.Gioco;
import entities.GiocoDaTavolo;
import entities.VideoGioco;
import entities.enums.Genere;
import entities.enums.Piattaforma;

import java.time.LocalDate;
import java.util.InputMismatchException;
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

        Collezione gameStop = new Collezione();

        gameStop.aggiuntaGioco(TickettoRide);
        gameStop.aggiuntaGioco(Scrabble);
        gameStop.aggiuntaGioco(Carcassonne);
        gameStop.aggiuntaGioco(Wonders);
        gameStop.aggiuntaGioco(ExplodingKittens);
        gameStop.aggiuntaGioco(Dixit);
        gameStop.aggiuntaGioco(Catan);
        gameStop.aggiuntaGioco(Risiko);
        gameStop.aggiuntaGioco(Monopoly);
        gameStop.aggiuntaGioco(LeagueofLegends);
        gameStop.aggiuntaGioco(ApexLegends);
        gameStop.aggiuntaGioco(FinalFantasyVIIRebirth);
        gameStop.aggiuntaGioco(Starfield);
        gameStop.aggiuntaGioco(DoomEternal);
        gameStop.aggiuntaGioco(ResidentEvil4Remake);
        gameStop.aggiuntaGioco(HaloInfinite);
        gameStop.aggiuntaGioco(TheLastofUsPartI);
        gameStop.aggiuntaGioco(GodofWarRagnarok);
        gameStop.aggiuntaGioco(Cyberpunk2077);
        gameStop.aggiuntaGioco(EldenRing);
        gameStop.aggiuntaGioco(Pandemic);
        gameStop.aggiuntaGioco(ForzaHorizon5);
        gameStop.aggiuntaGioco(ZeldaTearsoftheKingdom);
        gameStop.aggiuntaGioco(SuperMarioBrosWonder);
        gameStop.aggiuntaGioco(HadesII);


        System.out.println("-------- benvenuto a GAMESTOP------");
        boolean flag = true;
        while (flag) {

            System.out.println("**** SELEZIONA ****");
            System.out.println("1 per consultare la lista prodotti ");
            System.out.println("2 per aggiungere un gioco ");
            System.out.println("3 per cerca un gioco  per id ");
            System.out.println("4 per scegliere di vederi giochi sotto -X- prezzo");
            System.out.println("5 per scegliere i GIOCHI DA TAVOLO per numero di giocatori");
            System.out.println("6 per Rimuovare un gioco usando l'id");
            System.out.println("7 per aggiornare/sostituire un gioco");
            System.out.println("8 per stampare le statistiche ( numero totale di videogiochi, numero totale di giochi da tavolo, il gioco più costoso, la media prezzo del negozio)");
            System.out.println("0 per uscire");
            try {
                int scelta = Integer.parseInt(scanner.nextLine().trim());
                switch (scelta) {
                    case 0 -> {
                        System.out.println("-------CHIUSURA PROGRAMMA------");
                        flag = false;
                    }
                    case 1 -> {
                        System.out.println("------ LISTA PRODOTTI------");
                        System.out.println(gameStop);
                    }
                    case 2 -> {
                        boolean flag2 = true;
                        while (flag2) {
                            System.out.println("----SELEZIONA-----");
                            System.out.println("----1 per creare un videogioco-----");
                            System.out.println("----2 per creare un gioco da tavola-----");
                            System.out.println("----0 per uscire dalla creazione del gico-----");
                            int tipoDiGioco = Integer.parseInt(scanner.nextLine().trim());
                            switch (tipoDiGioco) {
                                case 1 -> {

                                    System.out.println("-----Inserisci il titolo-----");
                                    String titolo = scanner.nextLine().trim();
                                    System.out.println("-----Inserisco la data di oggi-----");
                                    LocalDate dataAttuale = LocalDate.now();
                                    double prezzo = 0;
                                    while (true) {
                                        try {
                                            System.out.println("-----Inserisci un prezzo-----");
                                            prezzo = Double.parseDouble(scanner.nextLine().trim());
                                            break;
                                        } catch (InputMismatchException e) {
                                            System.out.println("valore non valido");
                                            break;
                                        }
                                    }

                                    System.out.println("-----Inserisci la piattaforma -----");
                                    System.out.println("---- (disponibile solo PC, PS5, XBOX, NINTENDOSWITCH2 ------");
                                    Piattaforma piattaforma = Piattaforma.valueOf(scanner.nextLine());
                                    System.out.println("-----Inserisci durata del gioco-----");
                                    int durataDelGioco = Integer.parseInt(scanner.nextLine().trim());
                                    System.out.println("-----Inserisci genere-----");
                                    System.out.println("---- (disponibile solo \n " +
                                            "    ACTION,\n" +
                                            "    ADVENTURE,\n" +
                                            "    RPG,\n" +
                                            "    FPS,\n" +
                                            "    TPS,\n" +
                                            "    STRATEGY,\n" +
                                            "    SIMULATION,\n" +
                                            "    SPORTS,\n" +
                                            "    RACING,\n" +
                                            "    PUZZLE,\n" +
                                            "    HORROR,\n" +
                                            "    SURVIVAL,\n" +
                                            "    MMO,\n" +
                                            "    PLATFORM,\n" +
                                            "    FIGHTING ------");
                                    Genere genere = Genere.valueOf(scanner.nextLine().trim());


                                    Gioco nuovoGioco = new VideoGioco(titolo, dataAttuale, prezzo, piattaforma, durataDelGioco, genere);


                                    gameStop.aggiuntaGioco(nuovoGioco);
                                }


                                case 2 -> {
                                    try {


                                        System.out.println("-----Inserisci il titolo-----");
                                        String titolo = scanner.nextLine().trim();
                                        System.out.println("-----Inserisco la data di oggi-----");
                                        LocalDate dataAttuale = LocalDate.now();
                                        System.out.println("-----Inserisci un prezzo-----");
                                        double prezzo = Double.parseDouble(scanner.nextLine().trim());
                                        System.out.println("-----Inserisci la piattaforma -----");
                                        System.out.println("---- inserisci un numero da 2 a 10------");
                                        int numeroDiGiocatori = Integer.parseInt(scanner.nextLine());
                                        System.out.println("-----Inserisci durata media della partita-----");
                                        int durataMediaPartita = Integer.parseInt(scanner.nextLine().trim());

                                        Genere genere = Genere.valueOf(scanner.nextLine().trim());

                                        Gioco nuovoGioco = new GiocoDaTavolo(titolo, dataAttuale, prezzo, numeroDiGiocatori, durataMediaPartita);
                                        gameStop.aggiuntaGioco(nuovoGioco);
                                    } catch (RuntimeException e) {
                                        throw new RuntimeException("ERROR:" + e);
                                    }
                                }
                                case 0 -> {
                                    System.out.println("----- CHIUSURA CREAZIONE GIOCO------");
                                    flag = false;
                                }
                            }
                        }
                    }

                    case 3 -> {
                        System.out.println("***** inserisci l'id del gioco per crecarlo  *******");
                        Long idGiocoDaCercare = Long.valueOf(scanner.nextLine().trim());
                        gameStop.ricercaId(idGiocoDaCercare);

                    }
                    case 4 -> {
                        System.out.println("****** inserisci un prezzo massimo *******");
                        double prezzoMax = Double.parseDouble(scanner.nextLine().trim());
                        System.out.println(gameStop.listaPrezziSottoX(prezzoMax));

                    }
                    case 5 -> {
                        System.out.println("****** inserisci i numero di giocatori *******");
                        int numeroGiocatori = Integer.parseInt(scanner.nextLine().trim());
                        System.out.println(gameStop.listaPerNGiocatori(numeroGiocatori));

                    }
                    case 6 -> {
                        System.out.println(gameStop.getCollezione());
                        System.out.println("****** inserisci l'id del gico da rimuovere *******");
                        Long numeroId = Long.valueOf(scanner.nextLine().trim());
                        gameStop.rimuoviPerId(numeroId);
                        System.out.println("-----ELEMENTO RIMOSSO: " + " " + gameStop.ricercaId(numeroId) + "-------");
                        System.out.println("-----" + gameStop.getCollezione() + "----");
                    }
                    case 7 -> {
                        System.out.println("----- PRIMA CREIAMO UN NUOVO GIOCO------");
                        System.out.println("-----Inserisci il titolo-----");
                        String titolo = scanner.nextLine().trim();
                        System.out.println("-----Inserisco la data di oggi-----");
                        LocalDate dataAttuale = LocalDate.now();
                        System.out.println("-----Inserisci un prezzo-----");
                        double prezzo = Double.parseDouble(scanner.nextLine().trim());
                        System.out.println("-----Inserisci la piattaforma -----");
                        System.out.println("---- (disponibile solo PC, PS5, XBOX, NINTENDOSWITCH2 ------");
                        Piattaforma piattaforma = Piattaforma.valueOf(scanner.nextLine());
                        System.out.println("-----Inserisci durata del gioco-----");
                        int durataDelGioco = Integer.parseInt(scanner.nextLine().trim());
                        System.out.println("-----Inserisci genere-----");
                        System.out.println("---- (disponibile solo \n " +
                                "    ACTION,\n" +
                                "    ADVENTURE,\n" +
                                "    RPG,\n" +
                                "    FPS,\n" +
                                "    TPS,\n" +
                                "    STRATEGY,\n" +
                                "    SIMULATION,\n" +
                                "    SPORTS,\n" +
                                "    RACING,\n" +
                                "    PUZZLE,\n" +
                                "    HORROR,\n" +
                                "    SURVIVAL,\n" +
                                "    MMO,\n" +
                                "    PLATFORM,\n" +
                                "    FIGHTING ------");
                        Genere genere = Genere.valueOf(scanner.nextLine().trim());

                        Gioco nuovoGioco = new VideoGioco(titolo, dataAttuale, prezzo, piattaforma, durataDelGioco, genere);
                        System.out.println("-----SCEGLI IL NUMERO DELL GIOCO DA SOSTITUIRE-----");
                        for (int i = 0; i < gameStop.getCollezione().size(); i++) {
                            Gioco gioco = gameStop.getCollezione().get(i);

                            System.out.println(
                                    "Indice: " + (i + 1) +
                                            " - ID: " + gioco.getId() +
                                            " - Titolo: " + gioco.getTitolo()
                            );
                        }
                        int sceltaUtente = Integer.parseInt(scanner.nextLine());
                        int indiceLista = sceltaUtente - 1;

                        if (indiceLista >= 0 && indiceLista < gameStop.getCollezione().size()) {
                            Gioco giocoScelto = gameStop.getCollezione().get(indiceLista);
                            System.out.println("Hai scelto: " + giocoScelto.getTitolo());
                            gameStop.aggiornamentoPerId(giocoScelto.getId(), nuovoGioco);
                        } else {
                            System.out.println("Scelta non valida");
                        }


                    }
                    case 8 -> {
                        gameStop.statisticheDellaCollezione();
                    }

                }
            } catch (Exception e) {
                System.out.println("inserisci un valore valido");
            }
        }


    }
}
