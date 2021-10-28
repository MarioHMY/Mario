package thread;

/**
 * java中所有的代码都是靠线程运行的，执行main方法的线程称为“主线程”，这条主线程是由虚拟机自动创建的
 *
 * 线程提供了一个方法
 * static Thread currentThread()
 * 该方法可以获取运行这个方法的线程
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        Thread t = new Thread(){
            public void run(){
                Thread t = Thread.currentThread();
                System.out.println("自定义线程："+t);
                dosome();
                System.out.println(t+"执行完run方法！");
            }
        };
        t.start();
        System.out.println("运行main方法的线程是："+main);
        dosome();//让主线程执行dosome方法
        System.out.println(main+"执行完main方法了!");
    }

    private static void dosome() {
        Thread t = Thread.currentThread();
        for(int i = 0;i<1000;i++){
            System.out.println("执行dosome方法的线程是"+t);
        }
    }
}
