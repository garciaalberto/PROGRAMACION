package tarjetaUsuario;

public class TarjetaUsuario {

	// Variables privadas
	private String id;
	private Boolean activada;
	
	// Constructores
	public TarjetaUsuario() {
	}
	
	public TarjetaUsuario(String id, Boolean activada) {
		this.id = id;
		this.activada = activada;
	}
	
	
	// Setters y Getters
	public String getId() {
		return id;
	}
	
	public Boolean isActivada() {
		return activada;
	}
	
}
