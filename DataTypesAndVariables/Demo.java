package DataTypesAndVariables;

import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {


        BigDecimal number = new BigDecimal("12.56");

        BigDecimal result = number.subtract(BigDecimal.valueOf(15.8));
        System.out.println(result);
    }
}
