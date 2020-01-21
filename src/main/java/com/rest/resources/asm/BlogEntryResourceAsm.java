package com.rest.resources.asm;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import com.core.entities.BlogEntry;
import com.rest.controller.BlogController;
import com.rest.controller.BlogEntryController;
import com.rest.resources.BlogEntryResource;

public class BlogEntryResourceAsm  extends ResourceAssemblerSupport<BlogEntry, BlogEntryResource>{ // ResourceAssemblerSupport converts from to

	   public BlogEntryResourceAsm()
	    {
	        super(BlogEntryController.class, BlogEntryResource.class);
	    }

	    public BlogEntryResource toResource(BlogEntry blogEntry) {
	        BlogEntryResource res = new BlogEntryResource();
	        res.setTitle(blogEntry.getTitle());
	        Link self = linkTo(BlogEntryController.class).slash(blogEntry.getId()).withSelfRel();
	        res.add(self);
	        if(blogEntry.getBlog() != null)
	        {
	            res.add((linkTo(BlogController.class).slash(blogEntry.getBlog().getId()).withRel("blog")));
	        }
	        return res;
	    } 

}
