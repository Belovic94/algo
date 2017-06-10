package dragonalgoball.guerrerosz;

 
import dragonalgoball.Atacable;
import dragonalgoball.AtaqueEspecial;
import dragonalgoball.Personaje;
import dragonalgoball.AtaqueEspecialTipo.Absorber;
import dragonalgoball.AtaqueEspecialTipo.ConvierteteEnChocolate;
import dragonalgoball.AtaqueEspecialTipo.Makankosappo;
import dragonalgoball.AtaqueEspecialTipo.Masenko;
import dragonalgoball.AtaqueEspecialTipo.RayoMortal;
import dragonalgoball.modo.NormalPiccolo;

public class Piccolo extends Personaje{
	
	public Piccolo(){
		super.nombre = "Piccolo";
		super.ki = 0;
		super.puntosDeVida = 500;
		super.modoActual = new NormalPiccolo();
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
