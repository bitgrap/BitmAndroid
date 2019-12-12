package OneToOneRelation;

public class OneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st1 = new Student();
		st1.setFirstName("MD");
		st1.setMiddleName("Koishik");
		st1.setLastName("Ahmed");
		 
		StudentAddress stAddress = new StudentAddress();
		stAddress.setHouseNum(24);
		stAddress.setRoadNum(12);
		stAddress.setThana("Mirpur");
		stAddress.setZipCode("1206");
		
		st1.setStudentAddress(stAddress);
		
		st1.getStudentAddress().getThana();
	}

}
