import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class io {



    public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\z.cai\\readme.txt";

        java.io.File file = new java.io.File(source);


        List<String> list = Files.readAllLines(file.toPath());

//        list.add("aaaaaaaaaaaa");

        System.out.println(list);


        Files.write(file.toPath(),list, Charset.defaultCharset(), StandardOpenOption.WRITE, StandardOpenOption.APPEND);

    }


}