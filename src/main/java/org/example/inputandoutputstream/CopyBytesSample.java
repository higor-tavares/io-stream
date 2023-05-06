package org.example.inputandoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytesSample {
  private static final int END_OF_FILE = -1;
  public static void main(String[] args) throws IOException {
    //Byte input stream. reads data bytes
    FileInputStream input = null;
    //Byte output stream. writes data bytes
    FileOutputStream output = null;
    try {
      input = new FileInputStream("src/main/resources/xanadu.txt");
      //before running this class you need to create the out directory in project root
      output = new FileOutputStream("out/xanadu_02.txt");
      int byteData;
      while((byteData = input.read()) != END_OF_FILE){
        output.write(byteData);
      }
    } finally {
      if(input != null){
        input.close();
      }
      if(output != null){
        output.close();
      }
    }
  }
}
