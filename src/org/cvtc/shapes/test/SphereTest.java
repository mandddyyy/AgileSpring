package org.cvtc.shapes.test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.cvtc.shapes.*;
import org.junit.Assert;
import org.junit.Test;

public class SphereTest extends Shape implements Renderer {
	
	public SphereTest(Dialog messageBox, float radius) {
		
		super(messageBox);
		
	}

	Sphere sphere1 = new Sphere(null, 1.0f);
	
	Sphere sphere2 = new Sphere(null, 2.0f);

	Sphere sphere3 = new Sphere(null, 3.0f);


	@Test
	public void testRadius() {
		
		assertEquals(1.0f, sphere1.getRadius(), 0.0);
		
	}

	@Test
	public void testVolume() {
		
		assertEquals(Math.PI, sphere1.volume(), 2.0);
	}
	
	@Test public void volumeTest2() {
		
		double volume = sphere2.volume();
		
		Assert.assertEquals(33.510, volume, .001);
	}
	
	@Test public void volumeTest3() {
		
		double volume = sphere1.volume();
		
		Assert.assertEquals(4.0 / 3.0 * Math.PI, volume, 0.1);
	}

	@Test public void volumeTest4() {
		
		double volume = sphere3.volume();
		
		Assert.assertEquals(113.0973, volume, 0.1);
	}

	
	@Test
	public void testSurfaceArea() {
		
		assertEquals(4* Math.PI, sphere1.surfaceArea(), 0.2);
	}
	

	@Test 
	public void surfaceAreaTest2() {
		
		double surfaceArea = sphere2.surfaceArea();
		
		Assert.assertEquals(50.265, surfaceArea, .001);
		
	}
	
	@Test 
	public void surfaceAreaTest3() {
		
		double surfaceArea = sphere1.surfaceArea();
		
		Assert.assertEquals(Math.PI *4, surfaceArea, .000001);
		
	}
	
	@Test 
	public void surfaceAreaTest4() {
		
		double surfaceArea = sphere3.surfaceArea();
		
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
	
    @Test
    public void testExceptionMessage() {
    	
        try {
        	
            new ArrayList<Object>().get(0);
            
            fail("Expected an IndexOutOfBoundsException to be thrown");
            
        } catch (IndexOutOfBoundsException anIndexOutOfBoundsException) {
        	
            assertThat(anIndexOutOfBoundsException.getMessage(), is("Index: 0, Size: 0"));
            
        }
        
    }
    

	public void canDoToString(){
		
		assertThat(sphere1.toString(), is("getRadius() * Math.PI"));
		
	}
    
	@Test 
	public void radiusIsNotZero() {
		
		assertThat(sphere1.getRadius(), is(1.0f));
		
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
