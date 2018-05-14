package modelo;

public class Personajes {
	
	private int ID;
	private int vida;
	private String imagen;
	private int posX;
	private int posY;
	private int ancho;
	private int alto;
	private int speed;
	private Arma arma;

	public Personajes(int ID, int vida, String imagen, int posX, int posY, int ancho, int alto, int speed, int municion) {
		this.ID = ID;
		this.vida = vida;
		this.imagen = imagen;
		this.posX = posX;
		this.posY = posY;
		this.ancho = ancho;
		this.alto = alto;
		this.speed =speed;
		arma = new Arma(municion);
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
	
	public void movimientoX(int sentido) {
		posX = posX+(sentido*speed);
	}
	
	public void movimientoY(int sentido) {
		posY = posY+(sentido*speed);
	}

	public void disparar(int ID) {
		arma.disparar(ID, (posX + ancho), posY);
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
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

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	
}
