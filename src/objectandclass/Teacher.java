package objectandclass;

public class Teacher {
	int t_id;
	String t_name;
	int dept_id;
	void setDetails(int id,String name,int dept) {
		t_id=id;
		t_name=name;
		dept_id=dept;
	}
	void printDetails() {
		System.out.println(t_id+" "+t_name+" "+dept_id);
	}
}
