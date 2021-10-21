package io;

/**
 * 文件输入流，用于从文件中读取数据
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 读取
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        //读取fos.dat中的值
        FileInputStream fis = new FileInputStream("./fos.dat");
        /*
            int read()
            从文件中读取一个字节，并以int形式返回。读取到的字节存到了返回的
            int值对应的2进制的"低八位"上，前面24为补0.
            如果返回值对应的10进制为-1则表示读取到了文件末尾。
         */
        /*
            fos.dat文件数据:(FOSDemo1执行后写入的文件内容)
            00000001 00000010
            ^^^^^^^^

            fis.read()返回的int值2进制:
            00000000 00000000 00000000 00000001
         */
        int d = fis.read();
        System.out.println(d);
        /*
            fos.dat文件数据:(FOSDemo1执行后写入的文件内容)
            00000001 00000010
                     ^^^^^^^^
            fis.read()返回的int值2进制:
            00000000 00000000 00000000 00000010
         */
        d = fis.read();
        System.out.println(d);
        /*
            fos.dat文件数据:(FOSDemo1执行后写入的文件内容)
            00000001 00000010 文件末尾!!
                              ^^^^^^^^
            fis.read()返回的int值2进制:
            11111111 11111111 11111111 11111111
         */
        d = fis.read();
        System.out.println(d);
        fis.close();
    }
}
