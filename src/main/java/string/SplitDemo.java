package string;

import java.util.Arrays;

/**
 * String[] split(String regex)
 * 当前字符串中满足正则表达式的部分进行拆分，将拆出的每段内容以数组形式返回
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi";
        //按照数字部分拆分，将所有字符串部分得到
        String[] date = str.split("[0-9]+");
        System.out.println(date.length);
        System.out.println(Arrays.toString(date));

        str = "abc,def,ghi,jkl";
        //拆出字母部分
        date = str.split(",");
        System.out.println(date.length);
        System.out.println(Arrays.toString(date));

        str = "abc.def.ghi.jkl";
        date = str.split("\\.");
        System.out.println(date.length);
        System.out.println(Arrays.toString(date));

        str = "abc..def.ghi.jkl";//多拆除一个空字符串
        date = str.split("\\.");
        System.out.println(date.length);
        System.out.println(Arrays.toString(date));

        str = ".abc.def.ghi.jkl";//多拆除一个空字符串
        date = str.split("\\.");
        System.out.println(date.length);
        System.out.println(Arrays.toString(date));

        str = "abc.def.ghi.jkl...";//如果在最后一个，那么前面的空格都不要
        date = str.split("\\.");
        System.out.println(date.length);
        System.out.println(Arrays.toString(date));
    }
}
