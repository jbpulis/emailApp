package emailapp;

public class emailApp {

	public static void main(String[] args) {
		email em1 = new email("John", "Smith");

		em1.setAlternateEmail("new@email.com");
		System.out.println("Alternate email: " + em1.getAlternateEmail());
		
	}

}
