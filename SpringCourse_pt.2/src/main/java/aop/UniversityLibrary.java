package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary {
    public void getBook(){
        System.out.println("Берём книгу");
        System.out.println("----------------------------------------------");
    }

    public void getMagazine(){
        System.out.println("Берём журнал");
        System.out.println("----------------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("Возвращаем журнал");
        System.out.println("----------------------------------------------");
    }

    public void returnBook(){
        System.out.println("Возвращаем книгу");
        System.out.println("----------------------------------------------");
    }

    public void addBook(){
        System.out.println("Добавляем книгу");
        System.out.println("----------------------------------------------");
    }

    public void addMagazine(){
        System.out.println("Добавляем журнал");
        System.out.println("----------------------------------------------");
    }
}
