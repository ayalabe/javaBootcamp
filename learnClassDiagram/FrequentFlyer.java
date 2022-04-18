package bootcamp.learnClassDiagram;

public class FrequentFlyer {
	
	protected final int FF_NUM;
	protected String firstName;
	protected String lastName;
	protected static int idCount = 0;
	protected MileageCredit credit;
	
	public FrequentFlyer(String firstName, String lastName,MileageCredit credit) {
		FF_NUM = idCount++;
		setFirstName(firstName);
		setLastName(lastName);
		this.credit=credit;
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
