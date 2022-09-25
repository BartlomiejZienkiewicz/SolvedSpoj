import java.lang.Math;


public class BinaryDate {
    String value;

    public BinaryDate(String input) {
        this.value = input;
    }
    public String convertToISO8601(){
        String binaryYear = value.substring(0,7);
        String binaryMonth = value.substring(7,11);
        String binaryDay = value.substring(11,16);

        int decimalYear = convertBinaryToDecimal(binaryYear);
        int decimalMonth = convertBinaryToDecimal(binaryMonth);
        int decimalDay = convertBinaryToDecimal(binaryDay);

        if(decimalMonth == 0 || decimalDay == 0){
            return "Error";
        }

        String output = (1980 + decimalYear) + "-" + decimalMonth + "-" + decimalDay;


        return output;
    }
    private int convertBinaryToDecimal(String binary){

        double output = 0;
        Integer power = 0;

        for(int i = binary.length()-1; i >= 0; i--){
            if(binary.charAt(i) == '1'){
                output += Math.pow(2,power);
            }
            power++;
        }

        int integerOutput = (int)output;

        return integerOutput;
    }

}
