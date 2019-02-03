//inside package org.cvtc.shapes
package org.cvtc.shapes;

//imports scanner
import java.util.Scanner;

//imports JObtionPane
import javax.swing.JOptionPane;

//class is public abstract
public abstract class ShapeTest {

	//method header 
	//main is the name of the method header
	public static void main(String[] args) {
		
		//sets up new scanner (in) to scan for float 
		Scanner in = new Scanner(System.in);
		
		//scanner (if successful) scans the next float
		float radius = in.nextFloat();
		
		//scanner (if successful) scans the next float
		float height = in.nextFloat();
		
		//scanner (if successful) scans the next float
		float depth = in.nextFloat();
		
		//scanner (if successful) scans the next float
		float width = in.nextFloat();
		
		Shape Cuboid = new Cuboid(width, height, depth);
		
		Shape Cylinder = new Cylinder(radius, height);
		
		Shape Sphere = new Sphere(radius);
		
		JOptionPane.showMessageDialog(null, Cuboid, "Cuboid", JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showMessageDialog(null, Cylinder, "Cylinder", JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showMessageDialog(null, Sphere, "Sphere", JOptionPane.PLAIN_MESSAGE);

	}

}
