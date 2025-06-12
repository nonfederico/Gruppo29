package Carta;

import java.util.*;

public class Pianeti extends Carte {

    private static class Pianeta {
        public String nome;
        public List<String> merciDisponibili; // es: ["rosso", "giallo"]
        public int giorniVolo;
        public Giocatore occupatoDa; // solo un giocatore per pianeta

        public Pianeta(String nome, List<String> merci, int giorni) {
            this.nome = nome;
            this.merciDisponibili = new ArrayList<>(merci);
            this.giorniVolo = giorni;
            this.occupatoDa = null;
        }

        public boolean libero() {
            return occupatoDa == null;
        }
    }

    private List<Pianeta> pianeti;

    public Pianeti() {
        pianeti = new ArrayList<>();
        // es: inizializzazione base con 3 pianeti
        pianeti.add(new Pianeta("Tnome", Arrays.asList("rosso", "giallo"), 2));
        pianeti.add(new Pianeta("nome", Arrays.asList("blu", "blu"), 3));
        pianeti.add(new Pianeta("nome", Arrays.asList("giallo", "giallo", "rosso"), 4));
    }

    // Fase di atterraggio: ogni giocatore decide se atterrare
    public void atterraggio(List<Giocatore> giocatoriInOrdine) {
        for (Giocatore g : giocatoriInOrdine) {
            Pianeta scelto = scegliPianetaDisponibile(g);
            if (scelto != null) {
                scelto.occupatoDa = g;
                g.perdiGiorniVolo(scelto.giorniVolo);
                System.out.println(g.getNome() + " atterra su " + scelto.nome + " e perde " + scelto.giorniVolo + " giorni");
                caricaMerci(g, scelto.merciDisponibili);
            } else {
                System.out.println(g.getNome() + " non atterra su nessun pianeta");
            }
        }
    }

    // Metodo per caricare merci su una nave
    private void caricaMerci(Giocatore g, List<String> merci) {
        for (String tipo : merci) {
            boolean caricata = g.getNave().caricaMerce(tipo);
            if (!caricata) {
                System.out.println("Merce " + tipo + " scartata per mancanza di spazio");
            }
        }
    }

    // Scelta del pianeta da parte del giocatore (semplificata: il primo libero)
    private Pianeta scegliPianetaDisponibile(Giocatore g) {
        for (Pianeta p : pianeti) {
            if (p.libero()) {
                return p;
            }
        }
        return null; // nessun pianeta libero
    }

    // Controllo se almeno un razzo ha atterrato
    public boolean presenzaRazzo() {
        for (Pianeta p : pianeti) {
            if (p.occupatoDa != null) return true;
        }
        return false;
    }
}
