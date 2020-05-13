
public class Profile {
	private String nickName;
	private int connectingTimeMin;
	private char rank;
	private int wallet;
	private int xp;
	private int money;
	private Profile profile;

	public void UpgradeRank() {

	}

	public void LevelUp() {

	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getConnectingTimeMin() {
		return connectingTimeMin;
	}

	public void setConnectingTimeMin(int connectingTimeMin) {
		this.connectingTimeMin = connectingTimeMin;
	}

	public char getRank() {
		return rank;
	}

	public void setRank(char rank) {
		this.rank = rank;
	}

	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
}
