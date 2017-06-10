package dragonalgoball;

 

public abstract class AtaqueEspecial {
	 protected double puntosVida;
	 protected int poderDePelea;
	protected int kiInicial;
	
	public AtaqueEspecial(double puntosVida,int kiInicial,int poderPelea){
		this.poderDePelea=poderPelea;
		this.kiInicial=kiInicial;
		this.puntosVida=puntosVida;
	}
	
	public double devolverDanioProducidoEnLaVida(double puntosVida){
		return puntosVida  ;
	}
	
	
	public abstract  void impactar(Atacable unAtacable) ;
	 
}
