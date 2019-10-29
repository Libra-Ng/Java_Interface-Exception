package tanbo.wu.data.ColorPay;
/**
 * @Author:2017110342_吴谭波
 * @Description:正方形
 * @Date: 2019/10/18
 * @Modified By:2017110342_吴谭波
 */

public class Square extends Rectangle{
    private double length;
    public Square(double length) {
        super(length, length);
        this.length = length;
    }
}
