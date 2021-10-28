package thread;

/**
 * 线程的优先级
 * 线程有十个优先级，分别对应整数1-10
 * 其中1为最低优先级，5是默认优先级，10为最高优先级
 *
 * 线程start后便纳入到线程调度器，线程合适被分配时间片全部听调度器统一安排，因此
 * 只能被动获取时间片，不能主动索取。
 * 改变线程的优先级可以最大程度的改善获取时间片的几率
 * 线程优先级越高的线程，获取时间片的次数越多
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    System.out.println("min");
                }
            }
        };
        Thread norm = new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    System.out.println("nor");
                }
            }
        };
        Thread max = new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    System.out.println("max");
                }
            }
        };
//        min.setPriority(1);
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        min.start();
        norm.start();
        max.start();
    }
}
