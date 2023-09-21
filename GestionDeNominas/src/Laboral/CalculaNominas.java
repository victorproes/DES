package Laboral;

public class CalculaNominas  {

	public static void main(String[] args) {
		try {
			// ESTE DA TODO BIEN
			Empleado e1 = new Empleado("James Cosling", "M", "32000032G", 4, 7);
			Empleado e2 = new Empleado("Ada Lovelace", "32000031R", "F");
			escribe(e1);
			escribe(e2);

			e2.incrAnyo();
			e1.setCategoria(9);

			System.out.println("Modificacion");
			escribe(e1);
			escribe(e2);
			
			// DA ERROR PORQUE LA CATEGORIA TIENE QUE SER ENTRE 0 Y 10 Y EL AÑO NO PUEDE SER NEGATIVO
			/*Empleado e3 = new Empleado("James Cosling", "M", "32000032G", 11, -1);
			Empleado e3 = new Empleado("James Cosling", "M", "32000032G", 5, -1);

			escribe(e3);*/
			

		} catch (DatosNoCorrectoExcpetion e) {
			System.out.println(e);
		}

	}

	private static void escribe(Empleado e1) {
		e1.imprime();
		System.out.println("Sueldo:" + Nomina.sueldo(e1));
		System.out.println("---------------------------------------------");

	}

}
