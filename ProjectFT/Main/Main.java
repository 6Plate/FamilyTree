package ProjectFT.Main;

import ProjectFT.Human.Gender;
import Service.Service;

// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectOutputStream;


public class Main {

private static final Gender Male = null;

public static void main(String[] args) {
    Service service = new Service();

    service.addItem("Platon", Male, 2004.04., null, null, null);
 }
 
}

