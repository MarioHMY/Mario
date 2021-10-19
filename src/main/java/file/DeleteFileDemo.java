package file;

import java.io.File;

/**
 * 使用File删除文件
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        //将当前路径下的test.txt文件删除
        /*
        相对路径中的“./”可以忽略不写，默认就是从当前目录开始的
         */
        File file = new File("test.txt");
        if(file.exists()){
            file.delete();//删除该文件
            System.out.println("文件已删除！");
        }else {
            System.out.println("文件不存在！");
        }
    }
}
