package Algo.Modelo;

import java.util.HashMap;

import Algo.Modelo.enemigos.Cell;
import Algo.Modelo.enemigos.Freezer;
import Algo.Modelo.enemigos.MajinBoo;
import Algo.Modelo.guerrerosz.Goku;
import Algo.Modelo.guerrerosz.Picoro;

public class Equipo {
	private HashMap<String,Personaje> guerreroz;
	private HashMap<String,Personaje> enemigos;
	private HashMap<String,HashMap<String,Personaje>> equipo;
	
	public Equipo(){
		 this.guerreroz= new HashMap<String,Personaje>();
		 this.enemigos=new HashMap<String,Personaje>();
		 this.equipo=new HashMap<String,HashMap<String,Personaje>>();
		 this.cargarEquipo();
	}
	
	public void cargarEnemigos(){
		
		this.enemigos.put("Cell",new Cell());
		this.enemigos.put("MajinBoo",new Freezer());
		this.enemigos.put("Freezer",new MajinBoo() );
	
	}
 public void cargarGuerreros(){
	this.guerreroz.put("Goku",new Goku());
	this.guerreroz.put("Picoro",new Picoro());
	this.guerreroz.put("Freezer",new Freezer() );
 }
	
   public void cargarEquipo(){
	   this.cargarEnemigos();
	   this.cargarGuerreros();
	   this.equipo.put("GuerrerosZ", this.guerreroz);
	   this.equipo.put("EnemigosDeLaTierra", this.enemigos);
   }
   
   public HashMap<String,Personaje> elijoAlEquipo(String unEquipo){
	  return this.equipo.get(unEquipo);
   }
	
}
