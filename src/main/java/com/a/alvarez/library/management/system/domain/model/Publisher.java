package com.a.alvarez.library.management.system.domain.model;

import java.util.ArrayList;

public class Publisher {
    private Long id;
    private String name;
    private ArrayList<Book> books = new ArrayList<>();
}
