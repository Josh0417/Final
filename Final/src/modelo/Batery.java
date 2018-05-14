package modelo;

public class Batery extends Objetos implements Ventajas{

	public static final String IMAGEN_BATERY = "";
	public static final int ANCHO_BATERY = 0;
	public static final int ALTO_BATERY = 0;
	public static final int SPEED_BATERY = 4;

	public Batery(int ID, int posX, int posY) {
		
		super(ID, IMAGEN_BATERY, posX, posY, ANCHO_BATERY, ALTO_BATERY, SPEED_BATERY);

	}
	@Override
	public void movimiento(int sentido) {
		movimientoX(sentido);
	}{

}
	@Override
	public void aplicarEfecto(Personajes j) {
		
		j.getArma().setMunicion(Buzz.MUNICION_MAX);
		
	}
}
