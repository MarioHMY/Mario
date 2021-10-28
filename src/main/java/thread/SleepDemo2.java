package thread;

/**
 * sleep方法要求必须处理中断异常：InterruptedException
 * 当一个线程调用Sleep方法处于睡眠阻塞的过程中，它的interrupt()方法被调用时
 * 会中断该阻塞，此时sleep方法会抛出该异常
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread(){
            public void run(){
                System.out.println("林：刚美完容，睡一会吧~");
                try {
                    Thread.sleep(999999);
                } catch (InterruptedException e) {
                    System.out.println("林：干嘛呢干嘛呢！都破相了！");
                }
                System.out.println("林：醒了");
            }
        };
        Thread huang = new Thread(){
            public void run(){
                System.out.println("黄：大锤80，小锤40！开始砸墙！");
                for(int i = 0;i<5;i++){
                    System.out.println("黄：80！");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("黄：哐当！");
                System.out.println("嚓，大哥！搞定");
                lin.interrupt();//中断林的睡眠阻塞
            }
        };
        lin.start();
        huang.start();
    }
}
