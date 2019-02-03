//inside package org.cvtc.shapes
package org.cvtc.shapes;

//imports scanner
import java.util.Scanner;

//cuboid is a public class extending shape
public class Cuboid extends Shape {

	public float width;
	public float height;
	public float depth;
	
	//sets up new scanner (in) to scan for float 
	Scanner in = new Scanner(System.in);
	
	//overload constructor taking in width, height, depth as parameters
	public Cuboid (float width, float height, float depth){
	
	  this.width = width;
	  this.height = height;
	  this.depth = depth;
	  	  
	}
 
	//getter method for width 
	public float getWidth() {
	
	 return width;
	 
	}
	
	//setter method for width
	public void setWidth(float width){
		
		//active element = width
	    this.width = width; 
	
	}
	
	//getter method for height 
	public float getHeight() {
	
	 return height;
	 
	}
	
	//setter method for height
	public void setHeight(float height){
	
		//active element = height
	    this.height = height; 
	
	}
	
	//getter method for depth 
	public float getDepth() {
	
	 return depth;
	 
	}
	
	//setter method for depth
	public void setDepth(float depth){
	
		//active element = depth
	    this.depth = depth; 
	
	}
	
	@Override 
	public float surfaceArea() {
	
		//returns cuboid surface area: 2* depth * width
	    return 2 * getDepth() * getWidth();
	
	} 
	
	@Override
	public float volume(){
	
		//returns volume of a cube: height * width * depth 
	    return getHeight() * getWidth() * getDepth();
	
	}
	
	@Override 
	public void render() {
	
		//system sends output to the console, out provides methods to send output
		//print writes characters to the screen
		System.out.println("Please enter the cuboid's height: ");
		
		//scanner (if successful) scans the next float
		float height = in.nextFloat();
		
		//code to operate while the length is less than 0
		while (height < 0) {
			
			//system sends output to the console, out provides methods to send output
			//print writes characters to the screen
			System.out.println("Please enter a number greater than zero");
			
			//scanner (if successful) scans the next float
			height = in.nextFloat();
			
		} //closing while bracket
		
		//system sends output to the console, out provides methods to send output
		//print writes characters to the screen
		System.out.println("Please enter the cuboid's width: ");
		
		//scanner (if successful) scans the next float
		float width = in.nextFloat();
		
		//code to operate while the width is less than 0
		while (width < 0) {

			//system sends output to the console, out provides methods to send output
			//print writes characters to the screen
			System.out.println("Please enter a number greater than zero");
			
			//scanner (if successful) scans the next float
			width = in.nextFloat();
			
		} //closing while bracket
		
		//system sends output to the console, out provides methods to send output
		//print writes characters to the screen
		System.out.println("Please enter the cuboid's depth: ");
		
		//scanner (if successful) scans the next float
		float depth = in.nextFloat();
		
		//code to operate while the depth is less than 0
		while (depth < 0) {
			
			//system sends output to the console, out provides methods to send output
			//print writes characters to the screen
			System.out.println("Please enter a number greater than zero");
			
			//scanner (if successful) scans the next float
			depth = in.nextFloat();
			
		} //closing while bracket
		
		//system sends output to the console, out provides methods to send output
		//print writes characters to the screen
		System.out.println("The surface area of this cuboid is: " + surfaceArea());	
		
		//system sends output to the console, out provides methods to send output
		//print writes characters to the screen
		System.out.println("The volume of this cuboid is: " + volume());	
	
	} //closing render bracket

} 