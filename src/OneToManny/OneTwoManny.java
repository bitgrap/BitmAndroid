package OneToManny;

import java.util.ArrayList;

public class OneTwoManny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department dp1 = new Department();
		dp1.setName("CSE");
		dp1.setLocation("Buiding 2");
		
		Course course1 = new Course();
		course1.setCourseName("Computer Fandamental");
		course1.setCourseCode("CSE 101");
		course1.setCourseCredit("3.00");
		Course course2 = new Course();
		course2.setCourseName("Computer Programing");
		course2.setCourseCode("CSE 201");
		course2.setCourseCredit("3.00");
		
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		
		dp1.setCourse(courses);
	}

}
