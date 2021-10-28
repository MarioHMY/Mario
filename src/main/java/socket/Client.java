package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {
    /*
    java.net.Socket套接字
    Scoket封装了TCP协议的通讯细节，我们通过它可以与远端计算机建立链接
    并通过它获取两个流（一个输入，一个输出），然后对两个流的数据读写完成
    与远端计算机的数据交互工作。
    我们可以把Socket想象成一个电话，电话有一个听筒（输入流），一个麦克风
    （输入流）通过它们就可以与对方交流了。
     */
    private Socket socket;
    /**
     * 构造方法，用来初始化客户端
     */
    public Client(){
        try {
            System.out.println("正在连接服务端...");
            /*
                实例化Socket时要传入两个参数
                参数1:服务端的地址信息
                     可以是IP地址，如果链接本机可以写"localhost"
                参数2:服务端开启的服务端口
                我们通过IP找到网络上的服务端计算机，通过端口链接运行在该机器上
                的服务端应用程序。
                实例化的过程就是链接的过程，如果链接失败会抛出异常:
                java.net.ConnectException: Connection refused: connect
             */
            socket = new Socket("192.168.4.9",8088);
            System.out.println("与服务端建立连接!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 客户端开始工作的方法
     */
    public void start(){
        try {
             /*
                Socket提供了一个方法:
                OutputStream getOutputStream()
                该方法获取的字节输出流写出的字节会通过网络发送给对方计算机。
             */
            //低级流，将字节通过网络发送给对方
            OutputStream out = socket.getOutputStream();
            //高级流，负责衔接字节流与字符流，并将写出的字符按指定字符集转字节
            OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
            //高级流，负责块写文本数据加速
            BufferedWriter bw = new BufferedWriter(osw);
            //高级流，负责按行写出字符串，自动行刷新
            PrintWriter pw = new PrintWriter(bw,true);

            Scanner scanner = new Scanner(System.in);
            while (true){
                String line = scanner.nextLine();
                if("exit".equalsIgnoreCase(line)){
                    break;
                }
                pw.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                 /*
                    通讯完毕后调用socket的close方法。
                    该方法会给对方发送断开信号。
                 */

                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
