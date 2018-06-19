package com;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;



public class CarTest {

	
	@Mock
	private Engine engine;
	
	@InjectMocks
	private Car car;	
	
	// Inject mock will inject Mock object into constructor of Injectmock
	// Engine will mocked into constructor of CAR
	
	
	@Before
	public void setup(){
		
		MockitoAnnotations.initMocks(this);
	}
	
	// each test function can re-configure Mock Object Engine seperately..
	
	@Test
	public void testWarning(){
		// If RPM is > 5000 , a warning message is displayed in Car.
		
		when(engine.getRpm()).thenReturn(6000);
		
		// Now car should display warning
		car.accelerate();
		
		assertEquals("Slow Down", car.getWarningMessage());
		
		
		
	}
}
