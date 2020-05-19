
public class Admin extends User {
	private String name;
	char rank;

	@SuppressWarnings("unused")
	private void editAppWeb() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
