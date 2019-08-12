package models;

public class Persona {
	private String nombre;
	private String apellido;
	private Integer dni;
	private String tipoDni;
	
	public Persona() {
	}

	public Persona(String nombre, String apellido, Integer dni, String tipoDni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.tipoDni = tipoDni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getTipoDni() {
		return tipoDni;
	}

	public void setTipoDni(String tipoDni) {
		this.tipoDni = tipoDni;
	}
	
}
