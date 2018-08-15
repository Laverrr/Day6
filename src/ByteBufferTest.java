import java.nio.ByteBuffer;

public class ByteBufferTest {
    public static void main(String[] args) {
        byte[] data = {'1', '2', '3'};
        
        ByteBuffer b = ByteBuffer.allocateDirect(65536);
        b.put(data);
        ByteBuffer b2 = ByteBuffer.allocate(4096);
        b2.put(data);
        ByteBuffer b3 = ByteBuffer.wrap(data);
        b3.put(data);
        byte[] bytes= new byte[b.position()];
        b.flip();
        b.get(bytes);
        System.out.println(new String(bytes));
        System.out.println(new String(bytes));


//        System.out.println(b.get(0));
//        System.out.println(b2.get(1));
//        System.out.println(b3.get(2));

    }

}
