package com.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class BlogEntryControllerTest {

	
	@InjectMocks
	private BlogEntryController controller;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		
		MockitoAnnotations.initMocks(this);
		
		
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build(); // this sets up and builds the request 
	}
	
	@Test
	public void test() throws Exception{
		
		
	//	mockMvc.perform(get("/test")).andDo(print());
		// this performs a GET Request with pattern /test  ; 
		// the method print() is used  print the response and all details related the HTTP Request.
		
		mockMvc.perform(post("/test")
				.content("{\"title\":\"Test Blog Entry\"}")
				.contentType(MediaType.APPLICATION_JSON)
				)
				.andExpect(jsonPath("$.title", org.hamcrest.Matchers.is("Test BlogEntry"))) //  $ --> root of the json element
				.andDo(print());
		
	}

	
}
