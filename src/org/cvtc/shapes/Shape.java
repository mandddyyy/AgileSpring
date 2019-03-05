//inside package org.cvtc.shapes
package org.cvtc.shapes;

public abstract class Shape {
	
	public Dialog messageBox;
	
	public Shape(Dialog messageBox) {
		
		this.messageBox = messageBox;
		
	}
	
	public void setMessageBox (Dialog messageBox){
		
		this.messageBox = messageBox;
		
	}
	
	public abstract float surfaceArea();
	
	public abstract float volume();
	
	public abstract void render();

	public void draw() {
		// TODO Auto-generated method stub
		
	}

}

