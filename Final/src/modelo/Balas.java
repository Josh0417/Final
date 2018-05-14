package modelo;

public class Balas extends Objetos implements Obtaculos{

	public static final String IMAGEN_BALAS = "";
	public static final int ANCHO_BALAS = 0;
	public static final int ALTO_BALAS = 0;
	public static final int SPEED_BALAS = 3;

	public Balas(int ID, int posX, int posY) {
		super(ID, IMAGEN_BALAS, posX, posY, ANCHO_BALAS, ALTO_BALAS, SPEED_BALAS);

	}
	@Override
	public void movimiento(int sentido) {
		movimientoX(sentido);
	}
	@Override
	public void aplicarEfecto(Personajes j) {
		
		j.setVida(j.getVida()-1);
		
	}
	
}
