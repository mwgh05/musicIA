package defecto;
import musicIA.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LetraIA letra1 = new LetraIA("Hola mundo");
		CancionIA cancion1 = new CancionIA(letra1, "Metal");
		cancion1.agregarGenero("Salsa");
		
		
		
	}
}
