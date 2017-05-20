package com.formal.bookmarks;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Alvaro on 20/05/2017.
 */
@Entity
public class Bookmark {

    @JsonIgnore
    @ManyToOne
    private Account account;

    @Id
    @GeneratedValue
    private Long id;

    private String description;
    private String uri;

    public Bookmark(Account account, String description, String uri) {
        this.account = account;
        this.description = description;
        this.uri = uri;
    }

    public Account getAccount() {
        return account;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getUri() {
        return uri;
    }

    Bookmark(){

    }
}
