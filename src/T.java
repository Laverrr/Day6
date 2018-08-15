import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by L on 2018/8/16.
 */
public class T {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("input.txt");
        try (InputStream in =  new FileInputStream(inputFile)) {
            Files.copy(in, Paths.get("output.txt"));
        }catch (Exception e){

        }
        
    }
}
