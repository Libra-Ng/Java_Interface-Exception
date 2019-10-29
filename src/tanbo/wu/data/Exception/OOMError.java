package tanbo.wu.data.Exception;
/**
 * @Author:2017110342_吴谭波
 * @Description:实现对OOM异常的捕获
 * @Date: 2019/10/18
 * @Modified By:2017110342_吴谭波
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class OOMError {
    static List<UUID> list;

    public static void main(String[] args) {
        System.out.println("占用前虚拟机的总内存是" + Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");
        System.out.println("占用前虚拟机的空闲内存是" + Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");
        try {
            list = new ArrayList<UUID>();
            while (true) {
                list.add(UUID.randomUUID());
            }
        }
         catch (OutOfMemoryError e){
             System.out.println("占用后虚拟机的总内存是" + Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");
             System.out.println("占用后虚拟机的空闲内存是" + Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");
            }
        finally {
            System.out.println("正在进行恢复错误");
            list.clear();
            Runtime.getRuntime().gc();
        }
    }
}
