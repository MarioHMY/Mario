package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个新文件
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        //在当前目录新建一个文件test.txt
        File file = new File("./test.txt");
        /*
        boolean exists()
        判断当前File表示的路径所在位置是否存在该文件或目录，存在则返回true
         */
        if(file.exists()){
            System.out.println("该文件已存在！");
        }else{
            file.createNewFile();
            System.out.println("文件已创建！");
        }
    }
}
