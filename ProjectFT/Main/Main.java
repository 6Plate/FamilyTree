package ProjectFT.Main;

import java.time.LocalDate;

import ProjectFT.Human.Gender;
import ProjectFT.Service.Service;

// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectOutputStream;


public class Main {
public static void main(String[] args) {
    Service service = new Service();
    service.addItem2("Платон",Gender.Male, LocalDate.of(2003, 4, 22));
    service.addItem2("Кирилл", Gender.Male, LocalDate.of(1978, 9, 18));
    service.addItem2("Анастасия", Gender.Male, LocalDate.of(1979, 10, 18));
    service.addToParents(service.getById(2));
    service.addToChild(service.getById(0));
    service.addToChild(service.getById(1));
    service.sortByAge();
    System.out.println(service);
    service.sortByName();
    System.out.println(service);
 }
 
}

