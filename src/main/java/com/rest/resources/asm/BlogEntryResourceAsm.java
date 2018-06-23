package com.rest.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.core.entities.BlogEntry;
import com.rest.controller.BlogEntryController;
import com.rest.resources.BlogEntryResource;

public class BlogEntryResourceAsm  extends ResourceAssemblerSupport<BlogEntry, BlogEntryResource>{ // ResourceAssemblerSupport converts from to

	public BlogEntryResourceAsm() {
		super(BlogEntryController.class, BlogEntryResource.class);
	}

	public BlogEntryResource toResource(BlogEntry entry) {
		
		BlogEntryResource res = new BlogEntryResource();
		res.setTitle(entry.getTitle());
		return res;
	}  

}
