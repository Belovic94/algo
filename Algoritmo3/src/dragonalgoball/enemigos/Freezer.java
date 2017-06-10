package dragonalgoball.enemigos;

import dragonalgoball.Atacable;
import dragonalgoball.Personaje;
import dragonalgoball.AtaqueEspecialTipo.Absorber;
import dragonalgoball.AtaqueEspecialTipo.ConvierteteEnChocolate;
import dragonalgoball.AtaqueEspecialTipo.RayoMortal;
import dragonalgoball.modo.NormalCell;
import dragonalgoball.modo.NormalFreezer;

public class Freezer extends Personaje{
	public Freezer(){
		super.nombre = "Freezer";
		super.ki = 0;
		super.puntosDeVida = 400;
		super.modoActual = new NormalFreezer();
		super.unaTecnica=new Absorber(this.puntosDeVida,this.ki,new NormalCell().obtenerPoderDePelea());
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
