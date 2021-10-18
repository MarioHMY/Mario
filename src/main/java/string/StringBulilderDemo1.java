package string;

/**
 *为了解决修改字符串性能低下的问题，java提供了专门用于修改字符串的API:StringBuilder
 *StringBuilder内部维护一个可变的char数组，修改内容性能优异。
 *并且提供了便于修改字符串内容的相关方法(增删改插)。
 */
public class StringBulilderDemo1 {
    public static void main(String[] args) {
        String line = "好好学习java";
        //内部表示一个空字符串
        //StringBuilder builder = new StringBuilder();
        //将给定的字符串内容复制到StringBuilder中
        StringBuilder builder = new StringBuilder(line);
        /*
        好好学习java
        好好学习java,为了找个好工作
        append():将给定的内容追加到字符串末尾
         */
        builder.append(",为了找个好工作");
        System.out.println(line);
        System.out.println(builder);

        /*
        好好学习java
        好好学习java,为了找个好工作
        好好学习java,就是为了改变世界
        replace():替换部分内容
         */
        builder.replace(9,16,"就是为了改变世界");
        System.out.println(builder);

        /*
        好好学习java
        好好学习java,为了找个好工作
        好好学习java,就是为了改变世界
        ,就是为了改变世界
        delete():删除部分内容
         */
        builder.delete(0,8);
        System.out.println(builder);

        /*
        reverse():反转字符
         */
    }
}
