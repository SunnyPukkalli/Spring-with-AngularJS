package com.web;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.EndsWith;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.core.entities.BlogEntry;
import com.core.services.BlogEntryService;
import com.rest.controller.BlogEntryController;

public class BlogEntryControllerTest {

	
	@InjectMocks
	private BlogEntryController controller;
	
	
	@Mock
	private BlogEntryService service;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build(); 
	}
	
	@Test
	public void getExistingBlogEntry() throws Exception{
	
		BlogEntry entry = new BlogEntry();
		entry.setId(1L);
		entry.setTitle("Test Title");
		
		when(service.find(1L)).thenReturn(entry);
		
		mockMvc.perform(get("/rest/blog-entries/1"))
			.andExpect(jsonPath("$.title", is(entry.getTitle())))
			.andDo(print())
			//.andExpect(jsonPath("$.links[*].href",hasItem(endsWith("/blog-entries/1"))))
			.andExpect(status().isOk());
		
	}

	
}
