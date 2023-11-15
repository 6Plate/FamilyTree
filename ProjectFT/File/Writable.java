package ProjectFT.File;

import java.io.Serializable;

public interface Writable  {
 public void save (Serializable serializable, String filePath);
 Object read(String filePath);
} 
