package dragonalgoball;

public abstract class AtaqueEspecial {

	protected int kiNecesario;
	
	public AtaqueEspecial(){
		
	}
	
	public int  obtenerKiNecesario(){
		return kiNecesario;
	}
	
	public abstract void impactarEn(Personaje unAtacante, Personaje unEnemigo, double danio);
}
