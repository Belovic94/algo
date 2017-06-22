package dragonalgoball.ataquesEspeciales;


import dragonalgoball.AtaqueEspecial;
import dragonalgoball.Personaje;

public class RayoMortal extends AtaqueEspecial {

	public RayoMortal(){
		super.kiNecesario = 20;
	}
	
	public void impactarEn(Personaje unAtacante, Personaje unEnemigo, double danio){
		unEnemigo.disminuirVida(danio * 1.50);
	}

}
