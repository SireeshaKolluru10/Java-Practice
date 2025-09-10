package objectandclass;

public class TeacherMain {

	public static void main(String[] args) {
		Teacher t=new Teacher();
		Teacher t1=new Teacher();
		t.setDetails(1,"Asena",111);
		t.printDetails();
		t1.setDetails(2,"Serra",112);
		t1.printDetails();
	}

}
