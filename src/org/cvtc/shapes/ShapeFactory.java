package org.cvtc.shapes;

public class ShapeFactory {
	
public Shape getShape(String shapeType){
	
	if(shapeType == null){
		
		return null;
		
	}
	
	if (shapeType.equalsIgnoreCase("SPHERE")){
		
		return new Sphere(dialog, 0);
		
	} else if (shapeType.equalsIgnoreCase("CUBOID")){
		
		return new Cuboid(dialog, 0, 0, 0);
		
	} else if (shapeType.equalsIgnoreCase("CYLINDER")){
		
		return new Cylinder(dialog, 0, 0);
		
	}
	
	return null;
	
}
	
	private Dialog dialog;


private Dialog getDialog  () {
	
	return dialog;
	
}

private void setDialog(Dialog dialog){
	
	this.dialog = dialog;
	
}

public ShapeFactory(Dialog dialog) {
	
	setDialog(dialog); 
	
}

public Cuboid buildCuboid(float width, float height, float depth) {
	
	return new Cuboid(getDialog(), width, height, depth);
	
}

public Sphere buildSphere(float radius) {
	
	return new Sphere(getDialog(), radius);
	
}

public Cylinder buildCylinder(float height, float radius) {
	
	return new Cylinder(getDialog(), height, radius);
	
}

}