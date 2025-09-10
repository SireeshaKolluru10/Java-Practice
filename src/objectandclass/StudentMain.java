package objectandclass;

public class StudentMain {

	public static void main(String[] args) {
		Student s=new Student();
		Student s1=new Student();
		s.stuid=001;
		s.stuname="kevin";
		s.grade='A';
		s.studentDetails();
		s1.stuid=002;
		s1.stuname="peter";
		s1.grade='A';
		s1.studentDetails();
		
		
	}

}
