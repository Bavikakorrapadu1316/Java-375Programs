package ExceptionHandling;
import java.nio.*;

public class BufferUnderflowDemo {
    public static void main(String[] args) {
        try {
            ByteBuffer b = ByteBuffer.allocate(2);
            b.get();
        } catch (BufferUnderflowException e) {
            System.out.println("Buffer underflow handled");
        }
    }
}

