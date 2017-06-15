package dragonalgoball.modo;

import dragonalgoball.Modo;
import dragonalgoball.enemigos.Cell;
import dragonalgoball.excepciones.ExcepcionAbsorcionesInsuficientes;

public class SemiPerfecto extends Modo {
	
	public SemiPerfecto(){
		
		super.poderDePelea = 40;
		super.distanciaDeAtaque = 4;
		super.velocidad = 3; 
		super.costo = 0;
		super.nombre = "SemiPerfecto";
	}
	
}