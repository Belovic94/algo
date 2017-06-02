package Algo.Modelo;

public class Main {

	public static void main(String[] args) {
		 
		 
		 
			Jugador unJugador=new Jugador();
		   unJugador.elegirPersonaje("Goku"); 
		
		 System.out.println(unJugador.atacar());
		  unJugador.evolucionar("KaioKen");
		  System.out.println(unJugador.atacar());
		  
	}

}
