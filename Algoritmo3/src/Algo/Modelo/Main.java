package Algo.Modelo;

public class Main {

	public static void main(String[] args) {
		 
		 
		 
			Jugador unJugador=new Jugador();
			unJugador.elegirEquipo("GuerrerosZ");
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
		  
		  
		  
		  System.out.println("////////////////////////////");
		  Jugador otroJugador=new Jugador();
		   
		  otroJugador.elegirEquipo("EnemigosDeLaTierra");
		  otroJugador.elegirPersonaje("Freezer"); 
		   System.out.println("distancia del ataque es "+ otroJugador.distanciaAtaque());
		 System.out.println("poder de ataque "+ otroJugador.ataque());
		 System.out.println("velocidad "+ otroJugador.velocidad());
		 
		 unJugador.evolucionar("SegundaForma");
		  System.out.println("velocidad"+ otroJugador.velocidad());
		  System.out.println("poder de ataque "+  otroJugador.ataque());
		  System.out.println("distancia del ataque es "+otroJugador.distanciaAtaque());
		  otroJugador.evolucionar("Definitivo");
		  System.out.println("velocidad "+ otroJugador.velocidad());
		  System.out.println("poder de ataque "+  otroJugador.ataque());
		  System.out.println("distancia del ataque es "+otroJugador.distanciaAtaque());
		  
	}

}
