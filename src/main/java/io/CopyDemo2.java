package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 通过每次读写的数据量，减少实际读取的次数，可以提高读写效率。
 * 单字节读写是一种随机读写形式。而一组一组读写是块读写形式
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        //使用块读写形式完成文件复制
        //创建文件输入流读取原文件
        FileInputStream fis = new FileInputStream("Image.png");
        //创建文件输出流写复制文件

        FileOutputStream fos = new FileOutputStream("Image_cp.png");

        /*
            流提供了块读写的方法
            int read(byte[] data)
            一次性从文件中读取给定的字节数组总长度的字节量，并存入到该数组中。
            返回值为实际读取到的字节量。若返回值为-1则表示读取到了文件末尾。

            文件数据
            11001100 11110000 10101010 00001111 00110011
            ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
            int d;
            byte[] data = new byte[3];
            [00000000 00000000 00000000]
            第一次调用
            d = fis.read(data);
            [11001100 11110000 10101010]
            d = 3 本次读取到了3个字节

            文件数据
            11001100 11110000 10101010 00001111 00110011
                                       ^^^^^^^^ ^^^^^^^^
            第二次调用
            d = fis.read(data);//仅读取了最后两个字节
            [00001111 00110011 10101010]//前两个字节为本次读取的内容
             ^^^^^^^^ ^^^^^^^^
            d = 2 本次读取到了2个字节

            文件数据
            11001100 11110000 10101010 00001111 00110011 文件末尾!
                                                         ^^^^^^^^
            第三次调用
            d = fis.read(data);//一个字节都没有读取到
            [00001111 00110011 10101010]数组没变化
            d = -1 文件末尾



            块写操作
            void write(byte[] data)
            一次性将给定的字节数组所有字节写入到文件中

            void write(byte[] data,int offset,int len)
            一次性将给定的字节数组从下标offset处开始的连续len个字节写入文件

         */
        int len;
         /*
            00000000  1byte   8位2进制称为1字节
            1024byte  1kb
            1024kb    1mb
            1024mb    1gb
         */
        byte[] data = new byte[1024*10];
        long start = System.currentTimeMillis();
        while ((len = fis.read(data)) != -1){
            fos.write(data,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕！耗时"+(end-start)+"ms");
        fis.close();
        fos.close();
    }
}
