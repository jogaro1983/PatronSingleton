package com.singleton;

public class Persona 
{
	private static String nombre;
	private static Persona persona = null;
		
	private Persona(){}
	
	public static Persona getInstance()
	{
		if(persona == null)
		{
			persona = new Persona();
		}
		
		return persona;
	}

	private static String getNombre() {
		return nombre;
	}

	private static void setNombre(String nombre) {
		Persona.nombre = nombre;
	}
	
	
	
}
