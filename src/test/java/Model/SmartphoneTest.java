package Model;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class SmartphoneTest {

	@Test
	void startRadio() {
		Assertions.assertEquals("Radio started", new Smartphone().startRadio());
	}

	@Test
	void stopRadio() {
		Assertions.assertEquals("Radio stopped", new Smartphone().stopRadio());
	}

	@Test
	void getPosition() {
		Assertions.assertEquals("Köln", new Smartphone().getPosition());
	}

	@Test
	void getManufacturer() {
		Assertions.assertEquals("Huawei", new Smartphone().getManufacturer());
	}

	@Test
	void setManufacturer() {
		Smartphone phone = new Smartphone();
		phone.setManufacturer("Xiamoi");
		Assertions.assertEquals("Xiamoi", phone.getManufacturer());
	}

	@Test
	void getModel() {
		Assertions.assertEquals("P40", new Smartphone().getModel());
	}

	@Test
	void setModel() {
		Smartphone phone = new Smartphone();
		phone.setModel("P30");
		Assertions.assertEquals("P30", phone.getModel());
	}

	@Test
	void getContacts() {
		Assertions.assertEquals(0, new Smartphone().getContacts().size());
	}

	@Test
	void setContacts() {
		Smartphone phone = new Smartphone();
		phone.setContacts(new ArrayList<Contact>() {{
			add(0, new Contact("Max"));
			add(1, new Contact("Moritz"));
		}});
		Assertions.assertEquals("Moritz", phone.getContacts().get(1).getName());
	}

	@Test
	void testToString() {
		Assertions.assertEquals("Smartphone{manufacturer='Huawei', model='P40', contacts=[]}", new Smartphone().toString());
	}
}