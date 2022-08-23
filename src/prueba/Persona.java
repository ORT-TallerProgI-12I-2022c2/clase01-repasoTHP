package prueba;

public class Persona {
	private final String DNI;
	private String nombre;
	private static int cantOjos = 2;
	
	public static void setCantOjos (int cant) {
		Persona.cantOjos = cant;
	}
	
	public Persona(String dNI, String nombre) {
		this.DNI = dNI;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		setCantOjos(4);
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", cantOjos=" + Persona.cantOjos + "]";
	}
	
	
}
