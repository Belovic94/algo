package dragonalgoball.enemigos;

import dragonalgoball.Atacable;
import dragonalgoball.Personaje;
import dragonalgoball.AtaqueEspecialTipo.Absorber;
import dragonalgoball.AtaqueEspecialTipo.ConvierteteEnChocolate;
import dragonalgoball.AtaqueEspecialTipo.RayoMortal;
import dragonalgoball.modo.NormalCell;
import dragonalgoball.modo.NormalMajinBoo;

public class MajinBoo extends Personaje{
	public MajinBoo(){
		super.nombre = "MajinBoo";
		super.ki = 0;
		super.puntosDeVida = 400;
		super.modoActual = new NormalMajinBoo();
		super.unaTecnica=new Absorber(this.puntosDeVida,this.ki,new NormalCell().obtenerPoderDePelea());
	}
	
	 public void atacarAPersonaje( Atacable unPersonaje){
	        this.ki =this.ki -30;
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
