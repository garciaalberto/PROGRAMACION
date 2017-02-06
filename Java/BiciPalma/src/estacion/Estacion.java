package estacion;

public class Estacion {

	// Variables privadas
	private int id;
	private String direccion;
	private int numeroAnclajes;
	private int[] anclajes;
	
	// Constructores
	public Estacion(){
		
	}
	
	public Estacion(int id, String direccion, int numeroAnclajes){
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
	}
	
	// Setters y Getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumeroAnclajes() {
		return numeroAnclajes;
	}
	public void setNumeroAnclajes(int numeroAnclajes) {
		this.numeroAnclajes = numeroAnclajes;
	}
	public int[] getAnclajes() {
		return anclajes;
	}
	public void setAnclajes(int[] anclajes) {
		this.anclajes = anclajes;
	}
	
	// Métodos
	public void consultarEstacion(){
		System.out.println("ID: " + getId());
		System.out.println("Direccion: " + getDireccion());
		System.out.println("Número de anclaje: " + getNumeroAnclajes());
	}
}
