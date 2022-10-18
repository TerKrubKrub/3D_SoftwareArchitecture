package com.solid.book;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class BookPublisher extends Book implements Publisher{
    public BookPublisher(String title, List<String> pages) {
        super(title, pages);
    }

    @Override
    public void printToFile() {
        Book book = this;
        boolean isEven = false;
        String previousPage = "";
        try {
            FileWriter fileWriter = new FileWriter(book.getTitle() + ".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            do {
                if (isEven) {
                    previousPage = book.getCurrentPage();
                    isEven = false;
                } else {
                    printWriter.printf("%-25s : %25s%n", previousPage, book.getCurrentPage());
                    isEven = true;
                }
            } while (book.turnToNextPage());
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("Cannot print this book due to IOException");
        }
    }

    public static void main(String[] args) {
        BookPublisher bookPublisher = new BookPublisher("Tyland", List.of("I", "moved", "here", "recently", "too"));
        bookPublisher.printToFile();
    }
}
