package tanbo.wu.data.ColorPay;
/**
 * @Author:2017110342_吴谭波
 * @Description: BorderColorable 接口
 * @Date: 2019/10/26
 * @Modified By:2017110342_吴谭波
 */

public interface BorderColorable {
    public void paintBorder();  //输出"已经将xx形状的边着色"
    public boolean isBorderPainted();  //返回形状的边是否已经着色
}
