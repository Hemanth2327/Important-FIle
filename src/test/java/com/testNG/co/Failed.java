package com.testNG.co;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer{

	int min=0, max=3;
	
	public boolean retry(ITestResult result) {
        
		//   0  <  3
		if (min < max) {
			
			min++;
			return true;
		}
		return false;
	}
}
