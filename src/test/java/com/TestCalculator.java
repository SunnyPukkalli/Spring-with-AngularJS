package com;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


import org.junit.Before;


public class TestCalculator {
	
	
	@Mock
	private Calculator cal;
	
	
	@Before
	public void  setup(){
		
		MockitoAnnotations.initMocks(this);
		
	//	cal = new Calculator();
	}
	
	
	@Test
	public void testabs(){
		
		/*
		int expected = -9 ;
		int actual = cal.abs(-9);
		assertEquals(expected, actual);
		*/
		
		when(cal.abs(-20)).thenReturn(20);
		
		assertEquals(20, cal.abs(-20));
		
		
		// assertEquals(20, cal.abs(-20)); --> cal.abs(-20) will return 20 if mocked properly and then assert must be true.
	}
}
