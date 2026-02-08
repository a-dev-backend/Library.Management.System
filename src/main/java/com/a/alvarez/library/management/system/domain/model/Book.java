package com.a.alvarez.library.management.system.domain.model;

import com.a.alvarez.library.management.system.domain.enums.Genre;
import com.a.alvarez.library.management.system.domain.enums.Language;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book {

    private Long id;
    private String title;
    private Set<Genre> genres = new HashSet<>();
    private List<Author> authors = new ArrayList<>();
    private Publisher publisher;
    private String publicationYear;
    private Language language;

    public Book(Long id, String title, Set<Genre> genres, List<Author> authors, Publisher publisher, String publicationYear, Language language) {
        this.id = id;
        this.title = title;
        this.genres = genres;
        this.authors = authors;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.language = language;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genres=" + genres +
                ", authors=" + authors +
                ", publisher=" + publisher +
                ", publicationYear='" + publicationYear + '\'' +
                ", language=" + language +
                '}';
    }
}
