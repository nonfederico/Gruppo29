package player;

public class Modulo {
	public int[] connettori = {0,0,0,0};
	public int potenzaMotrice;
}

class ModuloMotore extends Modulo{
	public ModuloMotore(){
		this.connettori[1] = 0;
		this.connettori[2] = 0;
		this.connettori[3] = 0;
		this.connettori[4] = 0;
		this.potenzaMotrice = 1;
	}
}

class ModuloMotore1 extends ModuloMotore{
	public ModuloMotore1(){
		this.connettori[1] = 1;
		this.connettori[2] = 0;
		this.connettori[3] = 0;
		this.connettori[4] = 3;
	}
}

class ModuloMotore2 extends ModuloMotore{
	public ModuloMotore2(){
		this.connettori[1] = 3;
		this.connettori[2] = 1;
		this.connettori[3] = 0;
		this.connettori[4] = 3;
	}
}

class ModuloMotore3 extends ModuloMotore{
	public ModuloMotore3(){
		this.connettori[1] = 0;
		this.connettori[2] = 2;
		this.connettori[3] = 0;
		this.connettori[4] = 2;
	}
}