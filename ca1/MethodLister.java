import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodLister {
    public static void main(String[] args) {
        Method[] methods = Arrays.class.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}