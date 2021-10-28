package thread;

/**
 * 获取线程相关信息的方法
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        String name = t.getName();
        System.out.println("name"+name);

        //获取线程的唯一标识
        long id = t.getId();
        System.out.println("id:"+id);

        //获取线程的优先级 1-10之间的整数。默认是5
        int priority = t.getPriority();
        System.out.println("优先级："+priority);

        //线程是否还活着
        boolean isAlive = t.isAlive();
        //是否为守护线程
        boolean isDaemon = t.isDaemon();
        //线程是否被中断
        boolean isInterrupted = t.isInterrupted();

        System.out.println("isAlive"+isAlive);
        System.out.println("isDaemon"+isDaemon);
        System.out.println("isInterrupted"+isInterrupted);
    }
}
