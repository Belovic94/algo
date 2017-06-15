package dragonalgoball.guerrerosz;

import dragonalgoball.Personaje;
import dragonalgoball.ataquesEspeciales.Makankosappo;
import dragonalgoball.modo.NormalPiccolo;
import dragonalgoball.modo.Fortalecido;
import dragonalgoball.modo.Protector;

public class Piccolo extends Personaje{
	
	private boolean convertible;
	
	public Piccolo(){
		super.nombre = "Piccolo";
		super.ki = 0;
		super.puntosDeVidaInicial = 500;
		super.puntosDeVida = 500;
		super.modoActual = new NormalPiccolo();
		super.ataqueEspecial = new Makankosappo();
		super.listaModos.put("Fortalecido",new Fortalecido());
		super.listaModos.put("Protector", new Protector());
		convertible = false;
	}
}
