package Algo.Modelo.enemigos;

import Algo.Modelo.Personaje;
import Algo.Modelo.modo.NormalCell;

public class Cell extends Personaje{
	  public Cell(){
			super.kiInicial=0;
			super.puntosVida=500;
			super.modoActual= new NormalCell();
		}
}
