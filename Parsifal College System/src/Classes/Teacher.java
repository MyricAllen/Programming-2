package Classes;

public class Teacher extends Individual {

	public Teacher(final String Firstname, final String Surname) {
		super(Firstname, Surname);
		// TODO Auto-generated constructor stub
	}

	private String Classhead;
	private String Department;
	private String ContactNo;
	
	public String Classhead() {
		return this.Classhead;
		
	}
	
	public String Department() {
		return this.Department;
	}
	
	public String ContactNo() {
		return this.ContactNo;
	}
}
