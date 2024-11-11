import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
/*
将字符串相乘划分为与零相乘、正常相乘、带有零前缀的相乘、以及带有'0'-'9'以外字符相乘
 */

public class L2022110504_12_Test {
    /**
     * 测试与零相乘
     */
    @org.junit.Test
    public void testMutiplyzero() {
        String num1 ="0";
        String num2 ="123";
        Solution solution = new Solution();
        assertEquals("0",solution.multiply(num1,num2));
    }
    /**
     * 测试正常相乘
     * 1,一位数相乘
     * 2，一位数多位数相乘
     * 3，多位数相乘
     */
    @org.junit.Test
    public void testMutiplynormal() {
        String num1 ="2";
        String num2 ="3";
        String num3 ="123";
        String num4 ="456";
        Solution solution = new Solution();
        assertEquals("6",solution.multiply(num1,num2));
        assertEquals("246",solution.multiply(num1,num3));
        assertEquals("1368",solution.multiply(num2,num4));
        assertEquals("56088",solution.multiply(num3,num4));
    }
    /**
     * 测试前缀为0
     */
    @org.junit.Test
    public void testMutiplyzerostart() {
        String num1 ="02";
        String num2 ="003";
        String num3 ="0123";
        String num4 ="456";
        Solution solution = new Solution();
        assertEquals("6",solution.multiply(num1,num2));
        assertEquals("246",solution.multiply(num1,num3));
        assertEquals("1368",solution.multiply(num2,num4));
        assertEquals("56088",solution.multiply(num3,num4));
    }
    /**
     * 测试带有其他符号相乘
     */
    @org.junit.Test
    public void testMutiplyotherchar() {
        String num1 ="a2";
        String num2 ="0#3";
        String num3 ="(123";
        String num4 ="456>";
        Solution solution = new Solution();
        assertEquals("null",solution.multiply(num1,num2));
        assertEquals("null",solution.multiply(num1,num3));
        assertEquals("null",solution.multiply(num2,num4));
        assertEquals("null",solution.multiply(num3,num4));
    }
}
