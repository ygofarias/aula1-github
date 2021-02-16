package entities;

public class Student {
	public String name;
	public double grades1;
	public double grades2;
	public double grades3;
	
	public double finalGrades() {
		return grades1 + grades2 + grades3;
	}
	public double missinPoints() {
		if(finalGrades() < 60) {
			return 60 - finalGrades();
		}
		else{
			return 0.0;
		}
			
	}
}
