package com.core.services;

import com.core.entities.Blog;
import com.core.entities.BlogEntry;
import com.core.services.util.BlogEntryList;
import com.core.services.util.BlogList;

public interface BlogService {
 
    public BlogEntry createBlogEntry(Long blogId, BlogEntry data);

    public BlogList findAllBlogs();

    public BlogEntryList findAllBlogEntries(Long blogId); // findBlog all associated blog entries

    public Blog findBlog(Long id);

}
