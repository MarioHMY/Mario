package io;

import java.io.*;

/**
 * 缓冲流输出流写出数据时效性的问题（缓冲区问题）
 */
public class BOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String line = "今（21日）晚，北京公安局官方微博“平安北京”发布通报，\n" +
                "称李某迪因嫖娼被警方拘留。经人民日报证实，李某迪正是青年钢琴家李云迪。\n" +
                "此消息一出，公众一片哗然。很难想象，儒雅帅气、文质彬彬的钢琴家怎么和嫖娼扯上了关系？\n" +
                "毫无疑问，李云迪的艺术生涯会因为这次嫖娼行为画上句号。\n" +
                "令人惋惜之余，也不得不让人思考：尽管相关部门三令五申，多次下发对劣迹艺人封杀的通知，\n" +
                "但即使面对艺术生涯终结的可能，明星艺人为什么还是管不住自己？";
        byte[] data = line.getBytes();
        bos.write(data);

        /*
            void flush()
            将缓冲流的缓冲区中已缓存的数据一次性写出。
            注:频繁调用该方法会提高写出的次数降低写出效率。但是可以换来写出
               数据的即时性。

            flush方法是被定义在了输出流的超类上了，这意味着所有的输出流都有flush
            方法，目的是在流连接中传递flush操作给缓冲输出流。
            其他高级流的flush中只是调用了它链接的流的flush.
         */
        //bos.flush();//主动把活干完
        System.out.println("写出完毕");

         /*
            缓冲流的close操纵中会自动调用一次flush,确保所有缓存的数据会被写出
         */
        bos.close();
    }
}
