package integer;

/**
 * 包装类常用的功能
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        //1通过包装类可以获取其相对应的基本类型的取值范围
        //获取int的最大值与最小值
        int imax = Integer.MAX_VALUE;
        System.out.println(imax);
        int imin = Integer.MIN_VALUE;
        System.out.println(imin);

        long lmax = Long.MAX_VALUE;
        System.out.println(lmax);
        long lmin = Long.MIN_VALUE;
        System.out.println(lmin);

        double dmax = Double.MAX_VALUE;
        System.out.println(dmax);
        double dmin = Double.MIN_VALUE;
        System.out.println(dmin);

        //2.包装类可以将字符串解析为对应的基本类型
        String s = "123";
        //String s = "123.123";//转换成整数就会报错
        int a = Integer.parseInt(s);
        System.out.println(a);
        double b = Double.parseDouble(s);
        System.out.println(b);
    }
}
