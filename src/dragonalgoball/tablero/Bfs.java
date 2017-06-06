package dragonalgoball.tablero;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Bfs {

	private Queue<Nodo> cola;
	private List<Celda> visitados;
	
	public Bfs(){
		cola = new LinkedList<Nodo>();
		visitados = new ArrayList<Celda>();
	}
	
	public int obtenerDistancia(Celda posInicial, Celda posFinal){
		Nodo unNodo = new Nodo(posInicial, 0);
		this.encolarAdyacentes(unNodo);
		while (!cola.isEmpty()){
			unNodo = cola.poll();
			if (unNodo.obtenerCelda() == posFinal){
				break;
			}
			this.encolarAdyacentes(unNodo);
		}
		return unNodo.obtenerDistancia();
	}
	
	public void encolarAdyacentes(Nodo unNodo){
		Celda celda = unNodo.obtenerCelda();
		List<Celda> adyacentes = celda.obtenerAdyacentes();
		for (int i = 0; i < celda.cantidadAdyacentes(); i++){
			if (celda.esta_vacia()){
				visitados.add(adyacentes.get(i));
				cola.offer(new Nodo(adyacentes.get(i), unNodo.obtenerDistancia() + 1));
			}
		}
		
	}
}