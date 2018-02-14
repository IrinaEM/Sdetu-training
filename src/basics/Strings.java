package basics;

public class Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//we will learn substring , contains , equalseIgnoreCase
		
		String bookTitle;
		String wordChoice = "Ring";
		
		bookTitle = "The lord of the rings";
		
		
		
		  if (bookTitle.contains(wordChoice)){
			System.out.println("The book contains the word Ring");
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")){
			System.out.println("The browser is chrome");
		}
		
		String firstName="Sebastian";
		String lastName = "Legrand";
		String SSN = "37643865847";
		

		
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.print(SSN.substring(5));
		
	}

}
