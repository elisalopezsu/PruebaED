package es.studium.poo;

public class Raza
{
	// ATRIBUTOS
	
	private String nombreRaza;
	
	// CONSTRUCTOR VACÍO
	
	public Raza() {
		nombreRaza ="";
	}

	// CONSTRUCTOR POR PARÁMETROS
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

	// MÉTODO ToString
	
	@Override
	public String toString()
	{
		return "Raza [nombreRaza=" + nombreRaza + "]";
	}

	
}
