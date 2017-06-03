package Algo.Modelo;

import java.util.HashMap;

import Algo.Modelo.modo.BooMalo;
import Algo.Modelo.modo.BooOriginal;
import Algo.Modelo.modo.Definitivo;
import Algo.Modelo.modo.Fortalecido;
import Algo.Modelo.modo.KaioKen;
import Algo.Modelo.modo.SemiPerfecto;
import Algo.Modelo.modo.SuperSayajin;
import Algo.Modelo.modo.SuperSayajinFase1;

public abstract class Personaje {
	
	protected int puntosVida;
	protected int kiInicial;
 
	protected Modo modoActual;
	protected HashMap<String,Modo> listaModos=new HashMap<String,Modo>();
	
	 public Personaje(){
		this.CargaModo(); 
	 } 
	 
	 
	  public void CargaModo(){
		 listaModos.put("KaioKen", new KaioKen());
		 listaModos.put("SuperSayajin",new SuperSayajin());
		 listaModos.put("BooMalo",new BooMalo());
		 listaModos.put("Definitivo",new Definitivo());
		 listaModos.put("BooOriginal",new BooOriginal());
		 listaModos.put("Fortalecido",new Fortalecido());
		 listaModos.put("SegundForma",new Modo());
		 listaModos.put("SemiPerfecto",new SemiPerfecto());
		 
		 listaModos.put("SuperSayajin",new SuperSayajin());
		 listaModos.put("SuperSayajinFase1",new SuperSayajinFase1());
		  
	  }
	  
	  
	public  void cambiarModo(String modo){ 
		
		this.modoActual=listaModos.get(modo);
	}
	
    public  int ataque  (){ 
		
		return (this.modoActual.ataque());
	}
    public  int distanciaAtaque (){ 
		
		return (this.modoActual.distanciaAtaque());
	}
   public  int velocidad(){ 

	return (this.modoActual.velocidad());
     }
   
   public int PuntosVida(){
	   return this.puntosVida;
	   }
   public int kiInicial(){
	   return this.kiInicial;
   }
   
   
}
