package file;

import java.io.File;

/**
 * java.io.File
 * file的每一个实例用于表示硬盘上的文件或目录
 * 使用File可以
 * 1.访问其表示的文件或目录的属性
 * 2.操作文件或目录（创建或删除）
 * 3.访问一个文件目录的所有子项
 * */
public class FileDemo {
    public static void main(String[] args) {
        //使用File访问当前目录下的demo.txt文件
        /*
        创建File时要指定路径，而路径通常使用相对路径。
        相对路径的好处在于有良好的看跨平台性。
        “./”是相对路径中使用最多的，表示在“当前目录”，而当前目录是哪里取决于程序运行的环境而定的，
        在IDEA中运行Java程序时，这里指定的当前目录就是当前程序所在的项目目录。
         */
        File file = new File("./demo.txt");
        //获取名字
        String name = file.getName();
        System.out.println(name);
        //获取文件大小（单位是字节）
        long len = file.length();
        System.out.println(len);

        boolean cr = file.canRead();
        boolean cw = file.canWrite();
        System.out.println("是否可读:"+cr);
        System.out.println("是否可写:"+cw);
    }
}
