package thread;

/**
 * 使用匿名内部类完成线程的两种创建
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        //第一种
        Thread t1 = new Thread(){
            public void run(){
                for(int i = 1;i<100;i++){
                    System.out.println("lkjhgfdsa");
                }
            }
        };
        t1.start();
        //第二种
//        Runnable r2 = new Runnable(){
//            public void run(){
////             for (int i=1;i<100;i++){
//                System.out.println("修水龙头的！");
//            }
//            }
//        };

        Runnable r1 = () -> {
            for (int i=1;i<100;i++){
                System.out.println("修水龙头的！");
            }
        };

    }
}

