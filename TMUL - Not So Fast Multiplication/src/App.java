import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //getting number of pairs
        Scanner input = new Scanner( System.in );
        Integer numberOfPairs = input.nextInt();

        for(int i = 0; i < numberOfPairs; i++){

            //getting numbers
            BigInteger  firstNumber = BigInteger.valueOf(input.nextInt());
            BigInteger secondNumber = BigInteger.valueOf(input.nextInt());

            System.out.println(firstNumber.multiply(secondNumber));
        }
    }
}
