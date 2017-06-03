package Algo.Modelo.guerrerosz;

import Algo.Modelo.Personaje;
import Algo.Modelo.modo.NormalGohan;

public class Gokan extends Personaje{
	  public Gokan(){
		super.kiInicial=0;
		super.puntosVida=300;
		super.modoActual= new NormalGohan();
	}

}
