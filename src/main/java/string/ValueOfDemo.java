package string;

/**
 * String提供了一组重载的静态方法：valueof
 * 作用是将其他类型转换为String
 */
public class ValueOfDemo {
    public static void main(String[] args) {
        int a = 123;
        String s1 = String.valueOf(a);
        System.out.println(s1);

    }
}
