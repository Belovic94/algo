package dragonalgoball.guerrerosz;

import dragonalgoball.Atacable;
import dragonalgoball.Personaje;
import dragonalgoball.AtaqueEspecialTipo.Absorber;
import dragonalgoball.AtaqueEspecialTipo.ConvierteteEnChocolate;
import dragonalgoball.AtaqueEspecialTipo.RayoMortal;
import dragonalgoball.modo.NormalGohan;

public class Gohan extends Personaje{
	
	
	public Gohan(){
		super.nombre = "Gohan";
		super.ki = 0;
		super.puntosDeVida = 300;
		super.modoActual= new NormalGohan();
	}
	
	
	public void atacarAPersonaje( Atacable unPersonaje){
		 this.ki =this.ki -10;
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
