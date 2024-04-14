package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary {
    public void getBook(Book book){
        System.out.println(book.getName());
    }
}
