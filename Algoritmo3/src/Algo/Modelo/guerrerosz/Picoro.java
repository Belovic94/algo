package Algo.Modelo.guerrerosz;

import Algo.Modelo.Personaje;
import Algo.Modelo.modo.NormalPicoro;

public class Picoro extends Personaje{
	
	public Picoro(){
		super.kiInicial=0;
		super.puntosVida=500;
		super.modoActual=new NormalPicoro();
	}
    
 
}
