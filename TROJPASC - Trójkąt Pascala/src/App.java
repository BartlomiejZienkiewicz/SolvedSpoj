import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //getting t
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for(int i = 0; i < t ; i++){
            //getting n
            int n = input.nextInt();

            // adding two first cases because it simplifies algorithm
            if(n == 0){
                System.out.println("1");
            }
            else if(n == 1){
                System.out.println("1  1");
            }
            else{
                //creating new list to start with line 2 of pascals triangle
                List<Integer> integerList = new ArrayList<>();
                integerList.add(1);
                integerList.add(2);
                integerList.add(1);

                List<Integer> integerList2 = new ArrayList<>();

                //size of line is 4 because lowest n in this else operator is 3 and number of elements is n + 1
                int sizeOfLine = 4;

                for(int j = 2; j < n ; j++){
                    for(int k = 0; k < sizeOfLine; k++){
                        //in every line first and the last element are 1
                        if(k == 0){
                            integerList2.add(1);
                        }
                        else if(k == sizeOfLine - 1){
                            integerList2.add(1);
                            break;
                        }
                        //for k e(1 < k < sizeOfLine-1), k equals (k+1) + k elements from integerList
                        else{
                            integerList2.add(integerList.get(k) + integerList.get(k-1));
                        }
                    }
                    integerList.clear();
                    integerList.addAll(integerList2);
                    integerList2.clear();
                    sizeOfLine++;

                }
                System.out.println(integerList);

            }

        }
    }
}
