package com.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entities.BlogEntry;

@Controller
public class BlogEntryController {

	/*
	// One way to check JSON - Java Conversion using HTTP Message Converters
	@RequestMapping("/test")
	public ResponseEntity<Object> test(){
		
		BlogEntry entry = new BlogEntry();
		entry.setTitle("Test Blog Entry");
		
		return new ResponseEntity<Object>(entry,HttpStatus.OK);
	}
	
	*/
	
	
		@RequestMapping(value="/test", method=RequestMethod.POST)
		public @ResponseBody BlogEntry test(@RequestBody BlogEntry entry){
			
			// we are sending and recieving JSON and its converted correctly
			return entry;
		}
}
