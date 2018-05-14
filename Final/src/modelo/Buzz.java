package modelo;

public class Buzz extends Personajes{

	public static final int VIDA_BUZZ = 1;
	public static final String IMAGEN_BUZZ = "";
	public static final int ANCHO_BUZZ = 0;
	public static final int ALTO_BUZZ = 0;
	public static final int SPEED_BUZZ = 2;
	public static final int MUNICION_MAX = 10;
	
	public Buzz(int posX, int posY) {
		super(2, VIDA_BUZZ, IMAGEN_BUZZ, posX, posY, ANCHO_BUZZ, ALTO_BUZZ, SPEED_BUZZ, MUNICION_MAX);

	}

}
