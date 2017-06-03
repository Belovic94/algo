package Algo.Modelo.enemigos;

import Algo.Modelo.Personaje;
import Algo.Modelo.modo.NormalMajinBoo;

public class MajinBoo extends Personaje{
	public MajinBoo(){
		super.kiInicial=0;
		super.puntosVida=400;
		super.modoActual= new NormalMajinBoo();
	}
}
