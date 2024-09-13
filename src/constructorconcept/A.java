package constructorconcept;

public class A {

	int i;
	String name;

	public A(int id,String sname) {
		i=id;
		name=sname;
		System.out.println("From A");
	}

	public void m1() {

		System.out.println("From m1 method");
	}

}
