package TextProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger number = new BigInteger(scanner.nextLine());
        byte multiplier = Byte.parseByte(scanner.nextLine());

        BigInteger result = number.multiply(BigInteger.valueOf(multiplier));
        System.out.println(result);
    }
}
