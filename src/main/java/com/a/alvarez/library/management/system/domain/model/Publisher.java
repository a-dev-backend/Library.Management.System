package com.a.alvarez.library.management.system.domain.model;


import java.util.HashSet;
import java.util.Set;

public class Publisher {
    private Long id;
    private String name;
    private Set<Book> books = new HashSet<>();

    public Publisher(Set<Book> books, String name) {
        this.books = books;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
