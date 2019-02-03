//inside package org.cvtc.shapes
package org.cvtc.shapes;

//imports scanner
import java.util.Scanner;

//class is public - extends the class of Shape
public class Cylinder extends Shape {

	public float radius;
	public float height;
	
	//sets up new scanner (in) to scan for float 
	Scanner in = new Scanner(System.in);
	
	//overload constructor accepting radius and height parameters 
	public Cylinder (float radius, float height){
	
	  this.radius = radius;
	  this.height = height;
	  
	}
	
	//getter method for radius
	public float getRadius() {
	
	 return radius;
	 
	}
	
	//setter method for radius
	public void setRadius(float radius){
	
		//active element assigned to radius
	    this.radius = radius; 
	
	}
	
	//getter method for height
	public float getHeight() {
	
	 return height;
	 
	}
	
	//setter method for height
	public void setHeight(float height){
	
	    this.height = height; 
	
	}
	
	@Override 
	public float surfaceArea() {
	
		//returns the surface area of a cylinder
	    return (float) (2 * Math.PI * getRadius() * getHeight() + 2 * Math.PI * Math.pow(getRadius(), 2));
	
	} 
	
	@Override
	public float volume(){
			
		//returns the volume of a cylinder
	    return (float) (Math.PI * Math.pow(getRadius(), 2) * getHeight());
	
	}
	
	@Override 
	public void render() {
	
		//system sends output to the console, out provides methods to send output
		//print writes characters to the screen
		System.out.println("Please enter the cylinder's radius: ");
				
		//scanner (if successful) scans the next float
		float radius = in.nextFloat();
				
		//code to operate while the radius is less than 0
		while (radius < 0) {
			
			//system sends output to the console, out provides methods to send output
			//print writes characters to the screen
			System.out.println("Please enter a number greater than zero");
					
			//scanner (if successful) scans the next float
			radius = in.nextFloat();
						
		} //end while bracket
			
		//system sends output to the console, out provides methods to send output
		//print writes characters to the screen
		System.out.println("Please enter the cylinder's height: ");
				
		//scanner (if successful) scans the next float
		float height = in.nextFloat();
					
		//code to operate while the height is less than 0
		while (height < 0) {
					
			//system sends output to the console, out provides methods to send output
			//print writes characters to the screen			
			System.out.println("Please enter a number greater than zero");
					
			//scanner (if successful) scans the next float
			height = in.nextFloat();	

		} //closing bracket to while 

		//system sends output to the console, out provides methods to send output
		//print writes characters to the screen
		System.out.println("The surface area of the cylinder is: " + surfaceArea());	
				
		//system sends output to the console, out provides methods to send output
		//print writes characters to the screen
		System.out.println("The volume of the cylinder is: " + volume());	
	
	}

}