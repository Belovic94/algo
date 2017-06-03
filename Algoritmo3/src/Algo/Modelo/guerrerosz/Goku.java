package Algo.Modelo.guerrerosz;

import Algo.Modelo.Personaje;
import Algo.Modelo.modo.Normal;
import Algo.Modelo.modo.NormalGoku;

public class Goku extends Personaje{
	int puntosVida;
	int kiInicial;
	int velocidad;
	
	
	public  Goku(){
		super();
		modoActual=new NormalGoku();
	}
	
	 
 
	 
}
