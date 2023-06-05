package tutorial1;

public class StudentCompareClass implements Comparable<StudentCompareClass> {
	private String name;
	
	public StudentCompareClass(String name) {
		this.name=name;
	}
	public boolean equals(StudentCompareClass other) {
		if (this.name==other.name) {
			return true;
		} else {
			return false;
		}
	}
	public int compareTo(StudentCompareClass other) {
		return this.name.compareTo(other.name);
	}

}
