package dragonalgoball.AtaqueEspecialTipo;

import dragonalgoball.Atacable;
import dragonalgoball.AtaqueEspecial;

public class RayoMortal extends AtaqueEspecial {


	public RayoMortal(double puntosVida,int kiInicial,int poderPelea){
		super(puntosVida,kiInicial,poderPelea);
	}
	public void impactar(Atacable unAtacable){
		unAtacable.recibirDanio(this);
	}
	public int devolverDanioProducidoEnLaVida(int puntosVida){
		return puntosVida-(this.poderDePelea + this.poderDePelea*50/100)  ;
	}
}
