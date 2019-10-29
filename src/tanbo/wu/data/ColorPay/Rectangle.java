package tanbo.wu.data.ColorPay;
/**
 * @Author:2017110342_吴谭波
 * @Description:矩形
 * @Date: 2019/10/18
 * @Modified By:2017110342_吴谭波
 */

public class Rectangle extends Shape2D implements BorderColorable,SolidColorable{
    private double length;
    private double width;
    private boolean isShapePainted = false;
    private boolean isSlidePainted = false;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void paintBorder() {
        System.out.println("已将矩形的边进行着色");
        isSlidePainted = true;
    }

    @Override
    public boolean isBorderPainted() {
        return isSlidePainted;
    }

    @Override
    public double getPerimeter() {
        return 2*(length + width);
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public void paintShape() {
        System.out.println("已将矩形进行着色");
        isShapePainted = true;
    }

    @Override
    public boolean isShapePainted() {
        return isShapePainted;
    }
}
