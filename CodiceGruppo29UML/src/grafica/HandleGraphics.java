package grafica;

public class HandleGraphics {
	// si occupa di creare un unico frame, il contenitore principale , richiamare
	// sempre questo nelle altre classi per modifica a parti grafiche

	static FrameBase frameBase = null;

	public HandleGraphics() {
		createGraphics(); // creo grafica quando sul main inizializzo HandleGraphics
	}

	public static FrameBase createGraphics() {
		if (frameBase == null) {
			frameBase = new FrameBase();
			System.out.println("frame creato");
		}
		return frameBase;
	}

	public static FrameBase getGraphics() {
		if (frameBase == null) {
			return createGraphics();
		}
		return frameBase;
	}
}
