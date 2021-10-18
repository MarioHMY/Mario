package string;

/**
 * 字符串常量池的优化导致字符串是不变对象，这只考虑了重要性。但副作用是，每次修改的内容都要
 * 创建新对象。因此字符串不适合频繁修改，性能低下
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String str = "a";
        for (int i = 0;i<1000000000;i++){
            str += "a";

        }
        System.out.println(str);
    }
}
