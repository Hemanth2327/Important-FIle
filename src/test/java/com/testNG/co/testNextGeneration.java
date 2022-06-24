package com.testNG.co;

import org.testng.annotations.Test;

public class testNextGeneration {
	
	@Test(priority=4)
     private void Tc5() {
		System.out.println("test case 5");
	}

	@Test(priority=-8,enabled=false)
    private void Tc3() {
		System.out.println("test case 3");
	}
	
	@Test(priority=-15)
    private void Tc1() {
		System.out.println("test case 1");
	}
	
	@Test(invocationCount = 5)
    private void Tc4() {
		System.out.println("test case 4");
	}
	
	@Test(priority=3)
    private void Tc2() {
		System.out.println("test case 2");
	}
}
