package string;

/**
 * 字符串支持的正则表达式方法三：
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定内容
 */
public class ReplaceAllDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi";
        str = str.replaceAll("[0-9]+","#NUMBER#");
        System.out.println(str);

        str = "abc123def456ghi";
        str = str.replaceAll("[a-z]+","#NUMBER#");
        System.out.println(str);
    }
}
