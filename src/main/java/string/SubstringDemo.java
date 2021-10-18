package string;

/**
 * String substring(int start,int end)
 * 截取当前字符串中指定范围内的字符串。两个坐标为开始下标和结束下标
 * JAVA api 两个坐标含头不含尾
 */
public class SubstringDemo {
    public static void main(String[] args) {
        String line = "www.tedu.com";
        //截取域名tedu
        String str = line.substring(4,8);
        System.out.println(str);

        //重载的方法是从指定位置截取开始截取到字符串末尾
        str = line.substring(4);
        System.out.println(str);
    }
}
