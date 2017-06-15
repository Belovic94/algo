package dragonalgoball.guerrerosz;

import dragonalgoball.Personaje;
import dragonalgoball.modo.KaioKen;
import dragonalgoball.modo.SuperSayajin;
import dragonalgoball.modo.NormalGoku;
import dragonalgoball.ataquesEspeciales.Kamehameha;

public class Goku extends Personaje{

	
	
	public  Goku(){
		super.nombre = "Goku";
		super.ki = 0;
		super.puntosDeVidaInicial = 500;
		super.puntosDeVida = 500;
		super.modoActual = new NormalGoku();
		super.ataqueEspecial = new Kamehameha();
		super.listaModos.put("KaioKen",new KaioKen());
		super.listaModos.put("SuperSayajin", new SuperSayajin());
	}
	
	@Override
	public double obtenerDanio(Personaje unEnemigo){//Aumento el ataque de Goku en un 20% si su vida es menor al 30%
		double danio = super.obtenerDanio(unEnemigo);
		if (super.puntosDeVidaInicial * 0.3 > super.puntosDeVida){
			danio = danio * 1.2;
		}
		return danio;
	}
	 
 
	 
}
