package interview;

public final class ImutableClass {
	// declare class as final
	// make instance variable as private
	// provide only setter method
	private String firstName;
	private String LastName;

	public ImutableClass(String firstName, String lastName) {
		this.firstName = firstName;
		this.LastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return LastName;

	}

}
