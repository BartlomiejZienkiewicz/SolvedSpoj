import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int C = input.nextInt();
        for(int i = 0 ; i < C; i++){
            int n = input.nextInt();
            System.out.println(getResult(n));
        }
    }

    private static int getResult(int number) {

        int evenDividers = 0;
        int unevenDividers = 0;

        int actualNumber = number + 1;
        while (true){
            evenDividers = 0;
            unevenDividers = 0;
            for(int i = 1; i <= actualNumber; i++){

                if(actualNumber % i == 0){
                    if(i % 2 == 0){
                        evenDividers++;
                    }
                    else {
                        unevenDividers++;
                    }

                }
            }
            if(evenDividers == unevenDividers){
                break;
            }

            actualNumber++;
        }



        return actualNumber;
    }


}
