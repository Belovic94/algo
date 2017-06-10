package dragonalgoball.AtaqueEspecialTipo;

import dragonalgoball.Atacable;
import dragonalgoball.AtaqueEspecial;

public class ConvierteteEnChocolate extends AtaqueEspecial {
	
	public ConvierteteEnChocolate (double puntosVida,int kiInicial,int poderPelea){
		super(puntosVida,kiInicial,poderPelea);
	}

	
	public int devolverDanioProducidoEnLaVida(int puntosVida){
		//se resolveria el problema de turno
		return  5555 ;
	}
	
	public  void impactar(Atacable unAtacable){
		unAtacable.recibirDanio(this);
	}

}
