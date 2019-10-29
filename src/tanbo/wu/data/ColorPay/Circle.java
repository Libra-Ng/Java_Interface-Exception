package tanbo.wu.data.ColorPay;
/**
 * @Author:2017110342_吴谭波
 * @Description:圆形
 * @Date: 2019/10/18
 * @Modified By:2017110342_吴谭波
 */

public class Circle extends Shape2D implements BorderColorable {
    private double radius; //圆的半径
    private boolean isPainted = false;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public void paintBorder() {
        //TODO Auto-generated method stub
        System.out.println("已将圆形的边着色");
        isPainted = true;
    }

    @Override
    public boolean isBorderPainted() {
        //TODO Auto-generated method stub
        return isPainted;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

}
