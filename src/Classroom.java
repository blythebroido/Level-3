import java.util.ArrayList;

public class Classroom {
	ArrayList<Student> nerds = new ArrayList<Student>();
	
	public void addStudent(Student s){
		nerds.add(s);
	}
	
	int getAverageIQ(){
		int total = 0;
		
		for(Student s: nerds){
			total = total + s.IQ;
		}
		return total/nerds.size();
	}
	
}