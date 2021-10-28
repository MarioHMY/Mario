package thread;

/**
 * 守护线程
 * 守护线程是通过普通线程调用setDaemon(ture)设置而转变的。因此守护线程创建上与普通线程无异
 * 但是结束时机上有一点不同：进程结束。
 * 当Java进程中的所有普通线程都结束时，该进程就会结束，此时会强制杀死所有正在运行的守护线程
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            public void run(){
                for (int i =0;i<5;i++){
                    System.out.println("rose:let me go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("啊啊啊啊啊啊AAAAAAAaaaaaaa...");
                System.out.println("噗通~");
            }
        };

        Thread jack = new Thread(){
            @Override
            public void run() {
                while (true){
                    System.out.println("jack:you jump,i jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
            }
        };
        rose.start();
        jack.setDaemon(true);//设置守护线程必须在线程启动前进行
        jack.start();

        /*
        主线程也是普通线程，如果执行下面的代码，意味着主线程不会结束
        那么就算
         */
    }
}
