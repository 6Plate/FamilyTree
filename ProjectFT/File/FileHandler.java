package ProjectFT.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileHandler implements Writable{

    public void save(Serializable serializable, String filePath){
    try {
try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
    objectOutputStream.writeObject(serializable);
}
 } catch (Exception e){
    e.printStackTrace();
 }

 }

 public Object read (String filePath){
    try (
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))){
        return objectInputStream.readObject();
        }
    catch (Exception e){
        e.printStackTrace();
        return null;
    }
}


 }
