public class Register {
	private String id;

	public AppWeb aw;
	private User have;

	@SuppressWarnings("unused")
	private boolean meetTheRequirements() {
		return false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getHave() {
		return have;
	}

	public void setHave(User have) {
		this.have = have;
	}
}
