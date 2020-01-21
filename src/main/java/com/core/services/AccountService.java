package com.core.services;

import com.core.entities.Account;
import com.core.entities.Blog;

public interface AccountService {

    public Account findAccount(Long id);
    public Account createAccount(Account data);
    public Blog createBlog(Long accountId, Blog data);
    
}
