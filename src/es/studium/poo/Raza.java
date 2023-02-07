package es.studium.poo;

public class Raza
{
	// ATRIBUTOS
	
	private String nombreRaza;
	
	// CONSTRUCTOR VAC�O
	
	public Raza() {
		nombreRaza ="";
	}

	// CONSTRUCTOR POR PAR�METROS
	/* Source -> Generate Constructor using Fields... */
	
	public Raza(String nombreRaza)
	{
		this.nombreRaza = nombreRaza;
	}

	// GETTERS AND SETTERS
	
	public String getNombreRaza()
	{
		return nombreRaza;
	}

	public void setNombreRaza(String nombreRaza)
	{
		this.nombreRaza = nombreRaza;
	}

	// M�TODO ToString
	
	@Override
	public String toString()
	{
		return "Raza [nombreRaza=" + nombreRaza + "]";
	}

	
}
