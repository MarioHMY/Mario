package thread;

/**
 * 第二种创建线程的方式
 * 实现Runnable接口单独定义线程任务
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        //实例化任务
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable2();
        //创建线程并指派任务
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
class MyRunnable1 implements Runnable{
    public void run(){
        for (int i=1;i<100;i++){
            System.out.println("你是谁呀？");
        }
    }
}
class MyRunnable2 implements Runnable{
    public void run(){
        for (int i=1;i<100;i++){
            System.out.println("修水龙头的！");
        }
    }
}
