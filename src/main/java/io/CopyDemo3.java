package io;

import java.io.*;

/**
 * 使用缓冲流完成文件的读写
 *
 * 缓冲流：java.io.BufferedInputStream和BufferedOutStream
 * 它们是一对高级流，在流连接中的作用是加快读写速度
 *
 * 缓冲流内部为一个和缓冲区，默认长度为8k。
 * 缓冲区最终会将读写数据统一转换为块读写来保证读写速率。
 */
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("xrk.exe");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("xrk_cp.exe");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int d;
        while ((d = bis.read()) !=-1){
            bos.write(d);
        }
        System.out.println("复制完毕");
        bis.close();
        bos.close();
    }
}
