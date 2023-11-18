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
    service.addItem2("Plato",Gender.Male, LocalDate.of(2003, 4, 22));
    service.addItem2("Kirill", Gender.Male, LocalDate.of(1975, 8, 6));
    service.addItem2("Julia", Gender.Female, LocalDate.of(1977, 8, 12));
    service.sortByAge();
    System.out.println(service);
 }
 
}

