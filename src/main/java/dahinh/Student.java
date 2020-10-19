package dahinh;

public class Student {
	private int studentID;
	private String studentName;

	public Student() {

	}

	public Student(int ma, String ten) {
		this.studentID = ma;
		this.studentName = ten;

	}

	public Student(int maHV) {
		this.studentID = maHV;
	}

	public Student(String tenHV) {
		this.studentName = tenHV;
	}
}
