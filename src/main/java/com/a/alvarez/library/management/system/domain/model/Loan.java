package com.a.alvarez.library.management.system.domain.model;

import com.a.alvarez.library.management.system.domain.enums.StatusLoan;

import java.time.LocalDate;
import java.util.Set;

public class Loan {

    private Long id;
    private Set<Book> books;
    private Member member;
    private LocalDate loanDate;
    private LocalDate returnDate;
    private StatusLoan statusLoan;



}
