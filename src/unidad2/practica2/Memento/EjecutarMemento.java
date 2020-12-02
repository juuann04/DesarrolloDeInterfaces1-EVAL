package unidad2.practica2.Memento;

public class EjecutarMemento {
	public static void main(String[] args) {
		// CREAR EL OBJETO ORIGINAL CREADOR
		Originator creador = new Originator("Pedro", "Gil Mena");

		// CREAR EL OBJETO GESTOR/VIGILANTE DEL MEMENTO
		Caretaker vigilante = new Caretaker();

		// CREAR EL MEMENTO Y ASOCIARLO AL OBJETO GESTOR
		vigilante.setMemento(creador.createMemento());

		// MOSTRAR LOS DATOS DEL OBJETO
		System.out.println("Nombre completo: [" + creador.getNombre() + " " + creador.getApellidos() + "]");

		// MODIFICAR LOS DATOS DEL OBJETO
		creador.setNombre("María");
		creador.setApellidos("Mora Miró");

		// MOSTRAR LOS DATOS DEL OBJETO
		System.out.println("Nombre completo: [" + creador.getNombre() + " " + creador.getApellidos() + "]");

		// RESTAURAR LOS DATOS DEL OBJETO
		creador.setMemento(vigilante.getMemento());

		// MOSTRAR LOS DATOS DEL OBJETO
		System.out.println("Nombre completo: [" + creador.getNombre() + " " + creador.getApellidos() + "]");
	}
}