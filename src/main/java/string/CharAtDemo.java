package string;

/**
 * java.lang.String.charAt() 方法返回指定索引处的char值。
 * 索引范围是从0到length() - 1。对于数组索引，序列的第一个char值是在索引为0，索引1，依此类推
 */
public class CharAtDemo {
    public static void main(String[] args) {
        String str = "thinking in java";
        System.out.println(str.charAt(8));
    }
}
