package Model;

public class Contact {
	private String name;

	public String getName() {
		return name;
	}
	public Contact(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Contact{" +
				"name='" + name + '\'' +
				'}';
	}
}
