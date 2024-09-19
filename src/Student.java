public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    public void printFullName() {
    	System.out.println(firstName + " " + lastName);
    }
    
    public boolean isApproved() {
    	return grade >=60;
    }
    
    public boolean challengeYearIfApproved() {
    	return grade >=60;
    }
}