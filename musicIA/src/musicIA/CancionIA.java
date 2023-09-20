package musicIA;

public class CancionIA {
	
	String cancion;
	LetraIA letra;
	String genero;
	
	public CancionIA (LetraIA pletra, String pgenero) {
		letra=pletra;
		genero=pgenero;
		
		cancion = "Reproduciendo canción con letra " + letra.letra + " y género " + genero;
		System.out.println(cancion);
	}
	public void agregarGenero(String genero2) {
		cancion = "Reproduciendo canción con letra " + letra.letra + " y género " + genero + " y " + genero2;
		System.out.println(cancion);
	}

}
