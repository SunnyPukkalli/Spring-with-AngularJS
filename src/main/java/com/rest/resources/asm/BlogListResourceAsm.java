package com.rest.resources.asm;



import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.core.services.util.BlogList;
import com.rest.controller.BlogController;
import com.rest.resources.BlogListResource;




public class BlogListResourceAsm extends ResourceAssemblerSupport<BlogList, BlogListResource> {

    public BlogListResourceAsm()
    {
        super(BlogController.class, BlogListResource.class);
    }

    public BlogListResource toResource(BlogList blogList) {
        BlogListResource res = new BlogListResource();
        res.setBlogs(new BlogResourceAsm().toResources(blogList.getBlogs()));
        return res;
    }
}