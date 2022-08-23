package prueba;

public class Principal {
	
	public static void main(String[] args) {
		Persona profeDeP1 = new Persona("1234","Carlos Cimino");
		Persona profeDeTP1 = profeDeP1;

		System.out.println(profeDeP1);
		System.out.println(profeDeTP1);
		
		profeDeTP1.setNombre("Max Power");
		
		System.out.println(profeDeTP1);
		System.out.println(profeDeP1); // ¿Max Power o Carlos Cimino?
		
		System.out.println(profeDeP1.hashCode());
		System.out.println(profeDeTP1.hashCode());

		System.out.println(Integer.toHexString(profeDeP1.hashCode()));
	}

}
