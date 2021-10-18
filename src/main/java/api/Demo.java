package api;

/**
 * @author mario
 */
public class Demo {
    /**
     * sayHello中使用的问候语
     */
    public static final String INFO = "hello";
    /**
     * 为给定用户添加一个问候语
     * @param name 指定的用户名
     * @return 返回含有问候的字符串
     *
     */
    public String sayHello(String name){
        return "hello"+name;
    }
}
