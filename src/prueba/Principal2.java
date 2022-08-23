package prueba;

public class Principal2 {
	public static void main(String[] args) {

		Persona p1 = new Persona("1234","Pepe");
		Persona p2 = new Persona("23432","Ana");
		Persona p3 = new Persona("234543","Maria");
		Persona p4 = new Persona("4654235","Luis");
		
		Persona.setCantOjos(3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		p1.setCantOjos(4);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}
}
