import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static List<Integer> dividers = new ArrayList<>();

    //pamiętaj o do while!
    public static void main(String[] args) {
        //getting number of cases
        Scanner input = new Scanner(System.in);

        Integer numberOfCases = input.nextInt();

        for(int i = 0 ; i < numberOfCases; i++){
            Integer numberOfCase = input.nextInt();
            System.out.println(eulersFunctionResult(numberOfCase));
        }
    }

    private static int eulersFunctionResult(Integer numberOfCase) {
        Integer result = 0;
        //if number is prime then result of function is number - 1
        if(isNumberPrime(numberOfCase)){
            return numberOfCase - 1;
        }
        else{
            //getting dividers of number
            dividers = getDividersOfNumber(numberOfCase);

            for(int i = 1; i < numberOfCase ; i++){
                if(isNumberCoprime(i)){
                    result++;
                }
            }
        }
        return result;
    }

    private static List<Integer> getDividersOfNumber(Integer number) {
        List<Integer> output = new ArrayList<>();
        for(int i = 2; i < number; i++){
            if(number%i == 0){
                output.add(i);
            }
        }
        return output;
    }

    private static boolean isNumberPrime(int number) {

        if(number == 1){
            return true;
        }
        if(number == 2){
            return false;
        }
        if(number == 2){
            return true;
        }

        for(int k = 2; k < number; k++ ){
            if(number % k == 0){
                return false;
            }
        }
        return true;
    }

    private static boolean isNumberCoprime(int number){
        for(Integer divider: dividers){
            if(number%divider == 0){
                return false;
            }
        }
        return true;
    }


}
