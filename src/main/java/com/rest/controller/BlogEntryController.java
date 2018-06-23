package com.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.core.entities.BlogEntry;
import com.core.services.BlogEntryService;
import com.rest.resources.BlogEntryResource;
import com.rest.resources.asm.BlogEntryResourceAsm;

@Controller
public class BlogEntryController {

	private BlogEntryService service;
	
	public BlogEntryController(BlogEntryService service){
		this.service = service;
	}
	
	
	@RequestMapping(value="/rest/blog-entries/{blogEntryId}",method=RequestMethod.GET)
	public ResponseEntity<BlogEntryResource> getblogEntry (
			@PathVariable Long blogEntryId ){
		BlogEntry entry = service.find(blogEntryId);
		BlogEntryResource resource = new BlogEntryResourceAsm().toResource(entry);
		
		return new ResponseEntity<BlogEntryResource>(resource,HttpStatus.OK);
	}
}
