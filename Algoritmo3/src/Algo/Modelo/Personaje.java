package Algo.Modelo;

import java.util.HashMap;

import Algo.Modelo.modo.KaioKen;
import Algo.Modelo.modo.SuperSayajin;

public abstract class Personaje {
	
	
	protected Modo modoActual;
	protected HashMap<String,Modo> listaModos=new HashMap<String,Modo>();
	
	 public Personaje(){
		this.CargaModo(); 
	 } 
	 
	 
	  public void CargaModo(){
		 listaModos.put("KaioKen", new KaioKen());
		 listaModos.put("Supersaiayin",new SuperSayajin());
	  }
	  
	  
	public  void cambiarModo(String modo){ 
		
		this.modoActual=listaModos.get(modo);
	};
public  String atacar  (){ 
		
		return (this.modoActual.atacar());
	}
}
