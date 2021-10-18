package integer;

/**
 * 包装类
 * 包装类是为了解决基本类型不能直接参与面向对象开发（没有面向对象的三大特征），因此，
 * 包装类可以让基本类型以“对象”的形式存在
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        int i = 123;
        //java不推荐用new创建包装类
        Integer i1 = new Integer(i);
        Integer i2 = new Integer(i);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));

        //重用1字节之内的整数对象（-128-127）
        Integer i3 = Integer.valueOf(i);
        Integer i4 = Integer.valueOf(i);
        System.out.println(i3==i4);
        System.out.println(i3.equals(i4));

        //Double的valueOf内部就是直接new对象
        Double d1 = Double.valueOf(123.123);
        Double d2 = Double.valueOf(123.123);
        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));

        //包装类转换回基本类型
        int ii = i1.intValue();
        double dd = i1.doubleValue();
        System.out.println(ii);
        System.out.println(dd);

        ii = d1.intValue();//大类型转小类型会丢精度
        dd = d1.doubleValue();
        System.out.println(ii);
        System.out.println(dd);
    }
}
