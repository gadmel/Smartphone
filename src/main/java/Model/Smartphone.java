package Model;

import Interfaces.Radio;
import Interfaces.GPS;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Radio, GPS {

	private String manufacturer;
	private String model;
	private List<Contact> contacts;



	public String startRadio() {
		return "Radio started";
	}
	public String stopRadio() {
		return "Radio stopped";
	}
	public String getPosition() {
		return "Köln";
	}

	public Smartphone() {
		this.manufacturer = "Huawei";
		this.model = "P40";
		this.contacts = new ArrayList<Contact>();
	}

	public Smartphone(String manufacturer, String model, ArrayList<Contact> contacts) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.contacts = contacts;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}


	@Override
	public String toString() {
		return "Smartphone{" +
				"manufacturer='" + manufacturer + '\'' +
				", model='" + model + '\'' +
				", contacts=" + contacts +
				'}';
	}

}
