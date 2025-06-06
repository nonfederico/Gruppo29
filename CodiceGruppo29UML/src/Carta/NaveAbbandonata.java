package Carta;

import java.util.List;
import java.util.Scanner;

public class NaveAbbandonata extends Carte {

    private int prezzo; // Crediti che guadagni
    private int pedineEquipaggioPerse; // Quanti membri dell’equipaggio devi sacrificare
    private int giorniPersi; // Giorni persi nel vendere la nave

    public NaveAbbandonata(int prezzo, int pedineEquipaggioPerse, int giorniPersi) {
        this.prezzo = prezzo;
        this.pedineEquipaggioPerse = pedineEquipaggioPerse;
        this.giorniPersi = giorniPersi;
    }

    /**
     * Gestisce l'interazione con i giocatori per la vendita della nave abbandonata
     */
    
    public void eseguiEvento(List<Giocatore> giocatoriInOrdine) {
        System.out.println("\n🛰️ Nave Abbandonata! Ricompensa: " + prezzo + " crediti, Costo: " +
                pedineEquipaggioPerse + " membri equipaggio e " + giorniPersi + " giorni di volo.");

        for (Giocatore g : giocatoriInOrdine) {
            if (g.getEquipaggioTotale() >= pedineEquipaggioPerse) {
                if (vendiNave(g)) {
                    g.perdiEquipaggio(pedineEquipaggioPerse);
                    g.giudagnaCrediti(prezzo);
                    g.perdiGiorniVolo(giorniPersi);
                    System.out.println("✅ " + g.getNome() + " ha venduto la nave e guadagnato " + prezzo + " crediti.");
                    return;
                } else {
                    System.out.println("❎ " + g.getNome() + " ha rifiutato l'opportunità.");
                }
            } else {
                System.out.println("❌ " + g.getNome() + " non ha abbastanza equipaggio (" +
                        g.getEquipaggioTotale() + "/" + pedineEquipaggioPerse + ").");
            }
        }

        System.out.println("😞 Nessun giocatore ha venduto la nave.");
    }

    /**
     * Chiede al giocatore se vuole vendere la nave abbandonata
     */
    public boolean vendiNave(Giocatore g) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print( g.getNome() + ", vuoi vendere la nave abbandonata per "
                    + prezzo + " crediti, sacrificando " + pedineEquipaggioPerse + " membri dell'equipaggio e "
                    + giorniPersi + " giorni di volo? (si/no): ");
            String risposta = scanner.nextLine().trim().toLowerCase();
            if (risposta.equals("si")) return true;
            if (risposta.equals("no")) return false;
            System.out.println("⚠️ Risposta non valida. Scrivi 'si' o 'no'.");
        }
    }


    // Getter e Setter opzionali
    public int getPrezzo() {
        return prezzo;
    }

    public int getPedineEquipaggioPerse() {
        return pedineEquipaggioPerse;
    }

    public int getGiorniPersi() {
        return giorniPersi;
    }
}
