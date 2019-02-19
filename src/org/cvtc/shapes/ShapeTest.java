//inside package org.cvtc.shapes
package org.cvtc.shapes;

//imports scanner
import java.util.Scanner;

//public abstract class ShapeTest
public class ShapeTest {

    public static void main(String[] args) {
    	
    	Dialog messageBox = new MessageBox();

        // setting variables for cube, cylinder, and sphere calculations
        float cuboidWidth;
        
        float cuboidHeight;
        
        float cuboidDepth;
        
        float cylinderRadius;
        
        float cylinderHeight;
        
        float sphereRadius;

        // Scanner reads user input
        Scanner reader = new Scanner(System.in);

        // user input above zero
        
        // Cuboid
        System.out.println("Enter the cuboid's width: ");
        
        cuboidWidth = reader.nextFloat();
        
        while (cuboidWidth < 0.1) {
        	
            System.out.println("The width cannot be less than zero");
            
            cuboidWidth = reader.nextFloat();
        }
        
        System.out.println("Enter the cuboids height: ");
        
        cuboidHeight = reader.nextFloat();
        
        while (cuboidHeight < 0.1) {
        	
            System.out.println("The height cannot be less than zero");
            
            cuboidHeight = reader.nextFloat();
            
        }
        
        System.out.println("Enter the cuboid's depth ");
        
        cuboidDepth = reader.nextFloat();
        
        while (cuboidDepth < 0.1) {
        	
            System.out.println("The depth cannot be less than zero");
            
            cuboidDepth = reader.nextFloat();
            
        }

        // Cylinder
        System.out.println("Enter the cylinder's radius: ");
        
        cylinderRadius = reader.nextFloat();
        
        while (cylinderRadius < 0.1) {
        	
            System.out.println("The radius cannot be less than zero");
            
            cylinderRadius = reader.nextFloat();
            
        }
        
        System.out.println("Enter the cylinder's height: ");
        
        cylinderHeight = reader.nextFloat();
        
        while (cylinderHeight < 0.1) {
        	
            System.out.println("The height cannot be less than zero");
            
            cylinderHeight = reader.nextFloat();
            
        }

        // Sphere
        System.out.println("Enter the sphere's radius: ");
        
        sphereRadius = reader.nextFloat();
        
        while (sphereRadius < 0.1) {
        	
            System.out.println("The radius cannot be less than zero");
            
            sphereRadius = reader.nextFloat();
            
        }

        reader.close();

        //Creating new shape objects with user input as dimensions
        
        Shape cuboid = new Cuboid(messageBox, cuboidWidth, cuboidHeight, cuboidDepth);
        
        Shape cylinder = new Cylinder(messageBox,cylinderRadius, cylinderHeight);
        
        Shape sphere = new Sphere(messageBox, sphereRadius);
                
        //Render object message boxes
        
        cuboid.render();
        
        cylinder.render();
        
        sphere.render();
        
    }

}
