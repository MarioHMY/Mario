package integer;

/**
 * JDK5之后，java推出了一个新的特性:自动拆装箱
 * 该特性是编译器认可的，当编译器编译源代码时发现有基本类型和引用类型相互赋值操作
 * 时会补充代码将基本类型与对应的包装类相互转换。
 */
public class IntegerDemo3 {
    public static void main(String[] args) {
        int i = 123;
        /*
            触发了编译器的自动装箱特性，代码会被编译器改为
            Integer in = Integer.valueOf(i);
         */
        Integer in = i;
        /*
            触发了自动拆箱特性，代码会被编译器改为:
            i = in.intValue();
         */
        i = in;

    }
}
