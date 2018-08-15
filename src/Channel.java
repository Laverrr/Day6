import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Channel {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\z.cai\\readme.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileChannel channel = fileOutputStream.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            String context="One of the major advantages of dependency injection is that it "+
                    "without even involving Spring."+
                    "You can also use mock objects instead of real dependencies";
            buffer.put(context.getBytes());
            buffer.flip();
            channel.write(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(8);
            int len=0;
            int curr=0;
            boolean finish = false;
            while ((curr=channel.read(byteBuffer))!=-1&&byteBuffer.position()>0&&!finish){
                len=len+curr;
                byteBuffer.flip();
                byte[] bytes = new byte[byteBuffer.limit()];
                byteBuffer.get(bytes);
                System.out.println(new String(bytes));
                byteBuffer.compact();
                System.out.println(len);
                if (len == 16) {
                    finish=true;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }



}

