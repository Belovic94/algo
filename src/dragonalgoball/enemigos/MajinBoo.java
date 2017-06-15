package dragonalgoball.enemigos;

import dragonalgoball.Personaje;
import dragonalgoball.ataquesEspeciales.ConvierteteEnChocolate;
import dragonalgoball.modo.NormalMajinBoo;
import dragonalgoball.modo.BooMalo;
import dragonalgoball.modo.BooOriginal;

public class MajinBoo extends Personaje{
	
	public MajinBoo(){
		super.nombre = "MajinBoo";
		super.ki = 0;
		super.puntosDeVidaInicial = 400;
		super.puntosDeVida = 400;
		super.modoActual = new NormalMajinBoo();
		super.ataqueEspecial = new ConvierteteEnChocolate();
		super.listaModos.put("BooMalo",new BooMalo());
		super.listaModos.put("BooOriginal", new BooOriginal());
	}
	
}
