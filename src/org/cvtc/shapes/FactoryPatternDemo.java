package org.cvtc.shapes;

public class FactoryPatternDemo {
	
	private static Dialog dialog;

	   public static void main(String[] args) {
		   
		      ShapeFactory shapeFactory = new ShapeFactory(dialog);

		      //get an object of Circle and call its draw method.
		      Shape shape1 = shapeFactory.getShape("SPHERE");

		      //call draw method of Circle
		      shape1.draw();

		      //get an object of Rectangle and call its draw method.
		      Shape shape2 = shapeFactory.getShape("CUBOID");

		      //call draw method of Rectangle
		      shape2.draw();

		      //get an object of Square and call its draw method.
		      Shape shape3 = shapeFactory.getShape("CYLINDER");

		      //call draw method of square
		      shape3.draw();
		   }

}
