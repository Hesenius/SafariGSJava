package inputoutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class ExceptionExample {
  public static void main(String[] args) /*throws FileNotFoundException*/ {
    // InputStream & OutputStream handle binary data
    // Reader and Writer handle character data

    // checked exceptions represent "problems external to the program"
    // good code SHOULD try to recover
    try {
      FileReader fr = new FileReader("data.txt");
      BufferedReader br = new BufferedReader(fr);
      String line;
      while ((line = br.readLine()) != null) { // returns null at end of file
        System.out.println(">>> " + line);
      }
      System.out.println("finished...");
    } catch (FileNotFoundException fnfe) {
      System.out.println("file was not found");
      System.out.println(fnfe.getMessage());
    } catch (IOException ioe) {
      System.out.println("Reading failed");
    } finally {
      // close the files here... But this is very poor
    }

    // better way
    try (
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
    ) {
      String line;
      while ((line = br.readLine()) != null) { // returns null at end of file
        System.out.println(">>> " + line);
      }
      System.out.println("finished...");
    } catch (FileNotFoundException fnfe) {
      System.out.println("file was not found");
      System.out.println(fnfe.getMessage());
    } catch (IOException ioe) {
      System.out.println("Reading failed");
    } // finally is unnecessary, the "resources" are closed
    // automatically
  }
}
