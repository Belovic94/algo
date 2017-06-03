package Algo.Modelo;

public class Main {

	public static void main(String[] args) {
		 
		 
		 
			Jugador unJugador=new Jugador();
		   unJugador.elegirPersonaje("Goku"); 
		   System.out.println("distancia del ataque es "+ unJugador.distanciaAtaque());
		 System.out.println("poder de ataque "+ unJugador.ataque());
		 System.out.println("velocidad "+ unJugador.velocidad());
		 
		 unJugador.evolucionar("KaioKen");
		  System.out.println("velocidad"+ unJugador.velocidad());
		  System.out.println("poder de ataque "+  unJugador.ataque());
		  System.out.println("distancia del ataque es "+unJugador.distanciaAtaque());
		  unJugador.evolucionar("SuperSayajin");
		  System.out.println("velocidad "+ unJugador.velocidad());
		  System.out.println("poder de ataque "+  unJugador.ataque());
		  System.out.println("distancia del ataque es "+unJugador.distanciaAtaque());
		  
	}

}
