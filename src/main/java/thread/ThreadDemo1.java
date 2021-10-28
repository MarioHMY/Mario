package thread;

/**
 * 多线程
 * 线程：程序中一个单一顺序执行过程
 * 多线程：多个单一顺序执行流程“同时”执行
 *
 * 多线程改变了代码执行方式，从原来的单一顺序执行流程变成为多个执行流程“同时 ”执行。
 * 可以让多个代码片段的执行互不打扰
 *
 * 线程之间是并发执行的，并非真正意义上的同时运行
 * 常见线程有两种方式：
 * 1.继承Thread并重写run方法
 *
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
        /*
            启动线程,注意:不要调用run方法！！
            线程调用完start方法后会纳入到系统的线程调度器程序中被统一管理。
            线程调度器会分配时间片段给线程，使得CPU执行该线程这段时间，用完后
            线程调度器会再分配一个时间片段给一个线程，如此反复，使得多个线程
            都有机会执行一会，做到走走停停，并发运行。
            线程第一次被分配到时间后会执行它的run方法开始工作。
         */
        t1.start();
        t2.start();
    }

}
/**
 * 第一种创建线程的优点:
 * 结构简单，利于匿名内部类形式创建。
 *
 * 缺点:
 * 1:由于java是单继承的，这会导致继承了Thread就无法再继承其他类去复用方法
 * 2:定义线程的同时重写了run方法，这等于将线程的任务定义在了这个线程中导致
 *   线程只能干这件事。重(chong)用性很低。
 */
class MyThread1 extends Thread{
    public void run(){
        for(int i = 1;i<100;i++){
            System.out.println("asdfghjkl");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i = 1;i<100;i++){
            System.out.println("lkjhgfdsa");
        }
    }
}
