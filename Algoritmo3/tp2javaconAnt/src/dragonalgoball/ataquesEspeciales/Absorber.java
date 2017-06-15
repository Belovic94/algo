package dragonalgoball.ataquesEspeciales;


import dragonalgoball.AtaqueEspecial;
import dragonalgoball.Personaje;

public class Absorber extends AtaqueEspecial{

	
	public Absorber(){
		super.kiNecesario = 5;
	}
	
	public void impactarEn(Personaje unAtacante, Personaje unEnemigo, double danio){
		unEnemigo.disminuirVida(danio);
		unAtacante.aumentarVida(danio);
	}
}
