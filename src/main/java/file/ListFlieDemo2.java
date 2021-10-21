package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 重载的listFiles方法，允许我们传入一个文件过滤器从而可以有条件的获取一个目录中的子项
 */
public class ListFlieDemo2 {
    public static void main(String[] args) {
        /*
        需求：获取当前目录中所有以“."开头的子项
         */
        File dir = new File(".");
        if(dir.isDirectory()){
            FileFilter filter = new FileFilter(){//匿名内部类创建过滤器
                public boolean accept(File file) {
                    String name = file.getName();
                    boolean starts = name.startsWith(".");//名字是否以"."开始
                    System.out.println("过滤器过滤:"+name+",是否符合要求:"+starts);
                    return starts;
                }
            };
             File[] subs = dir.listFiles(filter);//方法内部会调用accept方法
            System.out.println(subs.length);
        }
    }
}
