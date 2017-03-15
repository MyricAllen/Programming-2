package Classes;

public class Booking {

	
	private final Student student;
	private boolean studentPaid;
	private boolean studentAuthorized;
	
	public Booking(final Student student) {
		this.student = student;
	}
	
	public boolean hasStudentPaid() {
		return this.studentPaid;
		
	}
	
	public void setStudentPaid(final boolean haspaid) {
		this.studentPaid = haspaid;
	}
	
	public boolean studentAuthorized() {
		return this.studentAuthorized;
	}
	
	public void setStudentAuthorized(final boolean hasauthorized) {
		this.studentAuthorized = hasauthorized;
	}
}
