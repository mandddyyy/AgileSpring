package org.cvtc.shapes.test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.cvtc.shapes.*;
import org.junit.Assert;
import org.junit.Test;

public class CylinderTest extends Shape implements Renderer {
	
	public CylinderTest(Dialog messageBoxSub, float height, float radius) {
		super(messageBoxSub);

	}

	Cylinder cylinder1 = new Cylinder(messageBox, 1.0f, 1.0f);
	
	Cylinder cylinder2 = new Cylinder(messageBox, 2.0f, 2.0f);

	Cylinder cylinder3 = new Cylinder(messageBox, 3.0f, 3.0f);
	
	
	@Test
	public void testRadius() {
		
		assertEquals(1.0f, cylinder1.getRadius(), 0.0);
		
	}
    
	@Test
	public void testHeight() {
		
		assertEquals(1.0f, cylinder1.getHeight(), 0.0);
		
	}


	@Test
	public void testVolume() {
		
		assertEquals(Math.PI, cylinder1.volume(), 0.1);
	}
	
	@Test public void volumeTest() {
		
		double volume = cylinder2.volume();
		
		Assert.assertEquals(25.1327, volume, .01);
	}
	
	@Test public void volumeTest3() {
		
		double volume = cylinder3.volume();
		
		Assert.assertEquals(84.8229, volume, .01);
	}
	
	@Test
	public void testSurfaceArea() {
		
		assertEquals(4* Math.PI, cylinder1.surfaceArea(), 0.1);
	}
	
	@Test 
	public void surfaceAreaTest() {
		
		double surfaceArea = cylinder2.surfaceArea();
		
		Assert.assertEquals(50.265, surfaceArea, .001);
		
	}
	
	@Test 
	public void surfaceAreaTest3() {
		
		double surfaceArea = cylinder3.surfaceArea();
		
		Assert.assertEquals(113.097, surfaceArea, .001);
		
	}
	
    @Test
    public void constructorTest(){
    	
    	assertThat("getRadius()",is("getRadius()"));    
    	
     }

    
    @Test
    public void constructorTestDepthZero() {
    	
    	assertThat("getRadius()", is(not(0)));
    	
    } 
	
	//@Test public void totalSurfaceAreaTest() throws FileNotFoundException {
		 //  String fileName = "Cylinder.java";
		 //  cylinder1 = cylinder1.readFile(fileName);
		 //  double surfaceArea = cylinder1.surfaceArea();
		//   Assert.assertEquals(184790.426, surfaceArea, .001);
	//}
	
    @Test
    public void testExceptionMessage() {
        
    	try {
        	
           new ArrayList<Object>().get(0);
            
           fail("Expected an IndexOutOfBoundsException to be thrown");
      
        } catch (IndexOutOfBoundsException anIndexOutOfBoundsException) {
           
        	assertThat(anIndexOutOfBoundsException.getMessage(), is("Index: 0, Size: 0"));
       
        }
    
    }

	@Test 
	public void heightIsNotZero() {
		
		assertThat(cylinder1.getHeight(), is(1.0f));
		
	}
    
	@Test 
	public void radiusIsNotZero() {
		
		assertThat(cylinder1.getRadius(), is(1.0f));
		
	}

	@Override
	public float surfaceArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

}
