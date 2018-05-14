package modelo;

public class Zurg extends Personajes{

	public static final int VIDA_ZURG = 100;
	public static final String IMAGEN_ZURG = "";
	public static final int ANCHO_ZURG = 0;
	public static final int ALTO_ZURG = 0;
	public static final int SPEED_ZURG = 5;
	
	public Zurg(int posX, int posY) {
		super(2, VIDA_ZURG, IMAGEN_ZURG, posX, posY, ANCHO_ZURG, ALTO_ZURG, SPEED_ZURG, -1);

	}

}
