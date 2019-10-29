package tanbo.wu.data.ColorPay;
/**
 * @Author:2017110342_吴谭波
 * @Description:对着色计算功能的测试
 * @Date: 2019/10/26
 * @Modified By:2017110342_吴谭波
 */

public class ColorPayTest {
    public static void main(String[] args){
        CostCalculator cost = new CostCalculator(2,3);
        Rectangle rec = new Rectangle(4,5);
        System.out.println("The cost of this rectangle is " + cost.calculate(rec));
        Square sq = new Square(2);
        System.out.println("The cost of this square is " + cost.calculate(sq));
        Triangle tri = new Triangle(3,4,5);
        System.out.println("The cost of this triangle is " + cost.calculate(tri));
        Circle cir = new Circle(7);
        System.out.println("The cost of this circle is " + cost.calculate(cir));
    }
}
