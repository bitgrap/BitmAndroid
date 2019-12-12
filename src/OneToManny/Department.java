package OneToManny;

import java.util.ArrayList;

public class Department {
	private String name;
	private String location;
	private ArrayList<Course> coursesList ;
	
	public void setCourse (ArrayList<Course> coursesList) {
		this.coursesList = coursesList;		
	}
	public ArrayList<Course> getCourses(){
		return coursesList;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}
