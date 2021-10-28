package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 聊天室服务端
 */
public class Server {
    /**
     * 运行在服务器端的severSocket主要完成两个工作：
     * 1：向服务端操作系统申请服务端口，客户端就是通过这个端口与ServerSocket建立链接
     * 2：监听端口，一旦一个客户端建立链接，会立即返回一个Socket。通过这个Socket就可以和该客户端交互了
     *
     * 我们可以把ServerSocket想象成某客服的"总机"。用户打电话到总机，总机分配一个电话使得服务端与你沟通。
     */
    private ServerSocket serverSocket;
    /**
     * 服务端构造方法用来初始化
     */
    public Server(){
        try {
            System.out.println("正在启动服务端...");
            /*
                实例化ServerSocket时要指定服务端口，该端口不能与操作系统其他
                应用程序占用的端口相同，否则会抛出异常:
                java.net.BindException:address already in use

                端口是一个数字，取值范围:0-65535之间。
                6000之前的的端口不要使用，密集绑定系统应用和流行应用程序。
             */
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 服务端开始工作方法
     */
    public void start(){
        try {
            while (true){
                System.out.println("等待客户端链接...");
                /*
                ServerSocket提供了接受客户端链接的方法：
                socket accpet()
                这个方法是一个阻塞方法，调用后方法"卡住"，此时开始等待客户端
                的链接，直到一个客户端链接，此时该方法会立即返回一个Socket实例
                通过这个Socket就可以与客户端进行交互了。

               可以理解为此操作是接电话，电话没响时就一直等。
                 */
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端连接了");
                //启动一个线程与该客户端交互
                ClientHandler clientHandler = new ClientHandler(socket);
                Thread t = new Thread(clientHandler);
                t.start();
        }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * 定义线程任务
     * 目的是让一个线程完成与特定客户端交互工作
     */
    private class ClientHandler implements Runnable{

        private Socket socket;
        private String host;//记录客户端ip地址

        public ClientHandler(Socket socket){
            this.socket = socket;
            //通过socket获取远端计算机地址信息
            host = socket.getInetAddress().getHostAddress();

        }
        @Override
        public void run() {
            try {
                 /*
                Socket提供方法：
                InputStream getInputStream()
                获取的字节输入流读取的是对方计算机发送过来的字节
                */
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in,"UTF-8");
                BufferedReader br = new BufferedReader(isr);

                String message = null;
                while ((message= br.readLine())!=null){
                    System.out.println(host+"说："+message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
