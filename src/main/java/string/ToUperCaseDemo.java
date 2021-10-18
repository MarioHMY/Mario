package string;

/**
 * String toUpperCase();
 * String toLowerCase();
 * 将当前字符串转化为全大写或全小写。
 */
public class ToUperCaseDemo {
    public static void main(String[] args) {
        String line = "AHSXjgixksl";

        String lower = line.toLowerCase();
        System.out.println(lower);

        String upper = line.toUpperCase();
        System.out.println(upper);
    }
}
