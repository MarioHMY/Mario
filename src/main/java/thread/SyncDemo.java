package thread;

/**
 * 多线程并发安全问题    
 * 当多线程操作同一临界资源，由于线程切换的时机不确定，导致操作顺序出现混乱，严重是可能导致系统瘫痪
 * 临界资源：同时只能被单一线程访问操作过程的资源。
 */
public class SyncDemo {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread(){
            public void run() {
                while (true){
                    int bean = table.getBeans();
                    Thread.yield();
                    /*
                        static void yield()
                        线程提供这个静态方法的作用是让执行该方法的线程主动放弃本次时间片。
                        这里使用他的目的是模拟执行到这里CPU没有时间了，发生线程切换，来看并发安全问题的产生。
                     */
                    System.out.println(getName()+":"+bean);
                }
            }
        };

        Thread t2 = new Thread(){
            public void run() {
                while (true){
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        t1.start();
        t2.start();
    }
}

class Table{
    private int beans = 20;

    /**
     * 当一个方法使用synchronized修饰后，这个方法称为同步方法，多个线程不能同时执行该方法。
     * 将多个线程并发操作临界资源的过程改为同步操作就可以有效解决多线程并发安全问题。
     * 相当于多个线程从原来的抢着操作改为排队操作。
     */
    public synchronized int getBeans() {
        if(beans==0){
            throw new RuntimeException("没有豆子了！");
        }
        Thread.yield();
        return beans--;
    }
}
