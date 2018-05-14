package modelo;

import java.util.ArrayList;
import java.util.List;

public class Arma {
	
	private Balas disparos;
	private int municion;
	private int size;
	private Balas cola;

	
	public Arma(int municion) {
		
		disparos =null;
		cola = null;
		this.municion = municion;
		size=0;
	}
	
	private boolean tieneMunicion() {
		boolean r = false;
		if(municion == -1)
			r = true;
		else {
			if(municion != 0)
				r = true;
		}
		return r;
	}
	
	private void crearDisparo(int ID, int x, int y) {
		Balas b = new Balas(ID, x, y);
		if(disparos == null) {
			disparos = b;
			cola = b;
		}
		else {
			Balas temp = cola;
			cola = b;
			temp.setSiguiente(cola);
		}
		cola.setSiguiente(disparos);
		disparos.setAnterior(cola);
		size++;
	}
	
	public void disparar(int ID, int x, int y) {
		 
		 if(tieneMunicion()) {
		 crearDisparo(ID, x, y);
		 }
		 
	 }

	
	public Balas getDisparos() {
		return disparos;
	}
	
	public void eliminar(int ID) {
		Balas temp = disparos;
		boolean e =true;
		for (int i = 0; i < size && e; i++) {
			if(temp.getID() == ID) {
				e = !e;
				temp.getAnterior().setSiguiente(temp.getSiguiente());
			}
			else {
				temp = (Balas) temp.getSiguiente();
			}
		}
	}
	
	public void setDisparos(Balas disparos) {
		this.disparos = disparos;
	}

	public int getMunicion() {
		return municion;
	}

	public void setMunicion(int municion) {
		this.municion = municion;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	 
	 
}
