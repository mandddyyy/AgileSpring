package org.cvtc.shapes.test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import org.cvtc.shapes.*;


public class CuboidTest extends Shape implements Renderer {
	
	public CuboidTest(Dialog messageBox, float height, float width, float depth) {
		super(messageBox);
	}

	Cuboid cube1 = new Cuboid(null, 1.0f, 1.0f, 1.0f);
	
	Cuboid cube2 = new Cuboid(null, 2.0f, 2.0f, 2.0f);
	
	Cuboid cube3 = new Cuboid(null, 3.0f, 3.0f, 3.0f);

	@Test
	public void testSurfaceArea() {
		//assertEquals(value we expect to get back, actual value, variance);
		assertEquals(6.0f, cube1.surfaceArea(), 0.0);
		
	}
	
	@Test
	public void test2SurfaceArea() {
		//assertEquals(value we expect to get back, actual value, variance);
		assertEquals(24.0f, cube2.surfaceArea(), 0.0);
		
	}
	
	
	@Test
	public void test3SurfaceArea() {
		//assertEquals(value we expect to get back, actual value, variance);
		assertEquals(54.0f, cube3.surfaceArea(), 0.0);
		
	}


	@Test
	public void testVolume() {
		
		assertEquals(1.0f, cube1.volume(), 0.0);
	}
	
    @Test
    public void test2Volume() {
    	
        assertNotNull(cube2);
        
        assertEquals(8.0f, cube2.volume(), 0.0);
        
    }
    
    @Test
    public void test3Volume() {
    	
        assertNotNull(cube2);
        
        assertEquals(8.0f, cube2.volume(), 0.0);
        
    }
	
	@Test
	public void testHeight() {
		
		assertEquals(1.0f, cube1.getHeight(), 0.0);
		
	}

	@Test
	public void testWidth() {
		
		assertEquals(1.0f, cube1.getWidth(), 0.0);
		
	}
	
	@Test
	public void testDepth() {
		
		assertEquals(1.0f, cube1.getDepth(), 0.0);
		
	}
	
    @Test
    public void constructorTest(){
    	
    	assertThat("getDepth()",is("getDepth()"));    
    	
     }

    
    @Test
    public void constructorTestDepthZero() {
    	
    	assertThat("getDepth()", is(not(0)));
    	
    } 
    
    @Test
    public void constructorTestHeightZero() {
    	
    	assertThat("getHeight()", is(not(0)));
    	
    } 
    
    @Test
    public void constructorTestWidthZero() {
    	
    	assertThat("getWidth()", is(not(0)));
    	
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
    

    
	@Test 
	public void widthIsNotZero() {
		
		assertThat(cube1.getWidth(), is(1.0f));
		
	}
    
	@Test 
	public void heightIsNotZero() {
		
		assertThat(cube1.getHeight(), is(1.0f));
		
	}
	
	@Test 
	public void depthIsNotZero() {
		
		assertThat(cube1.getDepth(), is(1.0f));
		
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
