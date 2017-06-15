package dragonalgoball.ataquesEspeciales;

import dragonalgoball.AtaqueEspecial;
import dragonalgoball.Personaje;

public class Kamehameha extends AtaqueEspecial {

	public Kamehameha(){
		super.kiNecesario = 20;
	}
	
	public void impactarEn(Personaje unAtacante, Personaje unEnemigo, double danio){
		unEnemigo.disminuirVida(danio * 1.5);
	}

}
