import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //get t
        Scanner input = new Scanner(System.in);
        int  t = input.nextInt();

        int n = 0;
        String factorial = "";

        for(int i = 0; i < t; i++){
            //get n
            n = input.nextInt();
            //converting factorial to string
            factorial = String.valueOf(getFactorial(n));

            System.out.println(getLastNonZeroNumber(factorial));
        }
    }
    private static String getLastNonZeroNumber(String factorial){
        String output = "";
        for(int i = factorial.length() - 1; i >= 0; i--){

            if(factorial.charAt(i) != '0'){
                output += factorial.charAt(i);
                return output;
            }
        }
        return null;
    }
    private static int getFactorial(Integer number){
        int output = 1;
        for(int i = 1; i <= number ; i++){
            output = output * i;
        }
        return output;
    }
}
