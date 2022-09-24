import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        //bytes
        Integer n = input.nextInt();
        //number
        Integer m = input.nextInt();

        BinaryNumber binaryNumber = new BinaryNumber();
        binaryNumber.convertDecimalToBinary(m,n);
        System.out.println(binaryNumber.getNumberInGreysCode());
    }
}
