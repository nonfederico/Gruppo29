package player;

import javax.swing.SwingWorker;
import java.util.Scanner;

/**
 * 
 */
public class PlanciaNave extends SwingWorker<Void, Void> {

	public PlanciaNave() {
	}

	public Modulo[] moduliNave = new Modulo[18];
	
	public boolean[] disponibilitaPosizioni = {false, false, true, false, false, true, false, true, false, false, false, true, false, false, false, false, false, false };
	
	public boolean[] posizioniNnModificabili = {false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false };
	
	public int livello;

	public boolean legalita;

	public int potenzaMotrice;

	public int potenzaFuoco;

	public boolean isLegale() {

		return this.legalita;
		// TODO implement here
	}
	
	public void aggiungiModulo(Modulo newModulo) {
		Scanner scanner = new Scanner(System.in);
		boolean ok=false;
		do {
			System.out.println("in che posizione vuoi inserirlo tra:");
			for(int i = 0; i < disponibilitaPosizioni.length; i++) {
				if(disponibilitaPosizioni[i])
					System.out.println(i);
			}
			int posizione = scanner.nextInt();
			
			if(disponibilitaPosizioni[posizione]) {
				for(int i = 0; i < newModulo.connettori.length; i++) {
					if(newModulo.connettori[i]>0)
						switch(posizione) {
						case 0:
							if(i==2)
								if(!posizioniNnModificabili[2])
									disponibilitaPosizioni[2]=!disponibilitaPosizioni[2]; 
							break;
						case 1:
							switch(i) {
							case 1:
								if(!posizioniNnModificabili[2])
									disponibilitaPosizioni[2]=!disponibilitaPosizioni[2];
								break;
							case 2:
								if(!posizioniNnModificabili[5])
									disponibilitaPosizioni[5]=!disponibilitaPosizioni[5];
								break;
							}
							break;
						case 2:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[0])
									disponibilitaPosizioni[0]=!disponibilitaPosizioni[0];
								break;
							case 1:
								if(!posizioniNnModificabili[3])
									disponibilitaPosizioni[3]=!disponibilitaPosizioni[3];
								break;
							case 3:
								if(!posizioniNnModificabili[1])
									disponibilitaPosizioni[1]=!disponibilitaPosizioni[1];
								break;
							}
							break;
						case 3:
							switch(i) {
							case 2:
								if(!posizioniNnModificabili[7])
									disponibilitaPosizioni[7]=!disponibilitaPosizioni[7];
								break;
							case 3:
								if(!posizioniNnModificabili[2])
									disponibilitaPosizioni[2]=!disponibilitaPosizioni[2];
								break;
							}
							break;
						case 4:
							switch(i) {
							case 1:
								if(!posizioniNnModificabili[5])
									disponibilitaPosizioni[5]=!disponibilitaPosizioni[5];
								break;
							case 2:
								if(!posizioniNnModificabili[9])
									disponibilitaPosizioni[9]=!disponibilitaPosizioni[9];
								break;
							}
							break;
						case 5:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[1])
									disponibilitaPosizioni[1]=!disponibilitaPosizioni[1];
								break;
							case 2:
								if(!posizioniNnModificabili[10])
									disponibilitaPosizioni[10]=!disponibilitaPosizioni[10];
								break;
							case 3:
								if(!posizioniNnModificabili[4])
									disponibilitaPosizioni[4]=!disponibilitaPosizioni[4];
								break;
							}
							break;
						case 7:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[3])
									disponibilitaPosizioni[3]=!disponibilitaPosizioni[3];
								break;
							case 1:
								if(!posizioniNnModificabili[8])
									disponibilitaPosizioni[8]=!disponibilitaPosizioni[8];
								break;
							case 2:
								if(!posizioniNnModificabili[12])
									disponibilitaPosizioni[12]=!disponibilitaPosizioni[12];
								break;
							}
							break;
						case 8:
							switch(i) {
							case 2:
								if(!posizioniNnModificabili[13])
									disponibilitaPosizioni[13]=!disponibilitaPosizioni[13];
								break;
							case 3:
								if(!posizioniNnModificabili[4])
									disponibilitaPosizioni[4]=!disponibilitaPosizioni[4];
								break;
							}
							break;
						case 9:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[4])
									disponibilitaPosizioni[4]=!disponibilitaPosizioni[4];
								break;
							case 1:
								if(!posizioniNnModificabili[10])
									disponibilitaPosizioni[10]=!disponibilitaPosizioni[10];
								break;
							case 2:
								if(!posizioniNnModificabili[10])
									disponibilitaPosizioni[10]=!disponibilitaPosizioni[10];
								break;
							}
							break;
						case 10:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[5])
									disponibilitaPosizioni[5]=!disponibilitaPosizioni[5];
								break;
							case 1:
								if(!posizioniNnModificabili[11])
									disponibilitaPosizioni[11]=!disponibilitaPosizioni[11];
								break;
							case 2:
								if(!posizioniNnModificabili[15])
									disponibilitaPosizioni[15]=!disponibilitaPosizioni[15];
								break;
							case 3:
								if(!posizioniNnModificabili[9])
									disponibilitaPosizioni[9]=!disponibilitaPosizioni[9];
								break;
							}
							break;
						case 11:
							switch(i) {
							case 1:
								if(!posizioniNnModificabili[10])
									disponibilitaPosizioni[10]=!disponibilitaPosizioni[10];
								break;
							case 3:
								if(!posizioniNnModificabili[12])
									disponibilitaPosizioni[12]=!disponibilitaPosizioni[12];
								break;
							}
							break;
						case 12:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[7])
									disponibilitaPosizioni[7]=!disponibilitaPosizioni[7];
								break;
							case 1:
								if(!posizioniNnModificabili[13])
									disponibilitaPosizioni[13]=!disponibilitaPosizioni[13];
								break;
							case 2:
								if(!posizioniNnModificabili[16])
									disponibilitaPosizioni[16]=!disponibilitaPosizioni[16];
								break;
							case 3:
								if(!posizioniNnModificabili[11])
									disponibilitaPosizioni[11]=!disponibilitaPosizioni[11];
								break;
							}
							break;
						case 13:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[8])
									disponibilitaPosizioni[8]=!disponibilitaPosizioni[8];
								break;
							case 2:
								if(!posizioniNnModificabili[17])
									disponibilitaPosizioni[17]=!disponibilitaPosizioni[17];
								break;
							case 3:
								if(!posizioniNnModificabili[12])
									disponibilitaPosizioni[12]=!disponibilitaPosizioni[12];
								break;
							}
							break;
						case 14:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[9])
									disponibilitaPosizioni[9]=!disponibilitaPosizioni[9];
								break;
							case 1:
								if(!posizioniNnModificabili[15])
									disponibilitaPosizioni[15]=!disponibilitaPosizioni[15];
								break;
							}
							break;
						case 15:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[10])
									disponibilitaPosizioni[10]=!disponibilitaPosizioni[10];
								break;
							case 3:
								if(!posizioniNnModificabili[14])
									disponibilitaPosizioni[14]=!disponibilitaPosizioni[14];
								break;
							}
							break;	
						case 16:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[12])
									disponibilitaPosizioni[12]=!disponibilitaPosizioni[12];
								break;
							case 1:
								if(!posizioniNnModificabili[17])
									disponibilitaPosizioni[17]=!disponibilitaPosizioni[17];
								break;
							}
							break;
						case 17:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[13])
									disponibilitaPosizioni[13]=!disponibilitaPosizioni[13];
								break;
							case 3:
								if(!posizioniNnModificabili[16])
									disponibilitaPosizioni[16]=!disponibilitaPosizioni[16];
								break;
							}
							break;	
						}
				}
				moduliNave[posizione]=newModulo;
				posizioniNnModificabili[posizione]=!posizioniNnModificabili[posizione];
				ok = !ok;
			} else {
				System.out.println("hai inserito una posizione errata, riprova");
			}
		}while(ok);
	}

	
	public void ritornaRicompensePenalita() {
		// TODO implement here
	}

	public int calcolaPotenzaMotrice() {
		int potenza = 0;
		return potenza;
		// TODO implement here
	}

	public int calcolaPotenzaFuoco() {
		int potenza = 0;
		return potenza;
		// TODO implement here
	}

	public void returnpenalita() {
		// TODO implement here
	}

	public void returnricompense() {
		// TODO implement here
	}

	@Override
	protected Void doInBackground() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}


