package com.rest.resources;

import org.springframework.hateoas.ResourceSupport;

import com.core.entities.Account;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountResource extends ResourceSupport {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    @JsonIgnore
    public String getPassword() {
        return password;
    }

    
    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }

    public Account toAccount() {
        Account account = new Account();
        account.setName(name);
        account.setPassword(password);
        return account;
    }

}
