package dragonalgoball.AtaqueEspecialTipo;

import dragonalgoball.Atacable;
import dragonalgoball.AtaqueEspecial;

 

public class Makankosappo extends AtaqueEspecial {
	
	public Makankosappo(double puntosVida,int kiInicial,int poderPelea){
		super(puntosVida,kiInicial,poderPelea);
	}

	
	public int devolverDanioProducidoEnLaVida(int puntosVida){
		return puntosVida- (this.poderDePelea + this.poderDePelea*25/100) ;
	}
	
	public  void impactar(Atacable unAtacable){
		unAtacable.recibirDanio(this);
	}
}