/*
 * per i motori
 * 
 * do {
			System.out.println("in che posizione vuoi inserirlo tra:");
			for(int i = 0; i < disponibilitaPosizioni.length; i++) {
				if(disponibilitaPosizioni[i])
					System.out.println(i);
			}
			int posizione = scanner.nextInt();
			
			if(disponibilitaPosizioni[posizione]) {   fare uno switch per le posizioni per controllare anche la posizione sotto dentro la quale mettere questo if
				for(int i = 0; i < newModulo.connettori.length; i++) {
					if(newModulo.connettori[i]>0)
						switch(posizione) {
						case 0:
							if(i==2)
								if(!posizioniNnModificabili[2])
									disponibilitaPosizioni[2]=!disponibilitaPosizioni[2]; 
							break;
						case 1:
							switch(i) {
							case 1:
								if(!posizioniNnModificabili[2])
									disponibilitaPosizioni[2]=!disponibilitaPosizioni[2];
								break;
							case 2:
								if(!posizioniNnModificabili[5])
									disponibilitaPosizioni[5]=!disponibilitaPosizioni[5];
								break;
							}
							break;
						case 2:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[0])
									disponibilitaPosizioni[0]=!disponibilitaPosizioni[0];
								break;
							case 1:
								if(!posizioniNnModificabili[3])
									disponibilitaPosizioni[3]=!disponibilitaPosizioni[3];
								break;
							case 3:
								if(!posizioniNnModificabili[1])
									disponibilitaPosizioni[1]=!disponibilitaPosizioni[1];
								break;
							}
							break;
						case 3:
							switch(i) {
							case 2:
								if(!posizioniNnModificabili[7])
									disponibilitaPosizioni[7]=!disponibilitaPosizioni[7];
								break;
							case 3:
								if(!posizioniNnModificabili[2])
									disponibilitaPosizioni[2]=!disponibilitaPosizioni[2];
								break;
							}
							break;
						case 4:
							switch(i) {
							case 1:
								if(!posizioniNnModificabili[5])
									disponibilitaPosizioni[5]=!disponibilitaPosizioni[5];
								break;
							case 2:
								if(!posizioniNnModificabili[9])
									disponibilitaPosizioni[9]=!disponibilitaPosizioni[9];
								break;
							}
							break;
						case 5:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[1])
									disponibilitaPosizioni[1]=!disponibilitaPosizioni[1];
								break;
							case 2:
								if(!posizioniNnModificabili[10])
									disponibilitaPosizioni[10]=!disponibilitaPosizioni[10];
								break;
							case 3:
								if(!posizioniNnModificabili[4])
									disponibilitaPosizioni[4]=!disponibilitaPosizioni[4];
								break;
							}
							break;
						case 7:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[3])
									disponibilitaPosizioni[3]=!disponibilitaPosizioni[3];
								break;
							case 1:
								if(!posizioniNnModificabili[8])
									disponibilitaPosizioni[8]=!disponibilitaPosizioni[8];
								break;
							case 2:
								if(!posizioniNnModificabili[12])
									disponibilitaPosizioni[12]=!disponibilitaPosizioni[12];
								break;
							}
							break;
						case 8:
							switch(i) {
							case 2:
								if(!posizioniNnModificabili[13])
									disponibilitaPosizioni[13]=!disponibilitaPosizioni[13];
								break;
							case 3:
								if(!posizioniNnModificabili[4])
									disponibilitaPosizioni[4]=!disponibilitaPosizioni[4];
								break;
							}
							break;
						case 9:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[4])
									disponibilitaPosizioni[4]=!disponibilitaPosizioni[4];
								break;
							case 1:
								if(!posizioniNnModificabili[10])
									disponibilitaPosizioni[10]=!disponibilitaPosizioni[10];
								break;
							case 2:
								if(!posizioniNnModificabili[10])
									disponibilitaPosizioni[10]=!disponibilitaPosizioni[10];
								break;
							}
							break;
						case 10:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[5])
									disponibilitaPosizioni[5]=!disponibilitaPosizioni[5];
								break;
							case 1:
								if(!posizioniNnModificabili[11])
									disponibilitaPosizioni[11]=!disponibilitaPosizioni[11];
								break;
							case 2:
								if(!posizioniNnModificabili[15])
									disponibilitaPosizioni[15]=!disponibilitaPosizioni[15];
								break;
							case 3:
								if(!posizioniNnModificabili[9])
									disponibilitaPosizioni[9]=!disponibilitaPosizioni[9];
								break;
							}
							break;
						case 11:
							switch(i) {
							case 1:
								if(!posizioniNnModificabili[10])
									disponibilitaPosizioni[10]=!disponibilitaPosizioni[10];
								break;
							case 3:
								if(!posizioniNnModificabili[12])
									disponibilitaPosizioni[12]=!disponibilitaPosizioni[12];
								break;
							}
							break;
						case 12:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[7])
									disponibilitaPosizioni[7]=!disponibilitaPosizioni[7];
								break;
							case 1:
								if(!posizioniNnModificabili[13])
									disponibilitaPosizioni[13]=!disponibilitaPosizioni[13];
								break;
							case 2:
								if(!posizioniNnModificabili[16])
									disponibilitaPosizioni[16]=!disponibilitaPosizioni[16];
								break;
							case 3:
								if(!posizioniNnModificabili[11])
									disponibilitaPosizioni[11]=!disponibilitaPosizioni[11];
								break;
							}
							break;
						case 13:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[8])
									disponibilitaPosizioni[8]=!disponibilitaPosizioni[8];
								break;
							case 2:
								if(!posizioniNnModificabili[17])
									disponibilitaPosizioni[17]=!disponibilitaPosizioni[17];
								break;
							case 3:
								if(!posizioniNnModificabili[12])
									disponibilitaPosizioni[12]=!disponibilitaPosizioni[12];
								break;
							}
							break;
						case 14:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[9])
									disponibilitaPosizioni[9]=!disponibilitaPosizioni[9];
								break;
							case 1:
								if(!posizioniNnModificabili[15])
									disponibilitaPosizioni[15]=!disponibilitaPosizioni[15];
								break;
							}
							break;
						case 15:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[10])
									disponibilitaPosizioni[10]=!disponibilitaPosizioni[10];
								break;
							case 3:
								if(!posizioniNnModificabili[14])
									disponibilitaPosizioni[14]=!disponibilitaPosizioni[14];
								break;
							}
							break;	
						case 16:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[12])
									disponibilitaPosizioni[12]=!disponibilitaPosizioni[12];
								break;
							case 1:
								if(!posizioniNnModificabili[17])
									disponibilitaPosizioni[17]=!disponibilitaPosizioni[17];
								break;
							}
							break;
						case 17:
							switch(i) {
							case 0:
								if(!posizioniNnModificabili[13])
									disponibilitaPosizioni[13]=!disponibilitaPosizioni[13];
								break;
							case 3:
								if(!posizioniNnModificabili[16])
									disponibilitaPosizioni[16]=!disponibilitaPosizioni[16];
								break;
							}
							break;	
						}
				}
				moduliNave[posizione]=newModulo;
				posizioniNnModificabili[posizione]=!posizioniNnModificabili[posizione];
				switch(posizione){
				case 1:
					posizioniNnModificabili[5]=!posizioniNnModificabili[5];
					break;
				case 3:
					posizioniNnModificabili[7]=!posizioniNnModificabili[7];
					break;
				case 4:
					posizioniNnModificabili[9]=!posizioniNnModificabili[9];
					break;
				case 5:
					posizioniNnModificabili[10]=!posizioniNnModificabili[10];
					break;
				case 7:
					posizioniNnModificabili[12]=!posizioniNnModificabili[12];
					break;
				case 8:
					posizioniNnModificabili[13]=!posizioniNnModificabili[13];
					break;
				case 9:
					posizioniNnModificabili[14]=!posizioniNnModificabili[14];
					break;
				case 10:
					posizioniNnModificabili[15]=!posizioniNnModificabili[15];
					break;
				case 12:
					posizioniNnModificabili[16]=!posizioniNnModificabili[16];
					break;
				case 13:
					posizioniNnModificabili[17]=!posizioniNnModificabili[17];
					break;
				}
				ok = !ok;
			} else {
				System.out.println("hai inserito una posizione errata, riprova");
			}
		}while(ok);
 */
