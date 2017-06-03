package Algo.Modelo.enemigos;

import Algo.Modelo.Personaje;
import Algo.Modelo.modo.NormalFreezer;

public class Freezer extends Personaje{
	public Freezer(){
		super.kiInicial=0;
		super.puntosVida=400;
		super.modoActual= new NormalFreezer();
	}
 
	
}
