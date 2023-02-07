package es.studium.poo;

public class Principal
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Raza raza1 = new Raza("Dálmata");
		Perro perro1 = new Perro(raza1, 1.2f, 10, "Blanco y negro");
		System.out.println("El perro de raza " + perro1.getRaza().getNombreRaza() + ", tiene un tamaño de "
				+ perro1.getTamano() + "metros, tiene " + perro1.getEdad() + " años y es de color " + perro1.getColor());
	
		// USANDO ToString:
		System.out.println(perro1.toString());
	}

}
