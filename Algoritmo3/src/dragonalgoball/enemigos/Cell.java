package dragonalgoball.enemigos;

import dragonalgoball.Atacable;
import dragonalgoball.Personaje;
import dragonalgoball.AtaqueEspecialTipo.Absorber;
import dragonalgoball.AtaqueEspecialTipo.ConvierteteEnChocolate;
import dragonalgoball.AtaqueEspecialTipo.Kamehameha;
import dragonalgoball.AtaqueEspecialTipo.Makankosappo;
import dragonalgoball.AtaqueEspecialTipo.Masenko;
import dragonalgoball.AtaqueEspecialTipo.RayoMortal;
import dragonalgoball.excepciones.ExcepcionCeldaVacia;
import dragonalgoball.excepciones.ExcepcionMovimientoInvalido;
import dragonalgoball.modo.NormalCell;
import dragonalgoball.tablero.Celda;
import dragonalgoball.tablero.Tablero;


 

public class Cell extends Personaje{
	public Cell(){
		super.nombre = "Cell";
		super.ki = 0;
		super.puntosDeVida = 500;
		super.modoActual = new NormalCell();
		super.unaTecnica=new Absorber(this.puntosDeVida,this.ki,new NormalCell().obtenerPoderDePelea());
	}
	
	
	  public void atacarAPersonaje( Atacable unPersonaje){
	        this.puntosDeVida =this.puntosDeVida + new NormalCell().obtenerPoderDePelea();
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
