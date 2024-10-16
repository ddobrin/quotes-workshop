package com.example.quotes.domain;

public class QuoteData {
    private String book;
    private String author;
    private String quote;

    // Getters
    public String getBook() {
        return book;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    // Setters
    public void setBook(String book) {
        this.book = book;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}

