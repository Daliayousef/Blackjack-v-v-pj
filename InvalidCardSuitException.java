public class InvalidCardSuitException extends Exception {

	private char suitIdentifier = '?';

	public InvalidCardSuitException (char invalidSuit) {

		suitIdentifier = invalidSuit;

		System.out.println("Invalid suit" + " " + invalidSuit);
	}

	private InvalidCardSuitException() {
		System.out.println("Invalid suit");
	}
	
	public String toString(){

		return ("Attempted to create card with invalid suit argument" + " " + this.suitIdentifier);

	}
	
	public char getSuitDesignator() {
		
		return suitIdentifier;
	}
} //End class
InvalidCardValueException.java
public class InvalidCardValueException extends Exception
{
	private int valueIdentifier = 0;

	public InvalidCardValueException(int invalidValue) {

		valueIdentifier = invalidValue;

		System.out.println("Invalid value " + invalidValue);
	}

	private InvalidCardValueException() {


		System.out.println("Invalid value");
	}

	public String toString() {
		

		return ("Attempted to create card with invalid suit argument" + " " + this.valueIdentifier);
	}

	public int getValue() {
		
		return valueIdentifier;
	}

} //End class
