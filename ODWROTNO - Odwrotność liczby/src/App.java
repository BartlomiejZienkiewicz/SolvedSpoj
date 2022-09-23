import java.util.Scanner;

public class App {


    private static boolean isThisPrimeNumber(Integer number){

        if(number < 2){
            return false;
        }
        else if (number == 2 || number == 3){
            return true;
        }
        else {
            for(int i = 2 ; i < number ; i++){
                if(number % i == 0){
                    return false;
                }
            }
            return true;
        }

    }


    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        //getting number of cases
        Integer testCases = 0;
        do{
            testCases = input.nextInt();
        }while (testCases < 1 || testCases > 100);

        for(int i = 0 ; i < testCases; i++){

            //getting p varaible
            Integer p = 0;
            do{
                p = input.nextInt();
            }while (p > 1000000000 || isThisPrimeNumber(p) == false);

            //getting n variable
            Integer n = 0;
            do{
                n = input.nextInt();
            }while (n < 1 || n >= p - 1);

            Integer m = 0;
            //looking for m
            for (int j = 1; j < p - 1; j++){
                if(n * j % p == 1){
                    m = j;
                    break;
                }
            }
            System.out.println(m);

        }


    }
}
