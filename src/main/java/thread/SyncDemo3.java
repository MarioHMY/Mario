package thread;

/**
 * 静态方法上如果使用synchronized，则该方法一定具有同步效果
 *
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Boo boo = new Boo();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                Boo.dosome();
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                Boo.dosome();
            }
        };
        t1.start();
        t2.start();
    }
}
class Boo{
    /**
     * synchronized在静态方法上使用时，指定的同步监视器对象为当前类的对象。
     * 即：class实例。
     * 在JVM中，每个被加载的类都有且只有一个class的实例与之对应，后面讲反射知识点的时候会介绍类对象。
     */
    public static void dosome(){
        /*
            静态方法中使用同步块时，指定同步监视器对象通常还是用当前类的类对象
            获取方式为：类名.class
         */
        synchronized (Boo.class){
            Thread t = Thread.currentThread();
            try {
                System.out.println(t.getName()+"正在执行dosome方法");
                Thread.sleep(5000);
                System.out.println(t.getName()+"执行dosome方法完毕");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
