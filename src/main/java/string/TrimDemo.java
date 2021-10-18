package string;

/**
 * String trim
 * 去除一个字符串两边的空白字符
 */
public class TrimDemo {
    public static void main(String[] args) {
        String line = "   hello"        ;
        System.out.println(line);
        String trim = line.trim();
        System.out.println(trim);
    }
}
