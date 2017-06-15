package dragonalgoball.enemigos;

import dragonalgoball.Personaje;
import dragonalgoball.modo.SegundaForma;
import dragonalgoball.modo.Definitivo;
import dragonalgoball.ataquesEspeciales.RayoMortal;
import dragonalgoball.modo.NormalFreezer;

public class Freezer extends Personaje{
	
	public Freezer(){
		super.nombre = "Freezer";
		super.ki = 0;
		super.puntosDeVidaInicial = 400;
		super.puntosDeVida = 400;
		super.modoActual = new NormalFreezer();
		super.ataqueEspecial = new RayoMortal();
		super.listaModos.put("SegundaForma",new SegundaForma());
		super.listaModos.put("Definitivo", new Definitivo());
	}
	

 
	
}
