//inside package org.cvtc.shapes
package org.cvtc.shapes;

//imports scanner
import java.util.Scanner;

//class is public - extends the class of Shape
public class Sphere extends Shape {
	
	public float radius;
	
	//sets up new scanner (in) to scan for float 
	Scanner in = new Scanner(System.in);
	
	//overload constructor
	public Sphere (float radius){
	
	  this.radius = radius;
	  
	}
	
	//getter method for radius
	public float getRadius() {
	
	 return radius;
	 
	}
	
	//setter method for radius
	public void setRadius(float radius){
	
	    this.radius = radius; 
	
	}
	
	@Override 
	public float surfaceArea() {
			
		//returns surface area of a sphere 
	    return (float) (4 * Math.PI * Math.pow(getRadius(), 2));
	
	} 
	
	@Override
	public float volume(){
			
		//returns volume of a sphere
	    return (float) ((4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3));
	
	}
	
	@Override 
	public void render() {
	
		//system sends output to the console, out provides methods to send output
		//print writes characters to the screen
		System.out.println("Please enter the sphere's radius: ");
						
		//scanner (if successful) scans the next float
		float radius = in.nextFloat();
					
		//code to operate while the radius is less than 0
		while (radius < 0) {
							
			//system sends output to the console, out provides methods to send output
			//print writes characters to the screen
			System.out.println("Please enter a number greater than zero.");
					
			//scanner (if successful) scans the next float
			radius = in.nextFloat();
							
		}	//end while bracket
						
		//system sends output to the console, out provides methods to send output
		//print writes characters to the screen
		System.out.println("The surface area of this sphere is: " + surfaceArea());		
						
		//system sends output to the console, out provides methods to send output
		//print writes characters to the screen
		System.out.println("The volume of this sphere is: " + volume());				
						
	}

}