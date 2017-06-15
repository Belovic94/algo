package dragonalgoball.ataquesEspeciales;


import dragonalgoball.AtaqueEspecial;
import dragonalgoball.Personaje;

public class Masenko extends AtaqueEspecial{

	public Masenko(){
		super.kiNecesario = 10;
	}
	
	public void impactarEn(Personaje unAtacante, Personaje unEnemigo, double danio){
		unEnemigo.disminuirVida(danio * 1.25);
	}
}
