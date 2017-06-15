public class testClassroom {
	public static void main(String[] args) {
		Classroom c = new Classroom();

		for (int i = 0; i < 100; i++) {
			c.addStudent(new Student(i*10000000, "Jim"));
		}
		System.out.println(c.getAverageIQ());
	}
}
