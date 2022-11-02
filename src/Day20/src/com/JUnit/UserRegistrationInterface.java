package Day20.src.com.JUnit;

@FunctionalInterface
public interface UserRegistrationInterface {
	public abstract boolean userEntries(String value) throws InvalidUserInputException;
}
