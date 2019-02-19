//inside package org.cvtc.shapes
package org.cvtc.shapes;

import javax.swing.JOptionPane;

//cube is a public class extending shape
public class Cuboid extends Shape implements Renderer {

    //cube properties as private float
    private float width;
    private float height;
    private float depth;

    //constructor
    //public Cuboid(){
    	
        //this.width = 0.0f;
        
        //this.height = 0.0f;
        
        //this.depth = 0.0f;
        
    //}

    //overload constructor
    public Cuboid(Dialog messageBox, float width, float height, float depth) {
    	
        super(messageBox);
    	
    	this.width = width;
        
        this.height = height;
        
        this.depth = depth;
        
    }

    //getter - width
    public float getWidth() {
    	
        return width;
        
    }

    //setter - width
    private void setWidth(float width) {
    	
        this.width = width;
        
    }

    //getter - height
    public float getHeight() {
    	
        return height;
        
    }

    //setter - height
    private void setHeight(float height) {
    	
        this.height = height;
        
    }

    //getter - depth
    public float getDepth() {
    	
        return depth;
        
    }

    //setter - depth
    private void setDepth(float depth) {
    	
        this.depth = depth;
        
    }

    // Override methods from Shapes class
    @Override
    public float surfaceArea() {
    	
    	//returns surface area of cube
        return 2 * (getDepth()*getWidth() + getWidth()*getHeight() + getHeight()*getDepth());
        
    }

    @Override
    public float volume() {
    	
    	//returns volume of cube
        return getDepth() * getHeight() * getWidth();
        
    }

    @Override
    public void render() {

        JOptionPane.showMessageDialog(null,
                "Cuboid's Dimensions = " + this.getWidth() +
                        " W x " + this.getHeight() +
                        " H x " + this.getDepth() +
                        " D\n" +
                        "Cuboid's Surface Area = " + this.surfaceArea() + "\n" +
                        "Cuboid's Volume = " + this.volume());
        
    }
    
} 