package constructorconcept;

public class B extends A {
	int rollno;
	String studentName;
	

	
	public B(int roll, String name, int i, String aname) {

		super(i, aname);
		rollno = roll;
		studentName = name;

		System.out.println("From B");
	}

	@Override
	public String toString() {
		return "Abhisek [rollno=" + rollno + ", studentName=" + studentName + ", i=" + i + ", name=" + name + "]";
	}
	
	
}
