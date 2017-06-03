package Algo.Modelo;

import java.util.HashMap;

import Algo.Modelo.enemigos.Cell;
import Algo.Modelo.enemigos.Freezer;
import Algo.Modelo.enemigos.MajinBoo;
 

public class CargaEnemigos {
	
private HashMap<String,Personaje> enemigos;
	
	
	public CargaEnemigos(){
		 this.enemigos= new HashMap<String,Personaje>();
	}
	
	public HashMap<String,Personaje> cargar(){
		
		this.enemigos.put("Cell",new Cell());
		this.enemigos.put("MajinBoo",new Freezer());
		this.enemigos.put("Freezer",new MajinBoo() );
	
		return this.enemigos;
			
	}
	
	public Boolean soyUnEnemigo(String unGuerrero){
		return true;
		
		
	}

}
