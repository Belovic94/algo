package dragonalgoball.AtaqueEspecialTipo;

import dragonalgoball.Atacable;
import dragonalgoball.AtaqueEspecial;


 

public class Absorber extends AtaqueEspecial{

	
	public Absorber(double puntosVida,int kiInicial,int poderPelea){
		super(puntosVida,kiInicial,poderPelea);
	}
	public void impactar(Atacable unAtacable){
		unAtacable.recibirDanio(this);
	}
	public int devolverDanioProducidoEnLaVida(int puntosVida){
		return puntosVida-this.poderDePelea ;
	}
}
