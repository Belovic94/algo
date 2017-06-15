package dragonalgoball.ataquesEspeciales;

import dragonalgoball.AtaqueEspecial;
import dragonalgoball.Personaje;

public class ConvierteteEnChocolate extends AtaqueEspecial {
	
	public ConvierteteEnChocolate(){
		super.kiNecesario = 30;
	}
	
	public void impactarEn(Personaje unAtacante, Personaje unEnemigo, double danio){
		unEnemigo.cambiarEstado("ConvertidoEnChocolate");
	}

	

}
