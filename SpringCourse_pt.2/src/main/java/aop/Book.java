package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Война и мир")
    private String name;

    @Value("Л.Н.Толстой")
    private String author;

    @Value("1867")
    private int yearRelease;

    public String getName() {
        return name;
    }


    public String getAuthor() {
        return author;
    }

    public int getYearRelease() {
        return yearRelease;
    }
}
