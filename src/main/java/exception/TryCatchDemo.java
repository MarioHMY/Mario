package exception;

/**
 * 异常处理机制中的ret-catch
 * 语法：
 * try{
 *     代码片段
 * }catch(xxxException e){
 *     当前代码中出现XXXException后的解决方法
 * }
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try{
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("出现了空指针异常");
        }

        String str = null;
        /*
        当str为null时，虚拟机执行下面的代码，发现出现了空指针，于是会
        实例化一个NullPointerException,并将报错的位置设置进去，然后将异常抛出。
         */

        System.out.println("程序结束了");
    }
}
