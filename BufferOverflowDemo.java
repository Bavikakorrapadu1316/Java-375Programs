package ExceptionHandling;
import java.nio.*;

public class BufferOverflowDemo {
    public static void main(String[] args) {
        try {
            ByteBuffer b = ByteBuffer.allocate(2);
            b.put((byte)1);
            b.put((byte)2);
            b.put((byte)3);
        } catch (BufferOverflowException e) {
            System.out.println("Buffer overflow handled");
        }
    }
}
