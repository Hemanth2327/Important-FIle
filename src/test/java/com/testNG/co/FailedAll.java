package com.testNG.co;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class FailedAll implements IAnnotationTransformer{

	public void transform(ITestAnnotation It, Class testClass, Constructor testConstructor, Method testMethod) {

		It.setRetryAnalyzer(Failed.class);
		
		It.getRetryAnalyzer();
		
	}
	
	

	
	
}
