package es.studium.poo;

public class Perro
{

	// ATRIBUTOS
	
	private Raza raza;
	private float tamano;
	private int edad;
	private String color;
	
	// CONSTRUCTOR VACÍO
	
	public Perro() {
		raza = new Raza();
		tamano = 0.0f;
		edad = 0;
		color = "";
	}
	
	// CONSTRUCTOR POR PARÁMETROS
	/* Source -> Generate Constructor using Fields... */

	public Perro(Raza raza, float tamano, int edad, String color)
	{
		this.raza = raza;
		this.tamano = tamano;
		this.edad = edad;
		this.color = color;
	}
	
	// GETTERS AND SETTERS

	public Raza getRaza()
	{
		return raza;
	}

	public void setRaza(Raza raza)
	{
		this.raza = raza;
	}

	public float getTamano()
	{
		return tamano;
	}

	public void setTamano(float tamano)
	{
		this.tamano = tamano;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}
	
	// MÉTODO ToString

	@Override
	public String toString()
	{
		return "Perro [raza=" + raza + ", tamano=" + tamano + ", edad=" + edad + ", color=" + color + "]";
	}
	 

	
	
	
	
}
