package emailapp;

public class emailApp {

	public static void main(String[] args) {
		email em1 = new email("John", "Smith");
		System.out.println(em1.showInfo());

		//em1.setAlternateEmail("new@email.com");
		//System.out.println("Alternate email: " + em1.getAlternateEmail());
		
	}

}
