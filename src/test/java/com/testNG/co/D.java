package com.testNG.co;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D {

	@Test
	public void Tc1() {

		System.out.println("Test case 1");
	}

    @Test
	public void Tc2() {

		Assert.assertTrue(false);
		System.out.println("Test case 2");
	}

	@Test
	public void Tc3() {
        
		System.out.println("Test case 3 ");
	}
	
	@Test
    public void Tc4() {
	        
		Assert.assertTrue(false);
		System.out.println("Test case 4");
	}
	
	@Test
	public void Tc5() {
	        
		System.out.println("Test case 5");
	}

}
