package Model;

public class Friend extends Contact {
	private long phoneNumber;
	private static final String NAME = "Friend";

	public Friend(String name, long phoneNumber) {
		super(name);
		this.phoneNumber = phoneNumber;
	}

	public Friend() {
		super(NAME);
		this.phoneNumber = 491730000000L;
	}

	@Override
	public String toString() {
		return "Friend{" +
				"phoneNumber=" + phoneNumber +
				"} " + super.toString();
	}
}
