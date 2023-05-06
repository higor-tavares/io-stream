package org.example.inputandoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacterSample {
  private static final int END_OF_FILE = -1;
  public static void main(String[] args) throws IOException {
    //Byte input stream. reads data bytes
    FileReader inputStream = null;
    //Byte output stream. writes data bytes
    FileWriter outputStream = null;
    try {
      inputStream = new FileReader("src/main/resources/xanadu.txt");
      //before running this class you need to create the out directory in project root
      outputStream = new FileWriter("out/character_output.txt");
      int byteData;
      while((byteData = inputStream.read()) != END_OF_FILE){
        outputStream.write(byteData);
      }
    } finally {
      if(inputStream != null){
        inputStream.close();
      }
      if(outputStream != null){
        outputStream.close();
      }
    }
  }
}
