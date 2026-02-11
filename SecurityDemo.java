package ExceptionHandling;
public class SecurityDemo {
    public static void main(String[] args) {
        try {
            System.setSecurityManager(new SecurityManager());
            System.exit(0);
        } catch (SecurityException e) {
            System.out.println("Security exception handled");
        }
    }
}
