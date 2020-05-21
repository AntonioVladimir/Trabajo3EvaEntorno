import java.util.ArrayList;

public class AppWeb {

	private String nombre;
	public String[] Admin = {};
	public ArrayList<String> User = new ArrayList<String>();
	public Register register;
	public ArrayList<String> Chat = new ArrayList<String>();
	public ArrayList<String> Server = new ArrayList<String>();

	@SuppressWarnings("unused")
	private void changeHost() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}