package Algo.Modelo;

import java.util.HashMap;

import Algo.Modelo.enemigos.Freezer;
import Algo.Modelo.guerrerosz.Goku;
import Algo.Modelo.guerrerosz.Picoro;

public class CargaGuerreroZ {
	private HashMap<String,Personaje> diccionarioGuerreroz;
	
	
	public CargaGuerreroZ(){
		 this.diccionarioGuerreroz= new HashMap<String,Personaje>();
	}
	
	public HashMap<String,Personaje> cargar(){
		
		this.diccionarioGuerreroz.put("Goku",new Goku());
		this.diccionarioGuerreroz.put("Picoro",new Picoro());
		this.diccionarioGuerreroz.put("Freezer",new Freezer() );
	
		return this.diccionarioGuerreroz;
			
	}
	
	public Boolean soyUnGuerreroZ(String unGuerrero){
		return true;
		
		
	}
	
	
	}
