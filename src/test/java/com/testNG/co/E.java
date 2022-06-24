package com.testNG.co;

import org.testng.annotations.Test;

public class E {
	
	@Test
	private void Tc11() {
        
		System.out.println("Test case 11 :" +Thread.currentThread().getId());
	}
	
	@Test
	private void Tc12() {
        
		System.out.println("Test case 12 :" +Thread.currentThread().getId());
	}
	
	@Test
	private void Tc13() {
        
		System.out.println("Test case 13 :" +Thread.currentThread().getId());
	}

}
