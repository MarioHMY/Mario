package exception;

/**
 * 和异常相关的面试问题
 * 请分别说出:final,finally,finalize
 *
 * finalize是Object中定义的一个方法,它是一个对象生命周期中最后一个被调用的方法.
 * 当一个对象即将被GC回收前,GC会调用该对象的finalize方法,该方法调用完毕后就会被
 * 释放.API手册对该方法有明确说明,此方法不能有耗时的操作,否则会影响GC工作.
 */

public class FinallyDemo3 {
    public static void main(String[] args) {
        System.out.println(
                test("1")+","+test(null)+","+test("")
        );//3,3,3
    }
    public static int test(String str){
        try{
            return str.charAt(0)-'1';
        }catch(NullPointerException e){
            return 1;
        }catch(Exception e){
            return 2;
        }finally{
            return 3;
        }
    }
}
