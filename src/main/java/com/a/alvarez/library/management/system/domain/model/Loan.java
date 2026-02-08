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

    public Loan( StatusLoan statusLoan, LocalDate returnDate, LocalDate loanDate, Member member, Set<Book> books) {
        this.id = id;
        this.statusLoan = statusLoan;
        this.returnDate = returnDate;
        this.loanDate = loanDate;
        this.member = member;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public StatusLoan getStatusLoan() {
        return statusLoan;
    }

    public void setStatusLoan(StatusLoan statusLoan) {
        this.statusLoan = statusLoan;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", books=" + books +
                ", member=" + member +
                ", loanDate=" + loanDate +
                ", returnDate=" + returnDate +
                ", statusLoan=" + statusLoan +
                '}';
    }
}
