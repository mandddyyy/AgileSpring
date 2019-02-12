//inside package org.cvtc.shapes
package org.cvtc.shapes;

//imports scanner
import java.util.Scanner;

import javax.swing.JOptionPane;

//class is public - extends the class of Shape
public class Cylinder extends Shape {

    //sets cylinder properties as private float
    private float radius;
    
    private float height;
    
    //Constructor
    public Cylinder(){
    	
        this.radius = 0.0f;
        
        this.height = 0.0f;
        
    }

    // Overload Constructor
    public Cylinder(float radius, float height) {
    	
        this.radius = radius;
        
        this.height = height;
        
    }

    //getter - radius
    public float getRadius() {
    	
        return radius;
        
    }
    
    //setter - radius
    private void setRadius(float radius) {
    	
        this.radius = radius;
        
    }

    //getter - height
    public float getHeight() {
    	
        return height;
        
    }

    //setter - height
    private void setHeight(float height) {
    	
        this.height = height;
        
    }

    // Override methods from the shapes class
    @Override
    public float surfaceArea() {
    	
    	//returns surface area of cylinder
        return (float) ((2 * Math.PI * this.getRadius() * this.getHeight()) + (2 * Math.PI * Math.pow(this.getRadius(), 2.0f)));
    
    }

    @Override
    public float volume() {
    	
    	//returns volume of cylinder
        return (float) (Math.PI * Math.pow(this.getRadius(), 2.0f) * this.getHeight());
        
    }

    @Override
    public void render() {

        JOptionPane.showMessageDialog(null,
                "Cylinder's Dimensions = " + this.getHeight() +
                        " H x " + this.getRadius() + " R\n" +
                        "Cylinder's Surface Area = " + this.surfaceArea() + "\n" +
                        "Cylinder's Volume = " + this.volume());
  
    }
    
}
