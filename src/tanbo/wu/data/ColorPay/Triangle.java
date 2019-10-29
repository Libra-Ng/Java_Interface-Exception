package tanbo.wu.data.ColorPay;
/**
 * @Author:2017110342_吴谭波
 * @Description:三角形
 * @Date: 2019/10/18
 * @Modified By:2017110342_吴谭波
 */

public class Triangle extends Shape2D implements SolidColorable{
    private double a;
    private double b;
    private double c;
    private boolean isPainted = false;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double p = (a + b + c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public void paintShape() {
        System.out.println("已将三角形进行着色");
        isPainted = true;
    }

    @Override
    public boolean isShapePainted() {
        return isPainted;
    }
}
