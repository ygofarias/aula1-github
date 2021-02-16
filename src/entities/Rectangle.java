package entities;

public class Rectangle {
	public double width, height;
	
	public double Area() {
		return height * width;
	}
	public double Perimeter() {
		return 2*(height + width);
	}
	public double Diagonal(){
		return  Math.sqrt(Math.pow(width, 2)+ Math.pow(height, 2));
	}
	public String toString() {
		return "Area = " 
				+ Area()
				+"\n"
				+"Perimeter = "
				+ Perimeter()
				+"\n"
				+"Diagonal = "
				+ Diagonal();
	}
}
