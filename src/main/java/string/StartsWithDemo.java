package string;

/**
 * boolean startsWith(String str)
 * boolean endwith(String str)
 * 判断当前字符串是否以给定的字符串开始或结束的。
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String line = "http://www.tedu.Com";

        boolean starts = line.startsWith("http");
        System.out.println("stars:"+starts);

        boolean ends = line.endsWith("com");
        System.out.println("ends:"+ends);

    }
}
