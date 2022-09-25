import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //input is binary form
        if(input.length() == 16){
            BinaryDate binaryDate = new BinaryDate(input);
            System.out.println(binaryDate.convertToISO8601());
        }

        //input is ISO 8601
        else if(input.length() == 10){
            Date date = new Date(input);
            System.out.println(date.convertToBinary());
        }
        else {
            System.out.println("Error");
        }

    }
}
