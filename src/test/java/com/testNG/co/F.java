package com.testNG.co;

import org.testng.annotations.Test;

public class F {
	
	@Test
	private void Tc21() {
        
		System.out.println("Test case 21 :" +Thread.currentThread().getId());
	}
	
	@Test
	private void Tc22() {
        
		System.out.println("Test case 22 :" +Thread.currentThread().getId());
	}
	
	@Test
	private void Tc23() {
        
		System.out.println("Test case 23 :" +Thread.currentThread().getId());
	}


}
