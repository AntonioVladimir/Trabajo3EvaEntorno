
public class Chat {
	private String name;
	int roomNumber;
	private int capacity;

	@SuppressWarnings("unused")
	private boolean Open() {
		return false;
	}

	public boolean Start() {
		return false;
	}

	public void CreateGroup() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
