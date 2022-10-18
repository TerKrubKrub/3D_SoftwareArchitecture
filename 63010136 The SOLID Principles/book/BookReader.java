package com.solid.book;


import java.util.List;

public class BookReader extends Book implements Reader {
    public BookReader(String title, List<String> pages) {
        super(title, pages);
    }

    @Override
    public void printToScreen() {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }

    public static void main(String[] args) {
        BookReader bookReader = new BookReader("Tyland", List.of("I", "moved", "here", "recently", "too"));
        bookReader.printToScreen();
    }
}
