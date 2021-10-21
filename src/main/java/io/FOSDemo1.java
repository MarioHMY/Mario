package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JAVA IO
 * IO:Input和Output即：输入输出
 * Java将读写操作按照方向划分为输入与输出
 * 输入：从外界到程序的方向，用来读取外界的数据。
 * 输出：从程序到外界的方向，用于读写数据到外界
 *
 * java将用于读取和写出的类比喻为“流”，即：“stream”
 * 流形象比喻了读取数据的形式，像水流，电流一样，相同一侧顺序移动的过程。只不过Java中的流，流动的是字节（2进制数据）
 * 我们可以理解为Java中的流是连接程序另一端的“管道”
 *
 *
 *
 * java将流划分为两类：节点流与处理流
 * 节点流：也称为低级流，是真实链接程序与另一端的管道，负责实际搬运数据的流。读写数据一定是建立在节点流基础上进行的。
 *
 */
public class FOSDemo1 {
    public static void main(String[] args) throws IOException {
        //向文件fos.dat中写入字节
        /*
            常见构造器。文件流创建时若指定的文件不存在会自动将其创建出来。
            FileOutputStream(String path)
            FileOutputStream(File file)
            上述创建方式为覆盖模式。即:文件流创建时若指定的文件已经存在时，会
            将该文件原有数据清除掉。然后将新写入的内容保存到文件中。



         */
//        File file = new File("./fos.dat");
//        FileOutputStream fos = new FileOutputStream(file);

        FileOutputStream fos = new FileOutputStream("./fos.dat");
        System.out.println("流创建完毕!");
        /*
            void write(int d)
            向文件中写入一个字节，写入的是给定的int值对应的2进制的"低8位"
         */
        /*
            fos.write(1);
            int型 1 的2进制:
                                       vvvvvvvv
            00000000 00000000 00000000 00000001
            执行后fos.dat文件中的数据为:
            00000001
         */
        fos.write(1);
        /*
            fos.write(2);
            int型 2 的2进制:
                                       vvvvvvvv
            00000000 00000000 00000000 00000010
            执行后fos.dat文件中的数据为:
            00000001 00000010
         */
        fos.write(2);
        System.out.println("写出完毕!");
        fos.close();//流用完了必须关闭!
    }
}
