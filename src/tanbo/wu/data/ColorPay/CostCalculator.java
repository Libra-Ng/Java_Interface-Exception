package tanbo.wu.data.ColorPay;
/**
 * @Author:2017110342_吴谭波
 * @Description:计算着色花费
 * @Date: 2019/10/18
 * @Modified By:2017110342_吴谭波
 */

public class CostCalculator {
    private final double borderCost;
    private final double solidCost;

    public CostCalculator(double borderCost, double solidCost) {
        super();
        this.borderCost = borderCost;
        this.solidCost = solidCost;
    }
    public double calculate(Shape2D shape){
        switch (shape.getClass().getSimpleName()) {
            case "Rectangle":
            case "Square":
                return shape.getArea() * solidCost + shape.getPerimeter() * borderCost;
            case "Circle":
                return shape.getPerimeter() * borderCost;
            case "Triangle":
                return shape.getArea() * solidCost;
            default:
                return 0;
        }
    }
}
