package lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * JDK之后Java支持了lambda表达式这个特性
 * lambda表达式可以用更精简的语法创建匿名内部类，但是实现的接口只能有一个抽象方法，否则无法使用。
 * lambda表达式是编译器认可的，最终会被改为内部类编译到class文件中。
 */
public class LambdaDemo {
    public static void main(String[] args) {
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().startsWith(".");
            }
        };

        //lambda表达式中 参数的类型可以忽略不写
        FileFilter filter2 = (File file)->{
          return file.getName().startsWith(".");
        };

        //lambda表达式方法体中若只有一句代码，则{}可以省略
        //如果这句话有return关键字，那么也要一并删除
        FileFilter filter3 = (File file)->file.getName().startsWith(".");
    }
}
