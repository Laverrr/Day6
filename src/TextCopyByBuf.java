import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextCopyByBuf {

    /**
     * 首先创建读取字符数据流对象关联所要复制的文件。
     * 创建缓冲区对象关联流对象。
     * 从缓冲区中将字符创建并写入到要目的文件中。
     *
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\demo.txt");
        FileWriter fw = new FileWriter("D:\\love.txt");
        BufferedReader bufr = new BufferedReader(fr);
        BufferedWriter bufw = new BufferedWriter(fw);
        //一行一行的寫。
        String line = null;
        while ((line = bufr.readLine()) != null) {
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }
	/*	一個字節一個字節的寫。
	    int ch = 0;
		while((ch = bufr.read())!=-1){
			bufw.write(ch);
		}*/
        bufr.close();
        bufw.close();
    }
}