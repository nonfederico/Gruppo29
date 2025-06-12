package eccezioni;

public class CasellaNonPresenteException extends Exception {
	private static final long serialVersionUID = 1L;

	public CasellaNonPresenteException(int index) {
		super("Errore, casella non presente ");
	}
}
