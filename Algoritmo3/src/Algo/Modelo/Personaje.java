package Algo.Modelo;

import java.util.HashMap;

import Algo.Modelo.modo.KaioKen;
import Algo.Modelo.modo.SuperSayajin;

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
