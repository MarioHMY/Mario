package object;

/**
 * 测试Object中相关方法
 * Object是所有类的顶级超类，里面常被子类重写的方法
 * equals()和toString()
 */
public class Demo {
    public static void main(String[] args) {
        Point p = new Point(1,2);

        /*
        Object定义的方法：
        String toString()
        用于将当前对象转换为一个字符串。很少会主动调用这个方法，多用于输出对象内容使用。
        子类不重写时，默认返回的字符串内容是当前对象的地址信息，实际开发中作用不大。
         */
        String str = p.toString();
        System.out.println(str);
    }
}
