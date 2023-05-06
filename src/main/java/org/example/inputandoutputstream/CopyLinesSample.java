package org.example.inputandoutputstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLinesSample {
  public static void main(String[] args) throws IOException {
    //Byte input stream. reads data bytes
    BufferedReader inputStream = null;
    //Byte output stream. writes data bytes
    PrintWriter outputStream = null;
    try {
      inputStream = new BufferedReader(new FileReader("src/main/resources/xanadu.txt"));
      //before running this class you need to create the out directory in project root
      outputStream = new PrintWriter("out/character_output_line.txt");
      String line;
      while((line = inputStream.readLine()) != null){
        //Invoking readLine returns a line of text with the line.
        // CopyLines outputs each line using println, which appends the line terminator
        // for the current operating system.
        // This might not be the same line terminator that was used in the input file.
        outputStream.println(line);
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
