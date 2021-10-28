package thread;

/**
 * 线程提供了一个join方法，可以协调线程的同步运行，它允许调用该方法的线程等待（阻塞），
 * 直到该方法所属线程执行完毕后结束等待（阻塞）继续运行
 *
 * 同步运行：多个线程执行存在先后顺序。
 * 异步运行：多个线程各干各的，线程间运行本来就是异步。
 */
public class JoinDemo {
    //模拟图片是否下载完成
    public static boolean isFinish = false;
    public static void main(String[] args) {
        /*
            当一个方法的局部内部类中引用了这个方法的其他局部变量时，这个变量
            必须是final的。
         */
//        final boolean isFinish = false;
        Thread download = new Thread(){
            @Override
            public void run() {
                for(int i = 1;i<=100;i++){
                    System.out.println("downloading"+i+"%");
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
                System.out.println("down：下载完毕！");
                isFinish = true;
            }
        };

        Thread show = new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println("show:开始显示文字。。。");
                    Thread.sleep(3000);
                    System.out.println("show:显示文字完毕！");

                    /*
                    显示图片前要等待download执行完毕
                     */
                    System.out.println("show:开始等待download");
                    download.join();//show线程阻塞，直到download执行完毕
                    System.out.println("show:等待download完毕");

                    System.out.println("show:开始显示图片。。。");
                    if (!isFinish){
                        throw new RuntimeException("show:显示图片失败！");
                    }
                    System.out.println("show:显示图片完毕！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        download.start();
        show.start();
    }
}
