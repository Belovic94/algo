package dragonalgoball.guerrerosz;

import dragonalgoball.Atacable;
import dragonalgoball.Personaje;
import dragonalgoball.AtaqueEspecialTipo.Absorber;
import dragonalgoball.AtaqueEspecialTipo.ConvierteteEnChocolate;
import dragonalgoball.AtaqueEspecialTipo.RayoMortal;
import dragonalgoball.modo.NormalGoku;

public class Goku extends Personaje{

	
	
	public  Goku(){
		super.nombre = "Goku";
		super.ki = 0;
		super.puntosDeVida = 500;
		super.modoActual = new NormalGoku();
	}
	
	
	public void atacarAPersonaje( Atacable unPersonaje){
		 this.ki =this.ki -20;
		  this.unaTecnica.impactar(unPersonaje);
	  }
	
	  
	public void recibirDanio(ConvierteteEnChocolate tecnica){
				//exepcion que no puede tomarlo
	          } 
	public void recibirDanio(RayoMortal tecnica){
				 //exepcion que no puede tomarlo
			}
	public void recibirDanio(Absorber tecnica){
				 //excepcion que no puede tomarlo
			}		 
 
	 
}
