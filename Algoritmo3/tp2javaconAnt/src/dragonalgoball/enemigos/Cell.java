package dragonalgoball.enemigos;

import dragonalgoball.Personaje;
import dragonalgoball.modo.NormalCell;
import dragonalgoball.ataquesEspeciales.Absorber;
import dragonalgoball.excepciones.ExcepcionKiInsuficiente;
import dragonalgoball.modo.Perfecto;
import dragonalgoball.modo.SemiPerfecto;
import dragonalgoball.excepciones.ExcepcionAbsorcionesInsuficientes;

public class Cell extends Personaje{
	
	private static final int absorcionesSemiPerfecto = 4;
	private static final int absorcionesperfecto = 8;
	private static final int absorcionesnormal = 0;
	protected int absorciones;
	
	public Cell(){
		super.nombre = "Cell";
		super.ki = 0;
		super.puntosDeVidaInicial = 500;
		super.puntosDeVida = 500;
		super.modoActual = new NormalCell();
		super.ataqueEspecial = new Absorber();
		super.listaModos.put("SemiPerfecto",new SemiPerfecto());
		super.listaModos.put("Perfecto", new Perfecto());
		this.absorciones = 0;
	}
	@Override
	public void atacarAPersonajeConAtaqueEspecial(Personaje unEnemigo){
		
		int kiNecesario = super.ataqueEspecial.obtenerKiNecesario();
		if (kiNecesario > super.ki){
			throw new ExcepcionKiInsuficiente();
		}
		super.ki -= kiNecesario;
		super.ataqueEspecial.impactarEn(this, unEnemigo, this.obtenerDanio(unEnemigo));
		this.absorciones ++;
	}
	
	public int obtenerAbsorciones(){
		return this.absorciones;
	}
		
	public void cambiarModo(String nombremodo){
		if((absorciones >= absorcionesSemiPerfecto && nombremodo == "SemiPerfecto") ||
		(absorciones >= absorcionesperfecto && nombremodo == "Perfecto") || (absorciones >= absorcionesnormal && nombremodo == "Normal")){
			super.cambiarModo(nombremodo);
		}
		else{
			throw new ExcepcionAbsorcionesInsuficientes("Cell no ha absorvido suficientes personajes");
		}
	}
	
	
}
