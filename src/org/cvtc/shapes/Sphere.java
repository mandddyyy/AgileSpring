//inside package org.cvtc.shapes
package org.cvtc.shapes;

//imports JOptionPane
import javax.swing.JOptionPane;

//class is public - extends the class of Shape
public class Sphere extends Shape{

    //Sets sphere as private float
    private float radius;

    //Constructor
    public Sphere(){
    	
        this.radius = 0.0f;
        
    }

    // Overload Constructor
    public Sphere(float radius) {
    	
        this.radius = radius;
        
    }

    //getter - radius
    public float getRadius() {
    	
        return radius;
        
    }

    //setter - radius
    private void setRadius(float radius) {
    	
        this.radius = radius;
        
    }

    // Overrides methods from the Shapes class
    
    @Override
    public float surfaceArea() {
    	
    	//returns surface area of sphere
        return (float) (4 * Math.PI * Math.pow(this.getRadius(), 2));
        
    }

    @Override
    public float volume() {
    	
    	//returns volume of sphere
        return (float) (4.0 / 3.0 * Math.PI * Math.pow(this.getRadius(), 3)) ;
        
    }

    @Override
    public void render() {
    	
        JOptionPane.showMessageDialog(null, "Sphere's Radius = " + this.getRadius() + "\n" +
                "Sphere's Surface Area = " + this.surfaceArea() + "\n" +
                "Sphere's Volume = " + this.volume());
        
    }
    
}