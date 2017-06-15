package dragonalgoball.guerrerosz;

import dragonalgoball.Personaje;
import dragonalgoball.ataquesEspeciales.Masenko;
import dragonalgoball.modo.NormalGohan;
import dragonalgoball.modo.SuperSayajinFase1;
import dragonalgoball.modo.SuperSayajinFase2;

public class Gohan extends Personaje{
	
	
	public Gohan(){
		super.nombre = "Gohan";
		super.ki = 0;
		super.puntosDeVidaInicial = 300;
		super.puntosDeVida = 300;
		super.modoActual= new NormalGohan();
		super.ataqueEspecial = new Masenko();
		super.listaModos.put("SuperSayajinFase1 ",new SuperSayajinFase1());
		super.listaModos.put("SuperSayajinFase2", new SuperSayajinFase2());
	}

}
