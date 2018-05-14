package modelo;

public class Frisby extends Objetos implements Obtaculos{

	public static final String IMAGEN_FRISBY = "";
	public static final int ANCHO_FRISBY = 0;
	public static final int ALTO_FRISBY = 0;
	public static final int SPEED_FRISBY = 5;

	public Frisby(int ID, int posX, int posY) {
		super(ID, IMAGEN_FRISBY, posX, posY, ANCHO_FRISBY, ALTO_FRISBY, SPEED_FRISBY);

	}
	@Override
	public void movimiento(int sentido) {
		movimientoX(sentido);
		movimientoY(sentido);
	}
	@Override
	public void aplicarEfecto(Personajes j) {
		
		j.setVida(j.getVida()-1);
		
	}

}
