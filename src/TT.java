import java.io.*;
import java.nio.file.Files;

/**
 * Created by L on 2018/8/16.
 */
public class TT {
    public static void main(String[] args) {
        File file = new File("");
        //读文件 写入
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String string;
            while ((string=bufferedReader.readLine())!=null){
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //输出文字到文件中
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("aaaaaaaaaa");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
