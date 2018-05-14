package modelo;

import java.util.Random;

public class Objetos {
	
	private int ID;
	private String imagen;
	private int posX;
	private int posY;
	private int ancho;
	private int alto;
	private int speed;
	private Objetos siguiente;
	private Objetos anterior;
	
	
	public Objetos(int ID,String imagen, int posX, int posY, int ancho, int alto, int speed) {
		
		this.ID = ID;
		this.imagen = imagen;
		this.posX = posX;
		this.posY = posY;
		this.ancho = ancho;
		this.alto = alto;
		this.speed =speed;
		this.siguiente = null;
		this.anterior = null;
	}
	
	public boolean zonaSenible(int x, int y) {
		boolean is = false;
		int xmax = posX + ancho;
		int ymax = posY + alto;
		if(x<xmax && x<posX) {
			if(y<ymax && x<posY)
				is = true;
		}
		else {
		}
		return is;
	}
	
	public void movimiento(int sentido) {
		
	}
	
	public void movimientoX(int sentido) {
		posX = posX+(sentido*speed);
	}
	
	public void movimientoY(int sentido) {
		Random a = new Random();
		posY = posY+(sentido*(a.nextInt(2)+1));
	}
	
// Getters and Setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	public Objetos getSiguiente() {
		return siguiente;
	}

	
	public void setSiguiente(Objetos siguiente) {
		this.siguiente = siguiente;
	}

	
	public Objetos getAnterior() {
		return anterior;
	}

	
	public void setAnterior(Objetos anterior) {
		this.anterior = anterior;
	}
	
	
}
